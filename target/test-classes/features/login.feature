#Feature: Login
#
#	Scenario: Login with valid credentials
#				Given I launch browser and navigate to the login page
#				When I enter valid username "rohityadav18" into username field
#				And I enter valid password "Rohit@1805" into password field
#				And I click on login button
#			Then i successfully login
#
#
     #Scenario: Login with invalid credentials
#				Given I launch browser and navigate to the login page
#				When I enter invalid username "rohy" into username field
#				And I enter invalid password "rohityy" into password field
#			And I click on login  button to login
#				Then i should not be successfully login and get an error
#
 #Scenario: Login with blank field
#				Given I launch browser and navigate to the login page
#				When I enter invalid username " " into username field
#				And I enter invalid password " " into password field
#			And I click on login  button to login
#			Then i should not be successfully login and get an error
#				
#				 Scenario: Login with incorrect password
#				 Given I launch browser and navigate to the login page
#				 When I enter valid username "rohityadav18" into username field
#				  And I enter invalid password "12345" into password field
#			   And I click on login  button to login
#				 Then i should not be successfully login and get an error
#
 #Homepage.feature
#
#Feature: Homepage functionality verification
  #Verify that the homepage navigation link and cursor work correctly.
#
  #Scenario: Verify homepage functionality
    #Given I launch the browser and navigate to the login page
    #When I click the homepage navigation link
    #And I click the homepage cursor
    #Then all functionality should work properly
#			 
#Feature: Add a product to the cart on Demoblaze
#
  #Scenario: Add a product to the cart and verify the alert
    #Given I am on the product page of Demoblaze
    #When I click on a product link "Sony Xperia"
    #And I click on the Add to Cart button
    #Then I should see an alert with the text "Product added"
#
  #Given I launch the browser and navigate to the page
    #When I click on a Logout button
    #And I click on the Add to Cart button
  #Scenario: Delete item from the cart
   #Given I launch browser and navigate to the login page
    #When I delete the item from the cart
    #Then The cart should be empty
#
  #Scenario: Place an order
    #Given I have an item "Sony vaio i5" with price "$790" in the cart
    #When I place an order
    #Then The order should be successfully placed
#
#
 