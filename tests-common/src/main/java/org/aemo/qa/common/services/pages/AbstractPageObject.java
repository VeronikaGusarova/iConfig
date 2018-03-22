package org.aemo.qa.common.services.pages;

import org.aemo.qa.common.services.attachments.Attachments;
import org.aemo.qa.common.services.webdriver.WebdriverHelper;
import org.aemo.qa.common.services.webdriver.WrappedWebdriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;

public class AbstractPageObject {

    @Autowired
    @Lazy
    protected WrappedWebdriver driver;

    @Autowired
    @Lazy
    protected WebdriverHelper webdriverHelper;

    @Autowired
    @Lazy
    protected Attachments attachments;

    @Autowired
    @Qualifier("siteURL")
    protected String siteUrl;

    @Autowired

    protected String siteHost;

    protected String getWindowTitle()
    {
        return driver.getTitle();
    }

}
