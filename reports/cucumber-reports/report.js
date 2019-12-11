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
