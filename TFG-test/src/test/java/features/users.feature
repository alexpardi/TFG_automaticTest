Feature: Users

Scenario Outline: Crear i eliminar un usuari

#create user
Given the user is in the login page2
When the user enters the username in the username bar2
And the user enters the password in the password bar2
And the user clicks the login button2
And the user is in the create user page
And the user enters the usernameTest in the username bar
And the user enters the emailTest in the email bar
And the user enters the nameTest in the name bar
And the user enters the passwordTest in the password bar
And the user clicks the accept button2
Then is the same link

#create with repeated username
#Given the user is in the login page2
#When the user enters the username in the username bar2
#And the user enters the password in the password bar2
#And the user clicks the login button2
#And the user is in the create user page
#And the user enters the repeated usernameTest in the username bar
#And the user enters the emailTest in the email bar
#And the user enters the nameTest in the name bar
#And the user enters the passwordTest in the password bar
#And the user clicks the accept button2
#Then is the same link

#delete user
Given the user is in the login page2
When the user enters the username in the username bar2
And the user enters the password in the password bar2
And the user clicks the login button2
And the user is in the create user page
And the user enters the username2Test in the username2 bar
And the user clicks the accept2 button2
Then is the same link

#delete non-existing user
Given the user is in the login page2
When the user enters the username in the username bar2
And the user enters the password in the password bar2
And the user clicks the login button2
And the user is in the create user page
And the user enters the wrong username2Test in the username2 bar
And the user clicks the accept2 button2
Then is the same link
