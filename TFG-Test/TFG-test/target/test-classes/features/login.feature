Feature: Login

Scenario Outline: Inicia sessió

#wrong username
Given the user is in the login page
When the user enters the wrong username in the username bar
And the user enters the password in the password bar
And the user clicks the login button
Then the link is the same

#wrong password
Given the user is in the login page
When the user enters the username in the username bar
And the user enters the wrong password in the password bar
And the user clicks the login button
Then the link is the same

#happy path
Given the user is in the login page
When the user enters the username in the username bar
And the user enters the password in the password bar
And the user clicks the login button
Then the products list appears
