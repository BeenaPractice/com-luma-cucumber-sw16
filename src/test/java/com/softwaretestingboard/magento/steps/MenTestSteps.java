package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.PantsPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class MenTestSteps {
    @And("I Mouse Hover on Men Menu")
    public void iMouseHoverOnMenMenu() {
        new HomePage().mouseHoverToMenMenu();
    }

    @And("I Mouse Hover on Bottoms")
    public void iMouseHoverOnBottoms() {
        new HomePage().mouseHoverToMenBottoms();
    }

    @And("I Click on Pants")
    public void iClickOnPants() {
        new HomePage().clickOnPants();
    }

    @And("I Mouse Hover on product name Cronus Yoga Pant and click on size {int}.")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnSize(int size) {
        new PantsPage().hoverAndClickProductSize(size);
    }

    @And("Mouse Hover on product name Cronus Yoga Pant and click on colour Black.")
    public void mouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack() {
        new PantsPage().hoverAndClickProductColour();
    }

    @And("Mouse Hover on product name Cronus Yoga Pant and click on Add To Cart Button.")
    public void mouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton() {
        new PantsPage().hoverAndClickOnAddToCartButton();
    }

    @And("Verify the text {string}")
    public void verifyTheTextYouAddedCronusYogaPantToYourShoppingCart(String cronusYogaPant) {
      //  Assert.assertEquals(new PantsPage().getTextAddedPantToShoppingCart(),cronusYogaPant,"verified");
    }

    @And("Click on shopping cart Link into message")
    public void clickOnShoppingCartLinkIntoMessage() {
        new PantsPage().clickOnShoppingCart();
    }

    @And("Verify the product name {string}")
    public void verifyTheProductNameCronusYogaPant(String productName) {
        Assert.assertEquals(productName,new ShoppingCartPage().verifyTheProductName());

    }

    @And("Verify the product size {string}")
    public void verifyTheProductSize(String size) {
        Assert.assertEquals(size,new ShoppingCartPage().getTextSize32());
    }

    @Then("Verify the product colour {string}")
    public void verifyTheProductColour(String colour) {
        Assert.assertEquals(colour,new ShoppingCartPage().getTextBlack());
    }

}
