/*
 */
package org.aemo.qa.common.services.attachments.providers;

import org.aemo.qa.common.services.webdriver.WrappedWebdriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class ReportPortalAttachmentsProvider implements AttachmentsProvider {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private WrappedWebdriver driver;

    @Override
    public String attachPageTitle() {
        return "true";
    }

    @Override
    public String attachText(String nameOfAttachment, String textOfAttachment) {
        return null;
    }

    @Override
    public byte[] attachScreenshot() {
        LOG.debug("Attach screenshot to the RP report");
        return driver.takeScreenshot();
    }

    @Override
    public byte[] attachScreenshot(String nameOfScreenshot) {
        LOG.debug("Attach screenshot to the RP report");
        return driver.takeScreenshot();
    }
}
