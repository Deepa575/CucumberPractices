
@All
Feature: Uber Booking Feature


@Smoke
Scenario: Booking Cab sedan
Given User wants to select a car type "sedan" from uber application
When User selects car "sedan" and pick up point "Bangalore" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Smoke @Regression
Scenario: Booking Cab SUV
Given User wants to select a car type "SUV" from uber application
When User selects car "SUV" and pick up point "Bangalore" and drop location "Hyderabad"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Production
Scenario: Booking Cab for Mini
Given User wants to select a car type "mini" from uber application
When User selects car "mini" and pick up point "Mumbai" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD