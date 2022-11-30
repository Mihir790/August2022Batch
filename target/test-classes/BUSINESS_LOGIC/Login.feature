Feature: Login functionality

Background: User successfully clicked on initial login page
When user provide "webdriver.chrome.driver" and exe location as "D:\\Automation Support\\chromedriver.exe"
When user provide url as "https://www.flipkart.com/"
When user cancel initial login page

@SmokeTest
Scenario: Login functionality with valid username and valid password
When user navigate to login
When user click on My Profile
When user enter "7219300620" as username
When user enter "Mhkkul@56" as password
When user click on login page
Then application shows user profile to user







