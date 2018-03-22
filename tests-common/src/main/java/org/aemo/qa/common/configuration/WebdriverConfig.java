package org.aemo.qa.common.configuration;
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

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.aemo.qa.common.services.webdriver.WrappedWebdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

import static javaslang.API.Case;
import static javaslang.API.Match;

@Configuration
public class WebdriverConfig {
    private final String CHROME = "Chrome";
    private final String IE = "InternetExplorer";

    @Value("${webdriver.browser:Chrome}")
    private String browserName;


    @Bean(destroyMethod = "quit")
    public WrappedWebdriver webDriver() throws IOException {
        return Match(browserName).of(
                Case(CHROME::equalsIgnoreCase, this::initChrome),
                Case(IE::equalsIgnoreCase, this::initIe)
        );
    }

    private WrappedWebdriver initIe() {
        InternetExplorerDriverManager.getInstance().setup();
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        return new WrappedWebdriver(driver);
    }

    private WrappedWebdriver initChrome() {
        ChromeDriverManager.getInstance().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return new WrappedWebdriver(driver);
    }
}
