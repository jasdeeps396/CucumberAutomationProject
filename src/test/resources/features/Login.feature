  Feature: User Login
  As a registered user
  I want to log in with my correct email and password
  So that I can access my account

  Scenario: Successful Login with Correct Credentials
  
    Given I navigate to 'http://automationexercise.com'
    Then I should see the home page successfully
    When I click on the 'Signup / Login' button
    Then I should see 'Login to your account' visible
    When I enter a valid email address and password
    And I click the 'login' button
    Then I should see 'Logged in as username' visible    
    
#	Scenario Outline: Unsuccessful login with invalid credentials
   #
    #And   I have entered invalid <username> and <password>
    #When  I click on the login button
    #Then  I should get invalid creds message <messages>
    #
    #Examples:
    #	| username          |  password       | messages                                              |
    #	| invalid@email.com | invalidPassword | Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour. |
    #	| abcccc            | validPassword   | Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour. |
    #	| valid@email.com   | abccc           | Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour. |
    #

    
    
   

