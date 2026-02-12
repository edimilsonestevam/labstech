Feature: Login
  I want to access Sauce Demo to login

  @scenario-success-login
  Scenario Outline: User success login
    Given I am Sauce Demo page <url>
    When I inform username <username> in the Username field, password <password> in the Password field
    And I confirm action
    Then Sauce Demo will show products list <productFirst>, <productSecond>, <productThird>, <productFourth>, <productFifth>, <poductSixth>

    Examples: 
      | url                 | username        | password       | productFirst          | productSecond           | productThird              | productFourth              | productFifth        | poductSixth                         |
      | "www.google.com"    | "standard_user" | "secret_sauce" | "Sauce Labs Backpack" | "Sauce Labs Bike Light" | "Sauce Labs Bolt T-Shirt" | "Sauce Labs Fleece Jacket" | "Sauce Labs Onesie" | "Test.allTheThings() T-Shirt (Red)" |              
      | "www.saucedemo.com" | "standard_user" | "secret_sauce" | "Sauce Labs Backpack" | "Sauce Labs Bike Light" | "Sauce Labs Bolt T-Shirt" | "Sauce Labs Fleece Jacket" | "Sauce Labs Onesie" | "Test.allTheThings() T-Shirt (Red)" |