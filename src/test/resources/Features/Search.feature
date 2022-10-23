Feature: Amazon Search

@Smoke
Scenario: Search a Product MacBook Air
Given I have a Search field on Amazon Page
When I search a product with name "Apple MacBook Air" and price 1000
Then Product name with "Apple MacBook Air" should be displayed
Then Order id is 12345 and username is "Deepa"

@Regression
Scenario: Search a Product iPhone
Given I have a Search field on Amazon Page
When I search a product with name "Apple iPhone" and price 1200
Then Product name with "Apple iPhone" should be displayed
Then Order id is 5436 and username is "Raja"