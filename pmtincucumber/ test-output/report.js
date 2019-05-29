$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("pmtlogin.feature");
formatter.feature({
  "line": 1,
  "name": "PMT Valid Login TestCases",
  "description": "",
  "id": "pmt-valid-login-testcases",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Entering Valid Login Testcases",
  "description": "",
  "id": "pmt-valid-login-testcases;entering-valid-login-testcases",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User will enter the username,password and login",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User will successfully login and dashboard page will be seen",
  "keyword": "Then "
});
formatter.match({
  "location": "TC001_PMTLogin.enter_the_url()"
});
formatter.result({
  "duration": 7966997772,
  "status": "passed"
});
formatter.match({
  "location": "TC001_PMTLogin.user_will_enter_the_username_password_and_login()"
});
formatter.result({
  "duration": 5848236364,
  "status": "passed"
});
formatter.match({
  "location": "TC001_PMTLogin.user_will_successfully_login_and_dashboard_page_will_be_seen()"
});
formatter.result({
  "duration": 1970612082,
  "status": "passed"
});
});