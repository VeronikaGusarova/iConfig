$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("gui/debug.feature");
formatter.feature({
  "line": 1,
  "name": "Login page.",
  "description": "As a user I want to sign up on the Login page;\nDashboard page should be opened after sign up;\nError should be shown in case of incorrect creds",
  "id": "login-page.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9807534,
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
  "name": "Dashboard page should be opened",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepsDef.iOpenLoginPage()"
});
formatter.result({
  "duration": 1747603555,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepsDef.iFillLoginAndPasswordFieldsWithCorrectCredentialsOnLoginPage()"
});
formatter.result({
  "duration": 1581679746,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepsDef.iClickButtonLogInOnLoginPage()"
});
formatter.result({
  "duration": 8017841664,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepsDef.dashboardPageShouldBeOpened()"
});
formatter.result({
  "duration": 628942460,
  "status": "passed"
});
formatter.after({
  "duration": 110410,
  "status": "passed"
});
formatter.uri("gui/debug1.feature");
formatter.feature({
  "line": 1,
  "name": "Login page.",
  "description": "As a user I want to sign up on the Login page;\nDashboard page should be opened after sign up;\nError should be shown in case of incorrect creds",
  "id": "login-page.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 168259,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Sign Up with fake credentials",
  "description": "",
  "id": "login-page.;sign-up-with-fake-credentials",
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
  "name": "I fill Login and Password fields with fake credentials on Login page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click button \u0027log in\u0027 on Login page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Modal window with title \"Error\" and body text \"An error occured during request to the server. Check details in browser console.\" should appear",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I close modal window by \u0027Ok\u0027 button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Label \"Incorrect email/password\" should appear on Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepsDef.iOpenLoginPage()"
});
