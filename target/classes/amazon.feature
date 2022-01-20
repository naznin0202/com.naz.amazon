Feature: Amazon Customer Service

@naz1
Scenario: Verify amazon home page has customer service link
Given Launch Amazon url
Then Verify amazon home page has customer service link

@naz2
Scenario: Verify amazon displays customer service page
Given Launch Amazon url
Then Click the customer service link
Then Verify amazon displays customer service page

I have converted my test cases into BDD format