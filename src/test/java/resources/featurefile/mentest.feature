Feature: MenTest
@smoke @regression
  Scenario: As a user I Should Add Product SuccessFully To Shoppin Cart
    When I am on homepage
    And I Mouse Hover on Men Menu
    And I Mouse Hover on Bottoms
    And I Click on Pants
    And I Mouse Hover on product name Cronus Yoga Pant and click on size 32.
    And Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
    And  Mouse Hover on product name Cronus Yoga Pant and click on Add To Cart Button.
    And  Verify the text 'You added Cronus Yoga Pant to your shopping cart.'
    And Click on shopping cart Link into message
    And  Verify the text 'Shopping Cart.'
    And Verify the product name 'Cronus Yoga Pant'
    And Verify the product size "32"
    Then  Verify the product colour "Black"