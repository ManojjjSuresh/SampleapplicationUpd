$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/feature/Whatsapp.feature");
formatter.feature({
  "line": 1,
  "name": "Whatsapp test",
  "description": "",
  "id": "whatsapp-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 927856890,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should be notified if whatsapp application is open in some other tab of the same browser",
  "description": "",
  "id": "whatsapp-test;user-should-be-notified-if-whatsapp-application-is-open-in-some-other-tab-of-the-same-browser",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TC01"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Login screen of whatsapp web application is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User opens whatsapp web application in a new tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Switches back to previous tab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "A popup with the message \u0027Whatsapp is open in another window. Click \"Use Here\" to use WhatsApp in this window\u0027 should be displayed with \u0027CLOSE\u0027 \u0026 \u0027USE HERE\u0027 options",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.login_screen_of_whatsapp_web_application_is_displayed()"
});
formatter.result({
  "duration": 34421627939,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_opens_whatsapp_web_application_in_a_new_tab()"
});
formatter.result({
  "duration": 12008472462,
  "status": "passed"
});
formatter.match({
  "location": "steps.switches_back_to_previous_tab()"
});
formatter.result({
  "duration": 66104930,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Use Here",
      "offset": 69
    }
  ],
  "location": "steps.a_popup_with_the_message_whatsapp_is_open_in_another_window_click_something_to_use_whatsapp_in_this_window_should_be_displayed_with_close_use_here_options(String)"
});
formatter.result({
  "duration": 5017147521,
  "status": "passed"
});
formatter.after({
  "duration": 1434624016,
  "status": "passed"
});
formatter.before({
  "duration": 426613,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login page of whatsapp should get loaded by clicking on \u0027USE HERE\u0027 and in the previous tab the popup should be displayed",
  "description": "",
  "id": "whatsapp-test;login-page-of-whatsapp-should-get-loaded-by-clicking-on-\u0027use-here\u0027-and-in-the-previous-tab-the-popup-should-be-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@TC02"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "A popup with the message \u0027 Whatsapp is open in another window. Click \"Use Here\" to use WhatsApp in this window\u0027 and options \u0027CLOSE\u0027 \u0026 \u0027USE HERE\u0027 is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User clicks on \u0027USE HERE\u0027 option",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "In the previous tab, popup with message  \u0027Whatsapp is open in another window. Click \"Use Here\" to use WhatsApp in this window\u0027 and options \u0027CLOSE\u0027 \u0026 \u0027USE HERE\u0027 should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Login page of whatsapp should get loaded",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Use Here",
      "offset": 70
    }
  ],
  "location": "steps.a_popup_with_the_message_whatsapp_is_open_in_another_window_click_something_to_use_whatsapp_in_this_window_and_options_close_use_here_is_displayed(String)"
});
formatter.result({
  "duration": 451602,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_clicks_on_use_here_option()"
});
formatter.result({
  "duration": 5010353397,
  "error_message": "java.lang.NullPointerException\r\n\tat Cucumber.steps.user_clicks_on_use_here_option(steps.java:93)\r\n\tat ✽.When User clicks on \u0027USE HERE\u0027 option(src/test/feature/Whatsapp.feature:14)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 274892711,
  "status": "passed"
});
});