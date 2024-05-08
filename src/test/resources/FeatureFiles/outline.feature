Feature:
	To check login functionality
Scenario Outline:
	To check valid email and pwd are not
Given user have to open chrome browser and instagram appliction
And To maximize the window and apply wait
When To pass the "<username>" and "<passward>" to cooressponding function
And To click login button
Then To close the browser
Examples:
	|username|passward|
	|alvin|abc|
	|alvinabc|efg|