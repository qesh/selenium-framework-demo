package com.app.pages;

import com.app.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    public HomePage(){
        this.driver= Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement signIn;

    @FindBy(id = "ap_email")
    public WebElement email;

    @FindBy(id = "continue")
    public WebElement continue_button;

    @FindBy(id = "ap_password")
    public WebElement password;

    @FindBy(id = "signInSubmit")
    public WebElement login;

    @FindBy(id = "nav-link-accountList-nav-line-1")

    public WebElement list;

    @FindBy( xpath= "//span[@class='nav-text' and text() = 'Sign Out']")
    public WebElement logout;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchbox;

    @FindBy(id = "nav-search-submit-button")
    public WebElement srch_bttn;

    @FindBy(xpath = "//h2")
    public WebElement firstBook;

    @FindBy(id = "newBuyBoxPrice")
    public WebElement price1;

    @FindBy(xpath = "(//*[@class=\"a-color-price hlb-price a-inline-block a-text-bold\"])[1]")
    public WebElement price2;

    @FindBy(id = "add-to-cart-button")
    public WebElement cart;


}
