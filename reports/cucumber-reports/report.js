$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ordertshirt.feature");
formatter.feature({
  "line": 1,
  "name": "Launch Application",
  "description": "",
  "id": "launch-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Order t-shirt and verify in Order History",
  "description": "",
  "id": "launch-application;order-t-shirt-and-verify-in-order-history",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I loggedIn into application with email address as \"\u003cusername\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I go to T-shirt page and add a T-shirt into cart",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I place order by doing payment",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "i can see order in order History",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "launch-application;order-t-shirt-and-verify-in-order-history;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9,
      "id": "launch-application;order-t-shirt-and-verify-in-order-history;;1"
    },
    {
      "cells": [
        "puneet8085@gmail.com",
        "Test123@"
      ],
      "line": 10,
      "id": "launch-application;order-t-shirt-and-verify-in-order-history;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 10350041265,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Order t-shirt and verify in Order History",
  "description": "",
  "id": "launch-application;order-t-shirt-and-verify-in-order-history;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I loggedIn into application with email address as \"puneet8085@gmail.com\" and password as \"Test123@\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I go to T-shirt page and add a T-shirt into cart",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I place order by doing payment",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "i can see order in order History",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "puneet8085@gmail.com",
      "offset": 51
    },
    {
      "val": "Test123@",
      "offset": 90
    }
  ],
  "location": "TestStepDef.LoggedInToApplication(String,String)"
});
formatter.result({
  "duration": 23599654263,
  "status": "passed"
});
formatter.match({
  "location": "TestStepDef.addTshirt()"
});
formatter.result({
  "duration": 9991285916,
  "status": "passed"
});
formatter.match({
  "location": "TestStepDef.placeOrder()"
});
formatter.result({
  "duration": 15468305220,
  "status": "passed"
});
formatter.match({
  "location": "TestStepDef.verifyOrder()"
});
formatter.result({
  "duration": 54931959,
  "status": "passed"
});
formatter.after({
  "duration": 1519713699,
  "status": "passed"
});
formatter.uri("updatepersonalinfo.feature");
formatter.feature({
  "line": 1,
  "name": "Update Personal Information of User",
  "description": "",
  "id": "update-personal-information-of-user",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "update first name of Logged in User",
  "description": "",
  "id": "update-personal-information-of-user;update-first-name-of-logged-in-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I loggedIn into application with email address as \"puneet8085@gmail.com\" and password as \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on My Personal Info",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter \"\u003cFirstname\u003e\" and \"\u003cpassword\u003e\" as",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on Save Button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I can see updated \"\u003cFirstname\u003e\" of user next to Signout option",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "update-personal-information-of-user;update-first-name-of-logged-in-user;",
  "rows": [
    {
      "cells": [
        "Firstname",
        "password"
      ],
      "line": 10,
      "id": "update-personal-information-of-user;update-first-name-of-logged-in-user;;1"
    },
    {
      "cells": [
        "Tester",
        "Test123@"
      ],
      "line": 11,
      "id": "update-personal-information-of-user;update-first-name-of-logged-in-user;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5645832811,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "update first name of Logged in User",
  "description": "",
  "id": "update-personal-information-of-user;update-first-name-of-logged-in-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I loggedIn into application with email address as \"puneet8085@gmail.com\" and password as \"Test123@\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on My Personal Info",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter \"Tester\" and \"Test123@\" as",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on Save Button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I can see updated \"Tester\" of user next to Signout option",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "puneet8085@gmail.com",
      "offset": 51
    },
    {
      "val": "Test123@",
      "offset": 90
    }
  ],
  "location": "TestStepDef.LoggedInToApplication(String,String)"
});
formatter.result({
  "duration": 18090839297,
  "status": "passed"
});
formatter.match({
  "location": "TestStepDef.clickPersonalInfoLink()"
});
formatter.result({
  "duration": 2020391949,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tester",
      "offset": 9
    },
    {
      "val": "Test123@",
      "offset": 22
    }
  ],
  "location": "TestStepDef.enterDetails(String,String)"
});
formatter.result({
  "duration": 1273462881,
  "status": "passed"
});
formatter.match({
  "location": "TestStepDef.clickSaveButton()"
});
formatter.result({
  "duration": 1950311083,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tester",
      "offset": 19
    }
  ],
  "location": "TestStepDef.verifyUpdatedDetails(String)"
});
formatter.result({
  "duration": 122172155,
  "status": "passed"
});
formatter.after({
  "duration": 1587407011,
  "status": "passed"
});
});