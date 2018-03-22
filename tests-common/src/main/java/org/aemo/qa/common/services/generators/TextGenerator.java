/*
 */
package org.aemo.qa.common.services.generators;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Lazy
public class TextGenerator {
    private static final String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJLMNOPQRSTUVWXYZ";
    private final Random random;


    public TextGenerator() {
        this.random = new Random();
    }

    /**
     * Generate text without spaces
     *
     * @param length - length of text
     *
     * @return - text
     */
    public String getTextWithoutSpaces(int length) {
        StringBuilder resultText = new StringBuilder();
        while (length > 1) {
            resultText.append(symbols.charAt(random.nextInt(symbols.length())));
            length--;
        }
        return resultText.toString();
    }

    /**
     * Generate text with one space
     *
     * @param length - length of text
     *
     * @return - text
     */
    public String getTextWithSpace(int length) {
        int textLength = length;
        StringBuilder resultText = new StringBuilder();
        resultText.append(symbols.charAt(random.nextInt(symbols.length())));
        textLength--;
        resultText.append(" ");
        textLength--;
        while (textLength > 1) {
            resultText.append(symbols.charAt(random.nextInt(symbols.length())));
            textLength--;
        }
        return resultText.toString();
    }

}
