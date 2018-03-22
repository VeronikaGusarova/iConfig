package org.aemo.qa.common.services.pages;

import org.aemo.qa.common.annotations.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.URI;
import java.net.URISyntaxException;

@PageObject
public class CommonPageObject extends AbstractPageObject{
    @FindBy(className = "page-title")
    private WebElement labelPageTitle;

    @FindBy(className = "fa-home")
    private WebElement buttonHome;

//    public void isOpened(String pageName, String pageUrl) throws URISyntaxException {
//        attachments.attachScreenShot(pageName);
//        assertThat(new URI(driver.getCurrentUrl())).hasHost(siteHost)
//                .toString().endsWith(pageUrl);
//                //.hasFragment(pageUrl);
//        assertThat(labelPageTitle.getText()).isEqualTo(pageName);
//    }

    public Boolean isOpened(String pageUrl) throws URISyntaxException {
        URI siteUri = new URI(driver.getCurrentUrl());
        return siteUri.getHost().equals(siteHost)
                && siteUri.toString().endsWith(pageUrl);
    }

}
