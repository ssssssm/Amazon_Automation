$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/AmazonTest.feature");
formatter.feature({
  "line": 2,
  "name": "Amazon Application Testing",
  "description": "",
  "id": "amazon-application-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "�Today�s Deal� should be visible on the Home page",
  "description": "",
  "id": "amazon-application-testing;�today�s-deal�-should-be-visible-on-the-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@TAG1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User launches Amazon Application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User is on the Home Page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Today\u0027s Deal should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonTest.user_launches_Amazon_Application()"
});
formatter.result({
  "duration": 64726703849,
  "status": "passed"
});
formatter.match({
  "location": "AmazonTest.user_is_on_the_Home_Page()"
});
formatter.result({
  "duration": 67584,
  "status": "passed"
});
formatter.match({
  "location": "AmazonTest.today_s_Deal_should_be_displayed()"
});
formatter.result({
  "duration": 6171899568,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "All New Deals should be shown on New Tab",
  "description": "",
  "id": "amazon-application-testing;all-new-deals-should-be-shown-on-new-tab",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@TAG1"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Clicks on See All Details",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "All Details should be shown on New Tab",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Click on Category Link",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User Select Baby Products and Beauty options",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Snapshot should be taken",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonTest.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 336896,
  "status": "passed"
});
formatter.match({
  "location": "AmazonTest.clicks_on_See_All_Details()"
});
formatter.result({
  "duration": 10809152316,
  "status": "passed"
});
formatter.match({
  "location": "AmazonTest.all_Details_should_be_shown_on_New_Tab()"
});
formatter.result({
  "duration": 34007618567,
  "status": "passed"
});
formatter.match({
  "location": "AmazonTest.click_on_Category_Link()"
});
formatter.result({
  "duration": 4023599128,
  "status": "passed"
});
formatter.match({
  "location": "AmazonTest.user_Select_Baby_Products_and_Beauty_options()"
});
formatter.result({
  "duration": 13574103116,
  "status": "passed"
});
formatter.match({
  "location": "AmazonTest.snapshot_should_be_taken()"
});
formatter.result({
  "duration": 99690625219,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Sign In Into Amazon site",
  "description": "",
  "id": "amazon-application-testing;sign-in-into-amazon-site",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@TAG1"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "User Navigates back to Amazon Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User Clicks on Sign In",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Enters valid mobile number \"9960332010\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Login should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonTest.user_Navigates_back_to_Amazon_Home_Page()"
});
formatter.result({
  "duration": 1830171987,
  "status": "passed"
});
formatter.match({
  "location": "AmazonTest.user_Clicks_on_Sign_In()"
});
formatter.result({
  "duration": 5772005655,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9960332010",
      "offset": 28
    }
  ],
  "location": "AmazonTest.enters_valid_mobile_number(String)"
});
formatter.result({
  "duration": 49319071047,
  "status": "passed"
});
formatter.match({
  "location": "AmazonTest.login_should_be_successful()"
});
formatter.result({
  "duration": 1903182749,
  "status": "passed"
});
});