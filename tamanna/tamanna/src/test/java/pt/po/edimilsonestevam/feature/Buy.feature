#Author: Edimilson Estevam

@buy
Feature: Remove Products
  I want to remove products at the end of the purchase journey

  @buy-remove-products-cart
  Scenario Outline: Remove Products from Cart
		Given I have a visitor profile <profile> on Tamanna's website <mainUrl>
		When I choose a category <category> to choose a subcategory <subcategory> to buy two products from different categories
		And I choose the sizes of the products <size> to make the purchase
		And I check the product price <productPrice> and quantity of products <quantityProducts> in the purchase
		And I remove both products from the cart
		Then the system displays the zeroed total price <totalPrice>
		And I navigate to the Home of Tamanna's website <homeUrl>
    
    Examples: 
      | profile | mainUrl           | category | subcategory | size  | productPrice  | quantityProducts | totalPrice  | homeUrl                                 |
      | "Guest" | "www.tamanna.com" | "Men"    | "Clothing"  | "L"   | "KWD 50.600"  | "2"              | "KWD 0.000" | "https://www.tamanna.com/home/overview" |