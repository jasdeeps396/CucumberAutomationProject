  Feature: User Login
  As a registered user
  I want to log in with my correct email and password
  So that I can access my account
  @login
  Scenario: Successful Login with Correct Credentials
  
    Given I navigate to automationexercise.com
    Then I should see the home page successfully
    When I click on the Signup Login button
    Then I should see Login to your account visible
    When I enter a valid email address jasdeeps426@yopmail.com and password Test@1234
    And I click the login button
    Then I should see Logged in as username visible
    
  @login  
  Scenario: Successful Login with incorrect Credentials
  
    Given I navigate to automationexercise.com
    Then I should see the home page successfully
    When I click on the Signup Login button
    Then I should see Login to your account visible
    When I enter a invalid email address and password 
    And I click the login button
    Then I should see "Your email or password is incorrect!" text
 
  @login
  Scenario: User logs out successfully after logging in
  
    Given I navigate to automationexercise.com
    Then I should see the home page successfully
    When I click on the Signup Login button
    Then I should see Login to your account visible
    When I enter a valid email address jasdeeps426@yopmail.com and password Test@1234
    And I click the login button
    Then I should see Logged in as username visible   
    When I click on logout button
    Then I should see Login to your account visible
        
    


    
    
   

