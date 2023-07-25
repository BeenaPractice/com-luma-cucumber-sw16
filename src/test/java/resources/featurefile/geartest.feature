Feature: Gear Test
@smoke @regression
  Scenario: As a user I Should Add Product SuccessFully To Shopping Cart()
    Given I am on homepage
    When I  Mouse Hover on Gear Menu
    And Click on Bags
    And Click on Product Name Overnight Duffle
    And I Verify the text "Overnight Duffle"
    And Change Qty "3"
    And Click on Add to Cart Button.
    And I Verify the textof "You added Overnight Duffle to your shopping cart."
    And I Click on shopping cart Link into message
    And I Verify the product name "Overnight Duffle"
    And I Verify the Qty is "3"
    And I Verify the product price "$135.00"
    And I Change Qty to "5"
    And I Click on Update Shopping Cart button
    Then I Verify the product price "$225.00"