Feature: addProd

Scenario Outline: Afegeix Productes

#repeated id
Given the user is in the login page1
When the user enters the username in the username bar1
And the user enters the password in the password bar1
And the user clicks the login button1
And the user is in the add product page
And the user enters the wrong id in the id bar
And the user enters the name in the name bar
And the user enters the description in the description bar
And the user enters the price in the price bar
And the user enters the brand in the brand bar
And the user enters the image in the image bar
And the user enters the sport in the sport bar
And the user enters the product type in the product type bar
And the user enters the size in the size bar
And the user clicks the accept button
Then the producte is not added

#happy path
Given the user is in the login page1
When the user enters the username in the username bar1
And the user enters the password in the password bar1
And the user clicks the login button1
And the user is in the add product page
And the user enters the id in the id bar
And the user enters the name in the name bar
And the user enters the description in the description bar
And the user enters the price in the price bar
And the user enters the brand in the brand bar
And the user enters the image in the image bar
And the user enters the sport in the sport bar
And the user enters the product type in the product type bar
And the user enters the size in the size bar
And the user clicks the accept button
Then the producte is added
