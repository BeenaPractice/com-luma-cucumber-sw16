package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PantsPage extends Utility {
    private static final Logger log = LogManager.getLogger(PantsPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement productName;

    @CacheLookup
    @FindBy(css = "[data-role=\"swatch-option-880\"][data-rendered=\"true\"] .swatch-option.text")
    WebElement  size32;
    @CacheLookup
    @FindBy(css = "[data-role=\"swatch-option-880\"][data-rendered=\"true\"] .swatch-option.text")
    WebElement colourBlack;
    @CacheLookup
    @FindBy(xpath =" //li[1]//div[1]//div[1]//div[3]//div[1]//div[1]//form[1]//button[1]//span[1]")
    WebElement addToCartButton;


    @CacheLookup
    @FindBy(css = "[data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]")
    WebElement addedPant;
    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='shopping cart']")
    WebElement linkShoppingCart;
    //a[normalize-space()='shopping cart']

    public void hoverAndClickProductSize(int size) {
        log.info("hoverAndClickProduct");
        mouseHoverToElement(productName);
        mouseHoverToElementAndClick(size32);

    }

    public void hoverAndClickProductColour() {
        log.info("hoverAndClickProductColour");
       // mouseHoverToElement(productName);
        mouseHoverToElementAndClick(colourBlack);
    }

    public void hoverAndClickOnAddToCartButton() {
        log.info("hoverAndClickOnAddToCartButton");
        mouseHoverToElement(productName);
        mouseHoverToElementAndClick(addToCartButton);
    }

    public String getTextAddedPantToShoppingCart() {
        log.info("getTextAddedPantToShoppingCart");
        return getTextFromElement(addedPant);
    }

    public void clickOnShoppingCart() {
        log.info("clickOnShoppingCart");
        clickOnElement(linkShoppingCart);

    }
}
