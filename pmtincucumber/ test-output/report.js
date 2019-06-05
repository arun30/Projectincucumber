$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PMTCategory.feature");
formatter.feature({
  "line": 1,
  "name": "PMT Add Product List",
  "description": "Description: User will add product category,sub category \u0026 part description",
  "id": "pmt-add-product-list",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "User will login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user will enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user will enter the username, password and click on login",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user will successfully login",
  "keyword": "Then "
});
formatter.match({
  "location": "TC002_PMTproductcategory.user_will_enter_the_url()"
});
formatter.result({
  "duration": 14721525924,
  "status": "passed"
});
formatter.match({
  "location": "TC002_PMTproductcategory.user_will_enter_the_username_password_and_click_on_login()"
});
formatter.result({
  "duration": 5635469442,
  "status": "passed"
});
formatter.match({
  "location": "TC002_PMTproductcategory.user_will_successfully_login()"
});
formatter.result({
  "duration": 10386053,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Adding product category",
  "description": "",
  "id": "pmt-add-product-list;adding-product-category",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User will mouseover and choose the product category page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User will click on the add button and add a new category",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User will enter the category name and choose the equivalent PIES category",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User will successfully added and verify that the record has come",
  "keyword": "Then "
});
formatter.match({
  "location": "TC002_PMTproductcategory.user_will_mouseover_and_choose_the_product_category_page()"
});
formatter.result({
  "duration": 8840375395,
  "status": "passed"
});
formatter.match({
  "location": "TC002_PMTproductcategory.user_will_click_on_the_add_button_and_add_a_new_category()"
});
formatter.result({
  "duration": 3088488866,
  "status": "passed"
});
formatter.match({
  "location": "TC002_PMTproductcategory.user_will_enter_the_category_name_and_choose_the_equivalent_PIES_category()"
});
formatter.result({
  "duration": 3405270596,
  "error_message": "org.openqa.selenium.NoAlertPresentException: no such alert\n  (Session info: chrome\u003d74.0.3729.169)\n  (Driver info: chromedriver\u003d74.0.3729.6 (255758eccf3d244491b8a1317aa76e1ce10d57e9-refs/branch-heads/3729@{#29}),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DT0137\u0027, ip: \u0027192.168.100.147\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 74.0.3729.6 (255758eccf3d24..., userDataDir: C:\\Users\\ARUNKU~1.APA\\AppDa...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:37727}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 74.0.3729.169, webStorageEnabled: true}\nSession ID: 49628b75b25e76893e37d3e3157e8a17\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.alert(RemoteWebDriver.java:932)\r\n\tat pmt.pageobjectmodel.Mastercategory_POM.acceptAlert(Mastercategory_POM.java:95)\r\n\tat pmt.testcases.stepdefinition.TC002_PMTproductcategory.user_will_enter_the_category_name_and_choose_the_equivalent_PIES_category(TC002_PMTproductcategory.java:64)\r\n\tat ✽.And User will enter the category name and choose the equivalent PIES category(PMTCategory.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TC002_PMTproductcategory.user_will_successfully_added_and_verify_that_the_record_has_come()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 4,
  "name": "User will login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user will enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user will enter the username, password and click on login",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user will successfully login",
  "keyword": "Then "
});
formatter.match({
  "location": "TC002_PMTproductcategory.user_will_enter_the_url()"
});
formatter.result({
  "duration": 7962200872,
  "status": "passed"
});
formatter.match({
  "location": "TC002_PMTproductcategory.user_will_enter_the_username_password_and_click_on_login()"
});
formatter.result({
  "duration": 5335629647,
  "status": "passed"
});
formatter.match({
  "location": "TC002_PMTproductcategory.user_will_successfully_login()"
});
formatter.result({
  "duration": 8242363,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Adding product sub category",
  "description": "",
  "id": "pmt-add-product-list;adding-product-sub-category",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "User will go to master and choose product sub category",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User will click on the add button and choose the category drop down list",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User will enter the sub category name  and choose the equivalent and save button is clicked",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User will successfully added and verify the record has come",
  "keyword": "Then "
});
formatter.match({
  "location": "TC002_PMTproductcategory.user_will_go_to_master_and_choose_product_sub_category()"
});
formatter.result({
  "duration": 5730099027,
  "status": "passed"
});
formatter.match({
  "location": "TC002_PMTproductcategory.user_will_click_on_the_add_button_and_choose_the_category_drop_down_list()"
});
formatter.result({
  "duration": 5250407136,
  "status": "passed"
});
formatter.match({
  "location": "TC002_PMTproductcategory.user_will_ente_the_sub_category_name_and_choose_the_equivalent_and_save_button_is_clicked()"
});
formatter.result({
  "duration": 47610293420,
  "error_message": "java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:97)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy17.sendKeys(Unknown Source)\r\n\tat pmt.pageobjectmodel.Mastercategory_POM.entrysubcategory(Mastercategory_POM.java:134)\r\n\tat pmt.testcases.stepdefinition.TC002_PMTproductcategory.user_will_ente_the_sub_category_name_and_choose_the_equivalent_and_save_button_is_clicked(TC002_PMTproductcategory.java:98)\r\n\tat ✽.And User will enter the sub category name  and choose the equivalent and save button is clicked(PMTCategory.feature:18)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TC002_PMTproductcategory.user_will_successfully_added_and_verify_the_record_has_come()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 4,
  "name": "User will login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user will enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user will enter the username, password and click on login",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user will successfully login",
  "keyword": "Then "
});
formatter.match({
  "location": "TC002_PMTproductcategory.user_will_enter_the_url()"
});
