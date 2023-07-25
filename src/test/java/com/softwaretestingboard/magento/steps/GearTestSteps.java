package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ProductPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class GearTestSteps {
    @When("I  Mouse Hover on Gear Menu")
    public void iMouseHoverOnGearMenu() {
        new HomePage().mouseHOverOnGearManu();
    }

    @And("Click on Bags")
    public void clickOnBags() {
        new HomePage().clickOnBags();
    }

    @And("Click on Product Name Overnight Duffle")
    public void clickOnProductNameOvernightDuffle() {
        new BagsPage().clickOnProduct();
    }

    @And("I Verify the text {string}")
    public void iVerifyTheText(String productName) {
        Assert.assertEquals(new ProductPage().verifyOvernightDuffleText(),productName);
    }
    @And("Change Qty {string}")
    public void changeQty(String qty) {
        new ProductPage().changeQuantity(qty);
    }
    @And("Click on Add to Cart Button.")
    public void clickOnAddToCartButton() {
        new ProductPage().addToCart();


    }
    @And("I Verify the textof {string}")
    public void iVerifyTheTextof(String productText) {
       new ProductPage().verifyProductAddText();
    }

    @And("I Click on shopping cart Link into message")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new ProductPage().clickOnShoppingCart();
    }

    @And("I Verify the product name {string}")
    public void iVerifyTheProductName(String expectedMessage) {
        Assert.assertEquals(new ShoppingCartPage().verifyTheProductName(),expectedMessage);
    }

    @And("I Verify the Qty is {string}")
    public void iVerifyTheQtyIs(String qty) {
        Assert.assertEquals(new ShoppingCartPage().verifyTheProductQty(),qty);
    }

    @And("I Verify the product price {string}")
    public void iVerifyTheProductPrice(String price) {
        Assert.assertEquals(new ShoppingCartPage().verifyTheProductPrice(price),price);
    }

    @And("I Change Qty to {string}")
    public void iChangeQtyTo(String qty) throws InterruptedException {
        new ShoppingCartPage().updateTheQuantity(qty);
    }

    @And("I Click on Update Shopping Cart button")
    public void iClickOnUpdateShoppingCartButton() {
        new ShoppingCartPage().clickOnUpdateShoppingCart();
    }
}
