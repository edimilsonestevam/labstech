Feature: Login
  I would like to access Sauce Demo to login

  @scenario-success-login
  Scenario Outline: User success login
    Given I am Sauce Demo page <url>
    When I inform username <username> in the Username field
    And I inform password <password> in the Password field
    And I confirm action
    Then Sauce Demo will show products list <product_first>, <product_second>, <product_third>, <product_fourth>, <product_fifth>, <poduct_sixth>

    Examples: 
      | url                 | username        | password       | product_first         | product_second          | product_third             | product_fourth             | product_fifth       | poduct_sixth                        |
      | "www.saucedemo.com" | "standard_user" | "secret_sauce" | "Sauce Labs Backpack" | "Sauce Labs Bike Light" | "Sauce Labs Bolt T-Shirt" | "Sauce Labs Fleece Jacket" | "Sauce Labs Onesie" | "Test.allTheThings() T-Shirt (Red)" |              