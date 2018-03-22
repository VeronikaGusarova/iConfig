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
package gui.stepsDef;

import gui.configuration.AppConfig;
import org.aemo.qa.common.containers.DataContainer;
import org.aemo.qa.common.services.attachments.Attachments;
import org.aemo.qa.common.services.customControls.ModalWindow;
import org.aemo.qa.common.services.generators.TextGenerator;
import org.aemo.qa.common.services.pages.*;
import org.aemo.qa.common.services.webdriver.WebdriverHelper;
import org.aemo.qa.common.services.webdriver.WrappedWebdriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;

import static org.springframework.test.annotation.DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD;

@ContextConfiguration(classes = {AppConfig.class})
@DirtiesContext(classMode = AFTER_EACH_TEST_METHOD)
public class AbstractStepsDef {
    @Value("${site.url:localhost}")
    protected String siteUrl;

    @Autowired
    @Lazy
    public WrappedWebdriver driver;

    @Autowired
    @Lazy
    public WebdriverHelper webdriverHelper;

    @Autowired
    @Lazy
    public DataContainer dataContainer;

    @Autowired
    @Lazy
    protected Attachments attachments;

    @Autowired
    @Lazy
    protected TextGenerator textGenerator;

    //Page Objects
    @Autowired
    @Lazy
    protected LoginPageObject loginPage;

    @Autowired
    @Lazy
    protected CommonPageObject page;

    @Autowired
    @Lazy
    protected DashboardPageObject dashboardPage;

    @Autowired
    @Lazy
    protected CreateNewProjectPageObject createProjectPage;

    @Autowired
    @Lazy
    protected ModalWindow modalWindow;

    @Autowired
    @Lazy
    protected CreateAccountPageObject createAccountPage;

    @Autowired
    @Lazy
    protected DesignParametersPageObject designParametersPage;

    @Autowired
    @Lazy
    protected BreadCrumbsPageObject breadCrumbsPage;

    protected static String projectId;
}
