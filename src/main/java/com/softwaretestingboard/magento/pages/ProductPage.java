package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(PantsPage.class.getName());
    @CacheLookup
    @FindBy(xpath ="//span[@class='base']")
    WebElement productText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement changeQty;

    @CacheLookup
    @FindBy(xpath ="//button[@id='product-addtocart-button']")
    WebElement addToCartButton;
    // this is xpath for add to cart button
    ////span[normalize-space()='Add to Cart']
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addedProductText;

    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='shopping cart']")
    WebElement linkShoppingCart;

    public String verifyOvernightDuffleText() {
        log.info("verifyOvernightDuffleText");
        return getTextFromElement(productText);
    }

    public void changeQuantity(String qty) {
        log.info("changeQuantity");
        sendTextToElement(changeQty, Keys.BACK_SPACE + qty);


    }

    public void addToCart() {
        log.info("addToCart");
        clickOnElement(addToCartButton);

    }

    public String verifyProductAddText() {
        log.info("verifyProductAddText");
        return getTextFromElement(addedProductText);
    }

    public void clickOnShoppingCart() {
        log.info("clickOnShoppingCart");
        clickOnElement(linkShoppingCart);

    }
}
