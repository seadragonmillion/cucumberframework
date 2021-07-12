$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RVmodule.feature");
formatter.feature({
  "line": 1,
  "name": "Verify RV module offline report can be successfully synced to online database",
  "description": "",
  "id": "verify-rv-module-offline-report-can-be-successfully-synced-to-online-database",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "complete RV report offline and see if it displays in online listing",
  "description": "",
  "id": "verify-rv-module-offline-report-can-be-successfully-synced-to-online-database;complete-rv-report-offline-and-see-if-it-displays-in-online-listing",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@RVOfflineReportSync"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "click Analysis",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "click Remote Verification module",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter text \"\u003cReportTitle\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click ChooseFile and upload photo_three",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "enter text \"\u003cDetail\u003e\" for description_four",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "click InPerson tab_five",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click I certify_six",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "enter VNametext \"\u003cVerifierName\u003e\"_six",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "enter VTitletext \"\u003cVerifierTitle\u003e\"_six",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click save button_seven",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "verify-rv-module-offline-report-can-be-successfully-synced-to-online-database;complete-rv-report-offline-and-see-if-it-displays-in-online-listing;",
  "rows": [
    {
      "cells": [
        "ReportTitle",
        "Detail",
        "VerifierName",
        "VerifierTitle"
      ],
      "line": 17,
      "id": "verify-rv-module-offline-report-can-be-successfully-synced-to-online-database;complete-rv-report-offline-and-see-if-it-displays-in-online-listing;;1"
    },
    {
      "cells": [
        "RVofflineAutoTest",
        "work evaluation",
        "MarryAnne",
        "Site Manager"
      ],
      "line": 18,
      "id": "verify-rv-module-offline-report-can-be-successfully-synced-to-online-database;complete-rv-report-offline-and-see-if-it-displays-in-online-listing;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 18437283700,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "complete RV report offline and see if it displays in online listing",
  "description": "",
  "id": "verify-rv-module-offline-report-can-be-successfully-synced-to-online-database;complete-rv-report-offline-and-see-if-it-displays-in-online-listing;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@RVOfflineReportSync"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "click Analysis",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "click Remote Verification module",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter text \"RVofflineAutoTest\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click ChooseFile and upload photo_three",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "enter text \"work evaluation\" for description_four",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "click InPerson tab_five",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click I certify_six",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "enter VNametext \"MarryAnne\"_six",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "enter VTitletext \"Site Manager\"_six",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click save button_seven",
  "keyword": "Then "
});
formatter.match({
  "location": "RV_OfflineSync_inPerson_Steps.click_Analysis()"
});
formatter.result({
  "duration": 15232558800,
  "status": "passed"
});
formatter.match({
  "location": "RV_OfflineSync_inPerson_Steps.click_Remote_Verification_module()"
});
formatter.result({
  "duration": 342165200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RVofflineAutoTest",
      "offset": 12
    }
  ],
  "location": "RV_OfflineSync_inPerson_Steps.enter_text(String)"
});
formatter.result({
  "duration": 180796700,
  "status": "passed"
});
formatter.match({
  "location": "RV_OfflineSync_inPerson_Steps.click_ChooseFile_and_upload_photo_three()"
});
formatter.result({
  "duration": 31141191800,
  "error_message": "org.openqa.selenium.InvalidArgumentException: invalid argument\n  (Session info: chrome\u003d91.0.4472.124)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6K22R4L\u0027, ip: \u0027192.168.0.159\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.124, chrome: {chromedriverVersion: 91.0.4472.101 (af52a90bf870..., userDataDir: C:\\Users\\mama\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:53259}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 0612b72c329f4d5c0632cea925e83da1\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat com.kaleqa.framework.pages.RV_OfflineSync_inPerson_page.ClickChooseFile(RV_OfflineSync_inPerson_page.java:51)\r\n\tat com.kaleqa.framework.steps.RV_OfflineSync_inPerson_Steps.click_ChooseFile_and_upload_photo_three(RV_OfflineSync_inPerson_Steps.java:58)\r\n\tat ✽.Then click ChooseFile and upload photo_three(RVmodule.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "work evaluation",
      "offset": 12
    }
  ],
  "location": "RV_OfflineSync_inPerson_Steps.enter_text_for_description_four(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RV_OfflineSync_inPerson_Steps.click_InPerson_tab_five()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RV_OfflineSync_inPerson_Steps.click_I_certify_six()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "MarryAnne",
      "offset": 17
    }
  ],
  "location": "RV_OfflineSync_inPerson_Steps.enter_VNametext__six(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Site Manager",
      "offset": 18
    }
  ],
  "location": "RV_OfflineSync_inPerson_Steps.enter_VTitletext__six(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RV_OfflineSync_inPerson_Steps.click_save_button_seven()"
});
formatter.result({
  "status": "skipped"
});
});