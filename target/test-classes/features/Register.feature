Feature: User is able to create new account
  @12345
  Scenario: Register a new user successfully

    Given I navigate to automationexercise.com
    Then I should see the home page successfully
    When I click on the Signup Login button
    Then I should see "New User Signup!" text
    When I enter a name "jasdeep singh" and email address "jasdeeps427@yopmail.com"
    And I click on the Signup button
    Then I should see "ENTER ACCOUNT INFORMATION" text
    When I fill in account details:
      | Title | Name | Email            | Password    | Date of Birth |
      | Mr.   | John | test@example.com | password123 | 22/11/2000    |
    And I select "Sign up for our newsletter!"
    And I select "Receive special offers from our partners!"
    And I fill in personal details:
      | First Name | Last Name | Company | Address | Address2 | Country | State | City | Zipcode | Mobile Number |
      | Jasdeep      | Singh       | ABC Inc | 123 St  | Apt 4B   | United States   | Uttar Pradesh    | LA   |   90001 |    1234567890 |
    And I click the Create Account button
    Then I should see "ACCOUNT CREATED!" text
    When I click on the Continue button
    Then I should see "Logged in as username" text
    Given I am logged in as "Jasdeep Singh"
    When I click the Delete Account button
    Then I should see 'ACCOUNT DELETED!' text
    When I click on the Continue button
    Then I should see the home page successfully
