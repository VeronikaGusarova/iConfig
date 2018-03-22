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

/**
 * Created by Anton_Shapin.
 */

@PageObject
public class PrivacyPolicyPageObject extends AbstractPageObject {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    private final String PAGE_URL = "/privacy-policy";

    private static final String PAGE_NAME = "Privacy Policy page";

    @FindBy(xpath = ".//h1")
    protected WebElement pageTitle;

    /**
     * Open PrivacyPolicy page
     */
    public void open() {
        LOG.info("Open PrivacyPolicy page");
        driver.get(siteUrl + PAGE_URL);
        attachments.attachScreenShot(PAGE_NAME);
    }

    /**
     * Check that Privacy Policy page is opened.
     * Verify host, path, text of title(text into  tag h1).
     */
    public void isOpen() throws URISyntaxException {
        attachments.attachScreenShot(PAGE_NAME);
        SoftAssertions softAssert = new SoftAssertions();
        softAssert.assertThat(new URI(driver.getCurrentUrl())).hasHost(siteHost)
                .hasPath(PAGE_URL);
        softAssert.assertThat(pageTitle.getText())
                .as("Check title of the page")
                .isEqualToIgnoringCase("Privacy Policy");
    }
}