/*
 */
package org.aemo.qa.common.services.pages;

import org.aemo.qa.common.annotations.PageObject;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.net.URISyntaxException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Anton_Shapin.
 */

@PageObject
public class TermsAndConditionsPageObject extends AbstractPageObject {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    private final String PAGE_URL = "/terms-and-conditions";

    private static final String PAGE_NAME = "Terms And Conditions page";

    @FindBy(xpath = ".//h1")
    protected WebElement pageTitle;

    @FindBy(xpath = "XPATH")
    protected WebElement nameWebElement1;

    @FindBy(xpath = "XPATH")
    protected WebElement nameWebElement2;

    /**
     * Open TermsAndConditions page directly by URL
     */
    public void open() {
        LOG.info("Open TermsAndConditions page");
        driver.get(siteUrl + PAGE_URL);
    }

    /**
     * Check that Terms And Conditions page is opened.
     * Verify host, path, text of title(text into  tag h1).
     */
    public void isOpen() throws URISyntaxException {
        attachments.attachScreenShot(PAGE_NAME);
        SoftAssertions softAssert = new SoftAssertions();
        softAssert.assertThat(new URI(driver.getCurrentUrl())).hasHost(siteHost)
                .hasPath(PAGE_URL);
        softAssert.assertThat(pageTitle.getText())
                .as("Check title of the page")
                .isEqualToIgnoringCase("Terms and Conditions");
    }
}