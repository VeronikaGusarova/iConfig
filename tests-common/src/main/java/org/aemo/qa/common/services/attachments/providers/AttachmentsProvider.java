
package org.aemo.qa.common.services.attachments.providers;

public interface AttachmentsProvider {
    byte[] attachScreenshot();

    byte[] attachScreenshot(String nameOfScreenshot);

    String attachPageTitle();

    String attachText(String nameOfAttachment, String textOfAttachment);
}
