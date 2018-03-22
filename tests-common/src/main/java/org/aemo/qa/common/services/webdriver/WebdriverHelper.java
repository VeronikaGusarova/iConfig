/*
* Copyright 2002 - 2017 the original author or authors.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.aemo.qa.common.services.webdriver;

import org.aemo.qa.common.services.attachments.Attachments;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.String.valueOf;

@Component
@Lazy
public class WebdriverHelper {
    @Value("${webdriver.explicit.timeout:30000}")
    private int timeout;

    @Autowired
    @Lazy
    private WrappedWebdriver driver;

    @Autowired
    @Lazy
    private Attachments attachments;

    private static final String LOG_EXECUTION_TIME = "{} Execution_Time(ms):; {}; Page_URL:; {};";
    /**
     * JavaScript code to check if all the ajax requests completed
     */
    private static final String JS_AJAX_PROGRESS =
            "var userWindow = window;" +
                    "var docReady = window.document.readyState == 'complete';" +
                    "var isJqueryComplete = typeof(userWindow.jQuery) != 'function' || userWindow.jQuery.active == 0;" +
                    "var isPrototypeComplete = typeof(userWindow.Ajax) != 'function' || userWindow.Ajax.activeRequestCount == 0;" +
                    "var isDojoComplete = typeof(userWindow.dojo) != 'function' || userWindow.dojo.io.XMLHTTPTransport.inFlight.length == 0;" +
                    "var result = docReady && isJqueryComplete && isPrototypeComplete && isDojoComplete;" +
                    "return result;";
    /**
     * JavaScript code to check if all the animation completed
     */
    private static final String JS_ANIMATION_PROGRESS =
            "var anim = 0; var anim = $(':animated'); " +
                    "return anim.length == 0";
    private static final ExpectedCondition<Object> isAJAXCompleted = new ExpectedCondition<Object>() {
        @Override
        public Boolean apply(WebDriver webDriver) {
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            return Boolean.parseBoolean(js.executeScript(JS_AJAX_PROGRESS).toString());
        }
    };
    private static final ExpectedCondition<Object> isAnimated = new ExpectedCondition<Object>() {
        @Override
        public Boolean apply(WebDriver webDriver) {
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            return Boolean.parseBoolean(js.executeScript(JS_ANIMATION_PROGRESS).toString());
        }
    };
    private final Logger log = LoggerFactory.getLogger(this.getClass().getName());

    public void waitForPageUpdated() {
        long startTime = System.currentTimeMillis();
        try {
            Wait<WebDriver> wait = new WebDriverWait(driver.getWrappedDriver(), timeout / 7000, 20);
            wait.until(isAJAXCompleted);
//            wait.until(isAnimated);
            driver.manage().timeouts().setScriptTimeout(timeout, TimeUnit.MILLISECONDS);
        } finally {
            log.info(LOG_EXECUTION_TIME, "Wait_For_Page_Update", getExecutionTime(startTime), driver.getCurrentUrl());
        }
    }

    public void click(WebElement webElement) {
        long startTime = System.currentTimeMillis();
        try {
            //waitForPageUpdated();
            waitForElementToBeClickable(webElement);
            webElement.click();
            waitForPageUpdated();

        } catch (Exception e) {
            attachments.attachScreenShot("Error");
        } finally {
            log.info(LOG_EXECUTION_TIME, "Click", getExecutionTime(startTime), driver.getCurrentUrl());
        }
    }

    public void sendKeys(WebElement webElement, String message) {
        long startTime = System.currentTimeMillis();
        try {
            waitForPageUpdated();
            waitForElementIsVisible(webElement);
            webElement.clear();
            webElement.sendKeys(message);
            waitForPageUpdated();
        } catch (Exception e) {
            attachments.attachScreenShot("Error");
        } finally {
            log.info(LOG_EXECUTION_TIME, "Send_Keys", getExecutionTime(startTime), driver.getCurrentUrl());
        }
    }

    private String getExecutionTime(long startTime) {
        return valueOf(System.currentTimeMillis() - startTime);
    }

    /**
     * Before and After click on WebElement wait following actions:
     * Scroll to element
     * Completed all Ajax request
     * Wait for Element is clickable
     *
     * @param webElement - WebElement
     */
    public void clickWithScroll(WebElement webElement) {
        long startTime = System.currentTimeMillis();
        try {
            waitForPageUpdated();
            waitForElementToBeClickable(webElement);
            scrollToWebElement(webElement);
            webElement.click();
            waitForPageUpdated();
        } catch (Exception e) {
            attachments.attachScreenShot("Error");
        } finally {
            log.info(LOG_EXECUTION_TIME, "Click", getExecutionTime(startTime), driver.getCurrentUrl());
        }
    }

    public String getText(WebElement webElement) {
        long startTime = System.currentTimeMillis();
        String text = "";
        try {
            waitForPageUpdated();
            waitForElementIsVisible(webElement);
            text = webElement.getText();
            waitForPageUpdated();
        } catch (Exception e) {
            attachments.attachScreenShot("Error");
        } finally {
            log.info(LOG_EXECUTION_TIME, "get_Text", getExecutionTime(startTime), driver.getCurrentUrl());
        }
        return text;
    }

    public String getText(By locator) {
        String text = "";
        long startTime = System.currentTimeMillis();
        try {
            waitForPageUpdated();
            WebElement element = driver.findElement(locator);
            waitForElementIsVisible(element);
            text = element.getText();
            waitForPageUpdated();
        } catch (NoSuchElementException e) {
            log.error("Could not find elements with locator: {}.", locator);
            attachments.attachScreenShot("NoSuchElementException");
            throw e;
        } finally {
            log.info(LOG_EXECUTION_TIME, "Click", getExecutionTime(startTime), driver.getCurrentUrl());
        }
        return text;
    }

    public void scrollToWebElement(By locator) {
        WebElement webElement = driver.findElement(locator);
        ((JavascriptExecutor) driver.getWrappedDriver()).executeScript("arguments[0].scrollIntoView(false)", webElement);
    }

    public void scrollToWebElement(WebElement webElement) {
        ((JavascriptExecutor) driver.getWrappedDriver()).executeScript("arguments[0].scrollIntoView(false)", webElement);
    }

    public void waitForElementToBeClickable(WebElement element) {
        long startTime = System.currentTimeMillis();
        try {
            new WebDriverWait(driver.getWrappedDriver(), timeout / 4000).until(ExpectedConditions.elementToBeClickable(element));
        } finally {
            log.info(LOG_EXECUTION_TIME, "Wait_For_Element_To_Be_Clickable", getExecutionTime(startTime), driver.getCurrentUrl());
        }
    }

    public void waitForElementIsVisible(WebElement element) {
        new WebDriverWait(driver.getWrappedDriver(), timeout / 4000).until(ExpectedConditions.visibilityOf(element));
    }

    public boolean isElementDisplayed(By locator) {
        boolean isDisplayed = false;
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
        try {
            WebElement webElement = driver.findElement(locator);
            isDisplayed = webElement.isDisplayed();
        } catch (NoSuchElementException ex) {
            isDisplayed = false;
            log.warn("Web Element is not displayed. Locator is {}", locator.toString());
        } finally {
            driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.MILLISECONDS);
        }
        return isDisplayed;
    }

    /**
     * Check that Element exist on the page
     *
     * @param locator - locator
     *
     * @return true - if exist, false  - if not
     */
    public boolean isElementPresent(By locator) {
        List<WebElement> webElements = driver.findElements(locator);
        return !webElements.isEmpty();
    }

    public void loseFocus() {
        ((JavascriptExecutor) driver
                .getWrappedDriver())
                .executeScript("if (document.activeElement != document.body) document.activeElement.blur();");
        attachments.attachScreenShot("After losing focus");
    }

    public boolean isAttributePresent(WebElement element, String attribute) {
        Boolean result = false;
        try {
            String value = element.getAttribute(attribute);
            if (value != null){
                result = true;
            }
        } catch (Exception e) {}

        return result;
    }

}
