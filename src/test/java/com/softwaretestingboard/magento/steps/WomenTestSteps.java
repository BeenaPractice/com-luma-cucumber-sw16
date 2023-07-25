package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.JacketPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WomenTestSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I mouse hover on Women menu")
    public void iMouseHoverOnWomenMenu() {
        new HomePage().mouseHoverOnWomenMenu();
    }

    @And("I mouse hover on Tops")
    public void iMouseHoverOnTops() {
        new HomePage().mouseHoverOnTops();
    }

    @And("I click on Jackets")
    public void iClickOnJackets() {
        new HomePage().clickOnJackets();
    }

    @And("I select sort By filter {string}")
    public void iSelectSortByFilter(String filter) {
        new JacketPage().selectProductNameFilter(filter);
    }

    @Then("Products names displayed in alphabetical order")
    public void productsNamesDisplayedInAlphabeticalOrder() {
        new JacketPage().verifyProductDisplayedInAlphabaticalOrder();
    }


    @Then("Verify the products price display in Low to High")
    public void verifyTheProductsPriceDisplayInLowToHigh() {
        new JacketPage().verifyProductDisplayedPriceFromLowToHigh();
    }
}
