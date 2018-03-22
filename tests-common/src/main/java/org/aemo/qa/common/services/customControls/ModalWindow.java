/*
 */
package org.aemo.qa.common.services.customControls;

import org.aemo.qa.common.annotations.PageObject;
import org.aemo.qa.common.services.pages.AbstractPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@PageObject
public class ModalWindow extends AbstractPageObject {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private static final String CSS_POPUP_CONTAINER = ".modal-content";

    @FindBy(css = CSS_POPUP_CONTAINER + " .modal-title")
    private WebElement modalWindowHeader;

    @FindBy(css = CSS_POPUP_CONTAINER + " .modal-title .close-modal")
    private WebElement closeIconModalWindowHeader;

    @FindBy(css = CSS_POPUP_CONTAINER + " .modal-body")
    private WebElement modalWindowBody;

    @FindBy(css = CSS_POPUP_CONTAINER + " .modal-footer .ok")
    private WebElement buttonOkModalWindowFooter;

    /**
     * Check that modal window is opened
     * @return true - if exist, false  - if not
     */
    public boolean isModalWindowOpened() {
        return webdriverHelper.isElementPresent(By.cssSelector(CSS_POPUP_CONTAINER));
    }

    /**
     * @return text from modal window title
     */
    public String getModalWindowTitleText() {
        return webdriverHelper.getText(modalWindowHeader);
    }

    /**
     * @return text from modal window body
     */
    public String getModalWindowBodyText() {
        return webdriverHelper.getText(modalWindowBody);
    }

    /**
     * Close modal window by Ok button
     */
    public void closeModalWindowByOk() {
        log.info("Close modal window by Ok button");
        webdriverHelper.click(buttonOkModalWindowFooter);
        attachments.attachScreenShot("After closing modal window");
    }

    /**
     * Close modal window by X icon
     */
    public void closeModalWindowByXIcon() {
        log.info("Close modal window by X icon");
        webdriverHelper.click(closeIconModalWindowHeader);
        attachments.attachScreenShot("After closing modal window");
    }
}