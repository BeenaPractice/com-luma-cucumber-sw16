package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-4']//span[contains(text(),'Women')]")
    WebElement womenMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']")
    WebElement tops;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jackets;

    @CacheLookup
    @FindBy(css = "li.level0.nav-3>a.level-top.ui-corner-all>span:nth-of-type(1)")
    WebElement menMenu;

    @CacheLookup
    @FindBy(css = "#ui-id-18 span")
    WebElement menBottoms;

    @CacheLookup
    @FindBy(css = "#ui-id-23 span")
    WebElement menPants;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gearMenu;

    @CacheLookup
    @FindBy(css = "a[id='ui-id-25'] span")
    WebElement bags;

    public void mouseHoverToMenMenu() {
        log.info("mouse hoover to men menu");
        mouseHoverToElement(menMenu);

    }

    public void mouseHoverToMenBottoms() {
        log.info("mousehoover to men bottoms");
        mouseHoverToElement(menBottoms);

    }

    public void clickOnPants() {
        log.info("clickOnPants");
        mouseHoverToElementAndClick(menPants);

    }

    public void mouseHoverOnWomenMenu() {
        log.info("mouseHoverOnWomenMenu");
        mouseHoverToElement(womenMenu);

    }

    public void mouseHoverOnTops() {
        log.info("mouseHoverOnTops");
        mouseHoverToElement(tops);

    }

    public void clickOnJackets() {
        log.info("clickOnJackets");
        mouseHoverToElementAndClick(jackets);

    }

    public void mouseHOverOnGearManu() {
        log.info("mouseHOverOnGearManu");
        mouseHoverToElement(gearMenu);

    }

    public void clickOnBags() {
        log.info("clickOnBags");
        mouseHoverToElementAndClick(bags);

    }

}
