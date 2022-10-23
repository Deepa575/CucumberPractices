Feature: User Registration

Scenario: user registration with different data
	Given User is on registration page
	When User enters following user details
	 | Lalitha | palem | lalitha@gmail.com | 986532 | Bangalore |
	 | Manasa | ray | ray@gmail.com | 986532 | Pune |
	 | Prema | sam | prema@gmail.com | 986652 | Chennai |
	 | Saurav | dsou | dsau@gmail.com | 9865532 | Delhi |
	Then user registration should be successful
	
	Scenario: user registration with different data with columns
	Given User is on registration page
	When User enters following user details with columns
	 | firstname | lastname | email | phone | city |
	 | Lalitha | palem | lalitha@gmail.com | 986532 | Bangalore |
	 | Manasa | ray | ray@gmail.com | 986532 | Pune |
	 | Prema | sam | prema@gmail.com | 986652 | Chennai |
	 | Saurav | dsou | dsau@gmail.com | 9865532 | Delhi |
	Then user registration should be successful