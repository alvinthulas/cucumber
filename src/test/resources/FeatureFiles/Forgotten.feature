
@forgot
Feature:
	 To validate the forgotten pwd functionality of instagram
@smoke
Scenario:
	 To check with invalid phone number
	 

When To pass the invalid phone number to cooresponding field 
And To check otp is passed or not

@sanity
Scenario:
	To check with valid phonenumber
When To pass the invalid phone number to cooresponding field 
And To check otp is passed or not

@data
Scenario:
 	To check with valid email and invalid passward
 	
 Given To pass the email and passward 
  |email          |pwd|
 	|alvin@gmail.com|12345|
 	|abcd@gmail.com|efg|
 When To click login button

