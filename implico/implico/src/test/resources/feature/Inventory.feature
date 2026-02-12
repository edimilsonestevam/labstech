Feature: Inventory
  I want to add  two in the cart

  @scenario-success-buy
  Scenario Outline: User success buy
    Given I am Inventory page <url>
    When I add two products <productFirst>, <productSecond> in the cart
    Then Sauce Demo will show the quantity of products <quantityCurrentProduct> in the cart

    Examples: 
      | url                                | productFirst          | productSecond           | quantityCurrentProduct |
      | "www.saucedemo.com/inventory.html" | "Sauce Labs Backpack" | "Sauce Labs Bike Light" | "2"                    |             