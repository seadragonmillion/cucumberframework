$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginpage.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 27,
  "name": "Search particular employee",
  "description": "",
  "id": "login-functionality;search-particular-employee",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 26,
      "name": "@Leave"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "User clicks on leave tab",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "User clicks on From calender",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "User selects month and year for From Calender",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User clicks on any date",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User clicks on To Calender",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User selects month and year for To Calender",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "User selects any date",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User unchecks Pending Approval checkbox",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "User enters \"\u003cEmployeeName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "User checkbox SubUnit",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User selects \"\u003cDropdownvalue\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "User clicks including past employee checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User clicks on search button",
  "keyword": "Then "
});
formatter.examples({
  "line": 42,
  "name": "",
  "description": "",
  "id": "login-functionality;search-particular-employee;",
  "rows": [
    {
      "cells": [
        "EmployeeName",
        "Dropdownvalue"
      ],
      "line": 43,
      "id": "login-functionality;search-particular-employee;;1"
    },
    {
      "cells": [
        "Paul",
        "Administration"
      ],
      "line": 44,
      "id": "login-functionality;search-particular-employee;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8911446300,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "Search particular employee",
  "description": "",
  "id": "login-functionality;search-particular-employee;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 26,
      "name": "@Leave"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "User clicks on leave tab",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "User clicks on From calender",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "User selects month and year for From Calender",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User clicks on any date",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User clicks on To Calender",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User selects month and year for To Calender",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "User selects any date",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User unchecks Pending Approval checkbox",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "User enters \"Paul\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "User checkbox SubUnit",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User selects \"Administration\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "User clicks including past employee checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User clicks on search button",
  "keyword": "Then "
});
formatter.match({
  "location": "LeaveStep.user_clicks_on_leave_tab()"
});
formatter.result({
  "duration": 2760332200,
  "status": "passed"
});
formatter.match({
  "location": "LeaveStep.user_clicks_on_From_calender()"
});
formatter.result({
  "duration": 1131064000,
  "status": "passed"
});
formatter.match({
  "location": "LeaveStep.user_selects_month_and_year_for_From_Calender()"
});
formatter.result({
  "duration": 2356242000,
  "status": "passed"
});
formatter.match({
  "location": "LeaveStep.user_clicks_on_any_date()"
});
formatter.result({
  "duration": 79870200,
  "status": "passed"
});
formatter.match({
  "location": "LeaveStep.user_clicks_on_To_Calender()"
});
formatter.result({
  "duration": 1301887300,
  "status": "passed"
});
formatter.match({
  "location": "LeaveStep.user_selects_month_and_year_for_To_Calender()"
});
formatter.result({
  "duration": 2299634300,
  "status": "passed"
});
formatter.match({
  "location": "LeaveStep.user_selects_any_date()"
});
formatter.result({
  "duration": 96639900,
  "status": "passed"
});
formatter.match({
  "location": "LeaveStep.user_unchecks_Pending_Approval_checkbox()"
});
formatter.result({
  "duration": 65150300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Paul",
      "offset": 13
    }
  ],
  "location": "LeaveStep.user_enters(String)"
});
formatter.result({
  "duration": 80581800,
  "status": "passed"
});
formatter.match({
  "location": "LeaveStep.user_checkbox_SubUnit()"
});
formatter.result({
  "duration": 109649100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Administration",
      "offset": 14
    }
  ],
  "location": "LeaveStep.user_selects(String)"
});
formatter.result({
  "duration": 95776100,
  "status": "passed"
});
formatter.match({
  "location": "LeaveStep.user_clicks_including_past_employee_checkbox()"
});
formatter.result({
  "duration": 66988700,
  "status": "passed"
});
formatter.match({
  "location": "LeaveStep.user_clicks_on_search_button()"
});
formatter.result({
  "duration": 1534491300,
  "status": "passed"
});
formatter.after({
  "duration": 74720900,
  "status": "passed"
});
});