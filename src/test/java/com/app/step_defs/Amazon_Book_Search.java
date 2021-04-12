package com.app.step_defs;

import com.app.pages.HomePage;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.sql.SQLOutput;

public class Amazon_Book_Search {

    private WebDriver driver = Driver.getDriver();
    HomePage home = new HomePage();
    String price1, price2;

    @Given("User on main page")
    public void user_on_main_page() {
        driver.get(ConfigurationReader.getProperty("url"));
    }
    @When("User searches for {string} book and click to the first one")
    public void user_searches_for_book_and_click_to_the_first_one(String book ) throws InterruptedException {
        book = ConfigurationReader.getProperty("book");
        home.searchbox.sendKeys(book);
        home.srch_bttn.click();
        home.firstBook.click();


        Thread.sleep(100);

    }
    @When("User assets the price and add to cart")
    public void user_assets_the_price_and_add_to_cart() {

      price1= home.price1.getText();
      home.cart.click();

    }
    @When("User goes to cart and assets the price")
    public void user_goes_to_cart_and_assets_the_price() {

        price2=home.price2.getText();
    }
    @Then("User asserts the prices")
    public void user_asserts_the_prices() {

        Assert.assertEquals(price1, price2, "Two Price are equal.");

    }
}
