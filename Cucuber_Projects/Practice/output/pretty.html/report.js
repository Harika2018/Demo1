$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/harik/eclipse-workspace/practice/Practice/src/main/java/Features/sampleFeatures.feature");
formatter.feature({
  "line": 1,
  "name": "Sample features",
  "description": "",
  "id": "sample-features",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "validate facebook image",
  "description": "",
  "id": "sample-features;validate-facebook-image",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user opens the facebook url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is able to click on fb image",
  "keyword": "Then "
});
formatter.match({
  "location": "StepImplementations.open_fb_url()"
});
formatter.result({
  "duration": 34018232400,
  "status": "passed"
});
formatter.match({
  "location": "StepImplementations.user_is_able_to_click_on_fb_image()"
});
formatter.result({
  "duration": 487832600,
  "status": "passed"
});
});