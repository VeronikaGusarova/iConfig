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
package gui;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import gui.configuration.CucumberHooks;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        plugin = {
                "com.github.kirlionik.cucumberallure.AllureReporter",
                "html:target/cucumber-html-report",
                "json:target/cucumber.json"
        }, tags = {}
)
public class RunAcceptanceTests {
    @BeforeClass
    public static void addRunnerClassIntoLog() {
        CucumberHooks.setNameOfRunnerClassIntoLog(RunAcceptanceTests.class.getSimpleName());
    }
}
