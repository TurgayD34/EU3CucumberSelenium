package com.vytrack.step_definations;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsDriver();

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        Assert.assertEquals(Driver.get().getCurrentUrl(), "https://qa1.vytrack.com/");
        Assert.assertEquals(Driver.get().getTitle(), "Dashboard");
    }
    @When("the user enters the sales information")
    public void the_user_enters_the_sales_information() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsSalesManager();
    }
    @When("the user enters the store manager information")
    public void the_user_enters_the_store_manager_information() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStoreManger();
    }
    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username , String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @Then("the title contains {string}")
    public void the_title_contains(String titleName) {
        System.out.println("titleName = " + titleName);
        BrowserUtils.waitFor(2);
        Assert.assertTrue(Driver.get().getTitle().contains(titleName));
    }
}
