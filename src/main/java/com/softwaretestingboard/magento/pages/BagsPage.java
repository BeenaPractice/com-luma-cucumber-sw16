package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BagsPage extends Utility {
    private static final Logger log = LogManager.getLogger(BagsPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement productName;


    public void clickOnProduct() {
        log.info("click on product");
        clickOnElement(productName);

    }
}
