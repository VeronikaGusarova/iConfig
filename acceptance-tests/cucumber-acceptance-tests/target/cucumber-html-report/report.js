$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("gui/001Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login page.",
  "description": "As a user I want to sign up on the Login page;\nDashboard page should be opened after sign up;\nError should be shown in case of incorrect creds",
  "id": "login-page.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 41811250,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Sign Up with correct credentials",
  "description": "",
  "id": "login-page.;sign-up-with-correct-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Smoke"
    },
    {
      "line": 6,
      "name": "@SeverityLevel.CRITICAL"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I open Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I fill Login and Password fields with correct credentials on Login page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click button \u0027log in\u0027 on Login page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Page with url \"!/dashboard\" should be opened",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepsDef.iOpenLoginPage()"
});
formatter.result({
  "duration": 2266152621,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepsDef.iFillLoginAndPasswordFieldsWithCorrectCredentialsOnLoginPage()"
});
formatter.result({
  "duration": 738763275,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepsDef.iClickButtonLogInOnLoginPage()"
});
formatter.result({
  "duration": 165217494,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "!/dashboard",
      "offset": 15
    }
  ],
  "location": "CommonStepsDef.pageShouldBeOpened(String)"
});
formatter.result({
  "duration": 42752691,
  "status": "passed"
});
formatter.after({
  "duration": 366986980,
  "status": "passed"
});
formatter.after({
  "duration": 128138,
  "status": "passed"
});
formatter.before({
  "duration": 300751,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Sign Up with fake credentials",
  "description": "",
  "id": "login-page.;sign-up-with-fake-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Smoke"
    },
    {
      "line": 13,
      "name": "@SeverityLevel.CRITICAL"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I open Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I fill Login and Password fields with fake credentials on Login page",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I click button \u0027log in\u0027 on Login page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 18,
      "value": "#    Then Modal window with title \"Error\" and body text \"An error occured during request to the server. Check details in browser console.\" should appear"
    },
    {
      "line": 19,
      "value": "#    When I close modal window by \u0027Ok\u0027 button"
    }
  ],
  "line": 20,
  "name": "Label \"Incorrect email/password\" should appear on Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepsDef.iOpenLoginPage()"
});
formatter.result({
  "duration": 638252060,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepsDef.iFillLoginAndPasswordFieldsWithFakeCredentialsOnLoginPage()"
});
formatter.result({
  "duration": 479898970,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepsDef.iClickButtonLogInOnLoginPage()"
});
formatter.result({
  "duration": 90968975,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Incorrect email/password",
      "offset": 7
    }
  ],
  "location": "LoginPageStepsDef.labelShouldAppearOnLoginPage(String)"
});
formatter.result({
  "duration": 311916867,
  "status": "passed"
});
formatter.after({
  "duration": 13977619,
  "status": "passed"
});
formatter.after({
  "duration": 40743,
  "status": "passed"
});
formatter.uri("gui/002DashboardPageFieldsAvailability.feature");
formatter.feature({
  "line": 1,
  "name": "Dashboard Page, fields availability - smoke test.",
  "description": "As a user I want to be able to ensure that respective fields are unavailable while some previous are empty",
  "id": "dashboard-page,-fields-availability---smoke-test.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 415204,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I open Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I fill Login and Password fields with correct credentials on Login page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click button \u0027log in\u0027 on Login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStepsDef.iOpenLoginPage()"
});
formatter.result({
  "duration": 527622607,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepsDef.iFillLoginAndPasswordFieldsWithCorrectCredentialsOnLoginPage()"
});
formatter.result({
  "duration": 472795707,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepsDef.iClickButtonLogInOnLoginPage()"
});
formatter.result({
  "duration": 60564083473,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Check availability of inputs when creating a new project on Dashboard page",
  "description": "",
  "id": "dashboard-page,-fields-availability---smoke-test.;check-availability-of-inputs-when-creating-a-new-project-on-dashboard-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Smoke"
    },
    {
      "line": 9,
      "name": "@SeverityLevel.CRITICAL"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Page with url \"!/dashboard\" should be opened",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "# following availability statuses can be used:"
    },
    {
      "line": 13,
      "value": "# enabled"
    },
    {
      "line": 14,
      "value": "# disabled"
    }
  ],
  "line": 15,
  "name": "Selector \"asset type\" is \"enabled\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Selectors \"library, region, location\" are \"disabled\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Fields \"title, description\" are \"disabled\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "System buttons are \"disabled\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select \"Offshore Oil and Gas\" \"asset type\" on Dashboard page",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Selector \"asset type\" is \"enabled\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Selectors \"library, region, location\" are \"disabled\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "System buttons are \"enabled\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Fields \"title, description\" are \"disabled\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I select \"oil dehydration\" \u0027system\u0027 on Dashboard page",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "Selectors \"asset type, library\" are \"enabled\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Selectors \"region, location\" are \"disabled\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "System buttons are \"enabled\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Fields \"title, description\" are \"disabled\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I select \"Main Library\" \"library\" on Dashboard page",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "Selectors \"asset type, library, region\" are \"enabled\"",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Selector \"location\" is \"disabled\"",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "System buttons are \"enabled\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Fields \"title, description\" are \"disabled\"",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I select \"USA\" \"region\" on Dashboard page",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "Selectors \"asset type, library, region, location\" are \"enabled\"",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "System buttons are \"enabled\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Fields \"title, description\" are \"disabled\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I select \"Gulf of Mexico\" \"location\" on Dashboard page",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "Selectors \"asset type, library, region, location\" are \"enabled\"",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "System buttons are \"enabled\"",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Fields \"title, description\" are \"enabled\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "!/dashboard",
      "offset": 15
    }
  ],
  "location": "CommonStepsDef.pageShouldBeOpened(String)"
});
formatter.result({
  "duration": 14166716,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "asset type",
      "offset": 10
    },
    {
      "val": "is",
      "offset": 22
    },
    {
      "val": "enabled",
      "offset": 26
    }
  ],
  "location": "DashboardPageStepsDef.selectorsAre(String,String,String)"
});
formatter.result({
  "duration": 54334253,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "library, region, location",
      "offset": 11
    },
    {
      "val": "are",
      "offset": 38
    },
    {
      "val": "disabled",
      "offset": 43
    }
  ],
  "location": "DashboardPageStepsDef.selectorsAre(String,String,String)"
});
formatter.result({
  "duration": 129175254,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "title, description",
      "offset": 8
    },
    {
      "val": "are",
      "offset": 28
    },
    {
      "val": "disabled",
      "offset": 33
    }
  ],
  "location": "DashboardPageStepsDef.fieldSIs(String,String,String)"
});
formatter.result({
  "duration": 90008562,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "disabled",
      "offset": 20
    }
  ],
  "location": "DashboardPageStepsDef.systemButtonsAre(String)"
});
formatter.result({
  "duration": 45675295,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Offshore Oil and Gas",
      "offset": 10
    },
    {
      "val": "asset type",
      "offset": 33
    }
  ],
  "location": "DashboardPageStepsDef.iSelectOnDashboardPage(String,String)"
});
formatter.result({
  "duration": 273103487,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "asset type",
      "offset": 10
    },
    {
      "val": "is",
      "offset": 22
    },
    {
      "val": "enabled",
      "offset": 26
    }
  ],
  "location": "DashboardPageStepsDef.selectorsAre(String,String,String)"
});
formatter.result({
  "duration": 16685001,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "library, region, location",
      "offset": 11
    },
    {
      "val": "are",
      "offset": 38
    },
    {
      "val": "disabled",
      "offset": 43
    }
  ],
  "location": "DashboardPageStepsDef.selectorsAre(String,String,String)"
});
formatter.result({
  "duration": 78846248,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "enabled",
      "offset": 20
    }
  ],
  "location": "DashboardPageStepsDef.systemButtonsAre(String)"
});
formatter.result({
  "duration": 29341741,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "title, description",
      "offset": 8
    },
    {
      "val": "are",
      "offset": 28
    },
    {
      "val": "disabled",
      "offset": 33
    }
  ],
  "location": "DashboardPageStepsDef.fieldSIs(String,String,String)"
});
formatter.result({
  "duration": 58709295,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "oil dehydration",
      "offset": 10
    }
  ],
  "location": "DashboardPageStepsDef.iSelectSystemOnDashboardPage(String)"
});
formatter.result({
  "duration": 138914055,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "asset type, library",
      "offset": 11
    },
    {
      "val": "are",
      "offset": 32
    },
    {
      "val": "enabled",
      "offset": 37
    }
  ],
  "location": "DashboardPageStepsDef.selectorsAre(String,String,String)"
});
formatter.result({
  "duration": 62995077,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "region, location",
      "offset": 11
    },
    {
      "val": "are",
      "offset": 29
    },
    {
      "val": "disabled",
      "offset": 34
    }
  ],
  "location": "DashboardPageStepsDef.selectorsAre(String,String,String)"
});
formatter.result({
  "duration": 60123479,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "enabled",
      "offset": 20
    }
  ],
  "location": "DashboardPageStepsDef.systemButtonsAre(String)"
});
formatter.result({
  "duration": 27526038,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "title, description",
      "offset": 8
    },
    {
      "val": "are",
      "offset": 28
    },
    {
      "val": "disabled",
      "offset": 33
    }
  ],
  "location": "DashboardPageStepsDef.fieldSIs(String,String,String)"
});
formatter.result({
  "duration": 59723203,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Main Library",
      "offset": 10
    },
    {
      "val": "library",
      "offset": 25
    }
  ],
  "location": "DashboardPageStepsDef.iSelectOnDashboardPage(String,String)"
});
formatter.result({
  "duration": 257076593,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "asset type, library, region",
      "offset": 11
    },
    {
      "val": "are",
      "offset": 40
    },
    {
      "val": "enabled",
      "offset": 45
    }
  ],
  "location": "DashboardPageStepsDef.selectorsAre(String,String,String)"
});
formatter.result({
  "duration": 72607917,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "location",
      "offset": 10
    },
    {
      "val": "is",
      "offset": 20
    },
    {
      "val": "disabled",
      "offset": 24
    }
  ],
  "location": "DashboardPageStepsDef.selectorsAre(String,String,String)"
});
formatter.result({
  "duration": 28231107,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "enabled",
      "offset": 20
    }
  ],
  "location": "DashboardPageStepsDef.systemButtonsAre(String)"
});
formatter.result({
  "duration": 30109947,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "title, description",
      "offset": 8
    },
    {
      "val": "are",
      "offset": 28
    },
    {
      "val": "disabled",
      "offset": 33
    }
  ],
  "location": "DashboardPageStepsDef.fieldSIs(String,String,String)"
});
formatter.result({
  "duration": 62271657,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "USA",
      "offset": 10
    },
    {
      "val": "region",
      "offset": 16
    }
  ],
  "location": "DashboardPageStepsDef.iSelectOnDashboardPage(String,String)"
});
formatter.result({
  "duration": 227765022,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "asset type, library, region, location",
      "offset": 11
    },
    {
      "val": "are",
      "offset": 50
    },
    {
      "val": "enabled",
      "offset": 55
    }
  ],
  "location": "DashboardPageStepsDef.selectorsAre(String,String,String)"
});
formatter.result({
  "duration": 92128438,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "enabled",
      "offset": 20
    }
  ],
  "location": "DashboardPageStepsDef.systemButtonsAre(String)"
});
formatter.result({
  "duration": 28286157,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "title, description",
      "offset": 8
    },
    {
      "val": "are",
      "offset": 28
    },
    {
      "val": "disabled",
      "offset": 33
    }
  ],
  "location": "DashboardPageStepsDef.fieldSIs(String,String,String)"
});
formatter.result({
  "duration": 60404947,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gulf of Mexico",
      "offset": 10
    },
    {
      "val": "location",
      "offset": 27
    }
  ],
  "location": "DashboardPageStepsDef.iSelectOnDashboardPage(String,String)"
});
formatter.result({
  "duration": 221767415,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "asset type, library, region, location",
      "offset": 11
    },
    {
      "val": "are",
      "offset": 50
    },
    {
      "val": "enabled",
      "offset": 55
    }
  ],
  "location": "DashboardPageStepsDef.selectorsAre(String,String,String)"
});
formatter.result({
  "duration": 87508005,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "enabled",
      "offset": 20
    }
  ],
  "location": "DashboardPageStepsDef.systemButtonsAre(String)"
});
formatter.result({
  "duration": 28081821,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "title, description",
      "offset": 8
    },
    {
      "val": "are",
      "offset": 28
    },
    {
      "val": "enabled",
      "offset": 33
    }
  ],
  "location": "DashboardPageStepsDef.fieldSIs(String,String,String)"
});
formatter.result({
  "duration": 60362028,
  "status": "passed"
});
formatter.after({
  "duration": 263930734,
  "status": "passed"
});
formatter.after({
  "duration": 39810,
  "status": "passed"
});
formatter.uri("gui/003DashboardPageFiltering.feature");
formatter.feature({
  "line": 1,
  "name": "Filter projects in recents list - smoke test.",
  "description": "As a user I want to be able to create project,\nto apply filtering by project statuses,\nto apply searching by project\nto remove project",
  "id": "filter-projects-in-recents-list---smoke-test.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Create a new project, check its status and presence in Recents",
  "description": "",
  "id": "filter-projects-in-recents-list---smoke-test.;create-a-new-project,-check-its-status-and-presence-in-recents",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@createProject"
    },
    {
      "line": 12,
      "name": "@Smoke"
    },
    {
      "line": 12,
      "name": "@SeverityLevel.NORMAL"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Page with url \"!/dashboard\" should be opened",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I select \"Offshore Oil and Gas\" \"asset type\" on Dashboard page",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I select \"oil dehydration\" \u0027system\u0027 on Dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select \"Main Library\" \"library\" on Dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select \"USA\" \"region\" on Dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I select \"Gulf of Mexico\" \"location\" on Dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I set \"AT project\" \u0027project title\u0027 on Dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I set \"AT project - description\" as \u0027project description\u0027 on Dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click \u0027create project\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Page with url \"/questionnaire\" should be opened",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I click \u0027Save Project\u0027 button",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Modal window with title \"Notification\" and body text \"Changes were saved.\" should appear",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I close modal window by \u0027Ok\u0027 button",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I navigate to Dashboard page by \u0027Home\u0027 icon",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 30,
      "value": "#Then I see project with \"AT project 1\" name in \u0027my projects\u0027 list on Dashboard Page"
    }
  ],
  "line": 31,
  "name": "Project \"\u003cprojectName\u003e\" is \"in\" list of projects with \"allProjects\" status on Dashboard Page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 32,
      "value": "# status value is taken from ProjectStatus enum and can be following:"
    },
    {
      "line": 33,
      "value": "# allProjects,"
    },
    {
      "line": 34,
      "value": "# completed,"
    },
    {
      "line": 35,
      "value": "# inProgress"
    }
  ],
  "line": 36,
  "name": "Status of project \"\u003cprojectName\u003e\" is \"In Progress\" on Dashboard Page",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Project \"\u003cprojectName\u003e\" is \"in\" list of projects with \"inProgress\" status on Dashboard Page",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Status of project \"\u003cprojectName\u003e\" is \"In Progress\" on Dashboard Page",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Project \"\u003cprojectName\u003e\" is \"not in\" list of projects with \"completed\" status on Dashboard Page",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I open project \"\u003cprojectName\u003e\" on Dashboard page",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "I remove project on Breadcrambs panel",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "Page with url \"!/dashboard\" should be opened",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "Project \"\u003cprojectName\u003e\" is \"not in\" list of projects with \"allProjects\" status on Dashboard Page",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Project \"\u003cprojectName\u003e\" is \"not in\" list of projects with \"inProgress\" status on Dashboard Page",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Project \"\u003cprojectName\u003e\" is \"not in\" list of projects with \"completed\" status on Dashboard Page",
  "keyword": "And "
});
formatter.examples({
  "line": 47,
  "name": "",
  "description": "",
  "id": "filter-projects-in-recents-list---smoke-test.;create-a-new-project,-check-its-status-and-presence-in-recents;",
  "rows": [
    {
      "cells": [
        "projectName"
      ],
      "line": 48,
      "id": "filter-projects-in-recents-list---smoke-test.;create-a-new-project,-check-its-status-and-presence-in-recents;;1"
    },
    {
      "cells": [
        "AT project"
      ],
      "line": 49,
      "id": "filter-projects-in-recents-list---smoke-test.;create-a-new-project,-check-its-status-and-presence-in-recents;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 323144,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I open Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I fill Login and Password fields with correct credentials on Login page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click button \u0027log in\u0027 on Login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStepsDef.iOpenLoginPage()"
});
formatter.result({
  "duration": 593141568,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepsDef.iFillLoginAndPasswordFieldsWithCorrectCredentialsOnLoginPage()"
});
formatter.result({
  "duration": 493786084,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepsDef.iClickButtonLogInOnLoginPage()"
});
formatter.result({
  "duration": 30544132196,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "Create a new project, check its status and presence in Recents",
  "description": "",
  "id": "filter-projects-in-recents-list---smoke-test.;create-a-new-project,-check-its-status-and-presence-in-recents;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@createProject"
    },
    {
      "line": 12,
      "name": "@Smoke"
    },
    {
      "line": 12,
      "name": "@SeverityLevel.NORMAL"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Page with url \"!/dashboard\" should be opened",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I select \"Offshore Oil and Gas\" \"asset type\" on Dashboard page",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I select \"oil dehydration\" \u0027system\u0027 on Dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select \"Main Library\" \"library\" on Dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select \"USA\" \"region\" on Dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I select \"Gulf of Mexico\" \"location\" on Dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I set \"AT project\" \u0027project title\u0027 on Dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I set \"AT project - description\" as \u0027project description\u0027 on Dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click \u0027create project\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Page with url \"/questionnaire\" should be opened",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I click \u0027Save Project\u0027 button",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Modal window with title \"Notification\" and body text \"Changes were saved.\" should appear",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I close modal window by \u0027Ok\u0027 button",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I navigate to Dashboard page by \u0027Home\u0027 icon",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 30,
      "value": "#Then I see project with \"AT project 1\" name in \u0027my projects\u0027 list on Dashboard Page"
    }
  ],
  "line": 31,
  "name": "Project \"AT project\" is \"in\" list of projects with \"allProjects\" status on Dashboard Page",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 32,
      "value": "# status value is taken from ProjectStatus enum and can be following:"
    },
    {
      "line": 33,
      "value": "# allProjects,"
    },
    {
      "line": 34,
      "value": "# completed,"
    },
    {
      "line": 35,
      "value": "# inProgress"
    }
  ],
  "line": 36,
  "name": "Status of project \"AT project\" is \"In Progress\" on Dashboard Page",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Project \"AT project\" is \"in\" list of projects with \"inProgress\" status on Dashboard Page",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Status of project \"AT project\" is \"In Progress\" on Dashboard Page",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Project \"AT project\" is \"not in\" list of projects with \"completed\" status on Dashboard Page",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I open project \"AT project\" on Dashboard page",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "I remove project on Breadcrambs panel",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "Page with url \"!/dashboard\" should be opened",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "Project \"AT project\" is \"not in\" list of projects with \"allProjects\" status on Dashboard Page",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Project \"AT project\" is \"not in\" list of projects with \"inProgress\" status on Dashboard Page",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Project \"AT project\" is \"not in\" list of projects with \"completed\" status on Dashboard Page",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "!/dashboard",
      "offset": 15
    }
  ],
  "location": "CommonStepsDef.pageShouldBeOpened(String)"
});
formatter.result({
  "duration": 6571739,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Offshore Oil and Gas",
      "offset": 10
    },
    {
      "val": "asset type",
      "offset": 33
    }
  ],
  "location": "DashboardPageStepsDef.iSelectOnDashboardPage(String,String)"
});
formatter.result({
  "duration": 268451641,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "oil dehydration",
      "offset": 10
    }
  ],
  "location": "DashboardPageStepsDef.iSelectSystemOnDashboardPage(String)"
});
formatter.result({
  "duration": 116547439,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Main Library",
      "offset": 10
    },
    {
      "val": "library",
      "offset": 25
    }
  ],
  "location": "DashboardPageStepsDef.iSelectOnDashboardPage(String,String)"
});
formatter.result({
  "duration": 238682256,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "USA",
      "offset": 10
    },
    {
      "val": "region",
      "offset": 16
    }
  ],
  "location": "DashboardPageStepsDef.iSelectOnDashboardPage(String,String)"
});
formatter.result({
  "duration": 219909725,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gulf of Mexico",
      "offset": 10
    },
    {
      "val": "location",
      "offset": 27
    }
  ],
  "location": "DashboardPageStepsDef.iSelectOnDashboardPage(String,String)"
});
formatter.result({
  "duration": 220618527,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AT project",
      "offset": 7
    }
  ],
  "location": "DashboardPageStepsDef.iSetProjectTitleOnDashboardPage(String)"
});
formatter.result({
  "duration": 193022511,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AT project - description",
      "offset": 7
    }
  ],
  "location": "DashboardPageStepsDef.iSetAsProjectDescriptionOnDashboardPage(String)"
});
formatter.result({
  "duration": 155592525,
  "status": "passed"
});
formatter.match({
  "location": "DashboardPageStepsDef.iClickCreateProjectButton()"
});
formatter.result({
  "duration": 114131478,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/questionnaire",
      "offset": 15
    }
  ],
  "location": "CommonStepsDef.pageShouldBeOpened(String)"
});
formatter.result({
  "duration": 3043278,
  "status": "passed"
});
formatter.match({
  "location": "DashboardPageStepsDef.iClickSaveProjectButton()"
});
formatter.result({
  "duration": 303642323,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Notification",
      "offset": 25
    },
    {
      "val": "Changes were saved.",
      "offset": 54
    }
  ],
  "location": "LoginPageStepsDef.modalWindowWithTitleAndBodyTextShouldAppear(String,String)"
});
formatter.result({
  "duration": 257077837,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepsDef.iCloseModalWindowByOkButton()"
});
formatter.result({
  "duration": 499770005,
  "status": "passed"
});
formatter.match({
  "location": "BreadCrumbsPageStepsDef.iNavigateToDashboardPageByHomeIcon()"
});
formatter.result({
  "duration": 192647739,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AT project",
      "offset": 9
    },
    {
      "val": "in",
      "offset": 25
    },
    {},
    {
      "val": "allProjects",
      "offset": 52
    }
  ],
  "location": "DashboardPageStepsDef.projectIsInListOfProjectsWithStatusOnDashboardPage(String,String,Object,ProjectStatus)"
});
formatter.result({
  "duration": 372091664,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AT project",
      "offset": 19
    },
    {
      "val": "In Progress",
      "offset": 35
    }
  ],
  "location": "DashboardPageStepsDef.statusOfProjectIsInListOfRecentsOnDashboardPage(String,String)"
});
formatter.result({
  "duration": 205044470,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AT project",
      "offset": 9
    },
    {
      "val": "in",
      "offset": 25
    },
    {},
    {
      "val": "inProgress",
      "offset": 52
    }
  ],
  "location": "DashboardPageStepsDef.projectIsInListOfProjectsWithStatusOnDashboardPage(String,String,Object,ProjectStatus)"
});
formatter.result({
  "duration": 195684174,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AT project",
      "offset": 19
    },
    {
      "val": "In Progress",
      "offset": 35
    }
  ],
  "location": "DashboardPageStepsDef.statusOfProjectIsInListOfRecentsOnDashboardPage(String,String)"
});
formatter.result({
  "duration": 179187960,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AT project",
      "offset": 9
    },
    {
      "val": "not in",
      "offset": 25
    },
    {
      "val": "not ",
      "offset": 25
    },
    {
      "val": "completed",
      "offset": 56
    }
  ],
  "location": "DashboardPageStepsDef.projectIsInListOfProjectsWithStatusOnDashboardPage(String,String,Object,ProjectStatus)"
});
formatter.result({
  "duration": 30142645298,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AT project",
      "offset": 16
    }
  ],
  "location": "DashboardPageStepsDef.iOpenProjectOnDashboardPage(String)"
});
formatter.result({
  "duration": 502566026,
  "status": "passed"
});
formatter.match({
  "location": "BreadCrumbsPageStepsDef.iRemoveProjectOnBreadcrambsPanel()"
});
formatter.result({
  "duration": 1357515342,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "!/dashboard",
      "offset": 15
    }
  ],
  "location": "CommonStepsDef.pageShouldBeOpened(String)"
});
formatter.result({
  "duration": 11957579,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AT project",
      "offset": 9
    },
    {
      "val": "not in",
      "offset": 25
    },
    {
      "val": "not ",
      "offset": 25
    },
    {
      "val": "allProjects",
      "offset": 56
    }
  ],
  "location": "DashboardPageStepsDef.projectIsInListOfProjectsWithStatusOnDashboardPage(String,String,Object,ProjectStatus)"
});
formatter.result({
  "duration": 300064411,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AT project",
      "offset": 9
    },
    {
      "val": "not in",
      "offset": 25
    },
    {
      "val": "not ",
      "offset": 25
    },
    {
      "val": "inProgress",
      "offset": 56
    }
  ],
  "location": "DashboardPageStepsDef.projectIsInListOfProjectsWithStatusOnDashboardPage(String,String,Object,ProjectStatus)"
});
formatter.result({
  "duration": 198567591,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AT project",
      "offset": 9
    },
    {
      "val": "not in",
      "offset": 25
    },
    {
      "val": "not ",
      "offset": 25
    },
    {
      "val": "completed",
      "offset": 56
    }
  ],
  "location": "DashboardPageStepsDef.projectIsInListOfProjectsWithStatusOnDashboardPage(String,String,Object,ProjectStatus)"
});
formatter.result({
  "duration": 30158943396,
  "status": "passed"
});
formatter.after({
  "duration": 369659840,
  "status": "passed"
});
formatter.after({
  "duration": 45097,
  "status": "passed"
});
formatter.uri("gui/debug.feature");
formatter.feature({
  "line": 1,
  "name": "Filtering projects in recents list - smoke test.",
  "description": "As a user I want to be able to filter projects by name on Dashboard page,\nand filter them by status",
  "id": "filtering-projects-in-recents-list---smoke-test.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 250056,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I open Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I fill Login and Password fields with correct credentials on Login page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click button \u0027log in\u0027 on Login page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStepsDef.iOpenLoginPage()"
});
formatter.result({
  "duration": 552910584,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepsDef.iFillLoginAndPasswordFieldsWithCorrectCredentialsOnLoginPage()"
});
formatter.result({
  "duration": 474902520,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepsDef.iClickButtonLogInOnLoginPage()"
});
formatter.result({
  "duration": 61157101568,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Check project with In Progress status",
  "description": "",
  "id": "filtering-projects-in-recents-list---smoke-test.;check-project-with-in-progress-status",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Smoke"
    },
    {
      "line": 10,
      "name": "@SeverityLevel.CRITICAL"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Page with url \"!/dashboard\" should be opened",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "!/dashboard",
      "offset": 15
    }
  ],
  "location": "CommonStepsDef.pageShouldBeOpened(String)"
});
formatter.result({
  "duration": 9679708,
  "status": "passed"
});
formatter.after({
  "duration": 313756830,
  "status": "passed"
});
formatter.after({
  "duration": 37633,
  "status": "passed"
});
});