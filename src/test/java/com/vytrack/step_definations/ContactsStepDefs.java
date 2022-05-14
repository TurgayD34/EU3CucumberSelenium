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
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class ContactsStepDefs {

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        // go to login page
        Driver.get().get(ConfigurationReader.get("url"));

        // based on input enter that user information
        String username = null;
        String password = null;

        if (userType.equals("driver")){
            username = ConfigurationReader.get("driver_username");
            password = ConfigurationReader.get("driver_password");
        }else if (userType.equals("sales manager")){
            username = ConfigurationReader.get("salesmanager_username");
            password = ConfigurationReader.get("salesmanager_password");
        }else if (userType.equals("store manager")){
            username = ConfigurationReader.get("storemanager_username");
            password = ConfigurationReader.get("storemanager_password");
        }

        // send username and password and login
        new LoginPage().login(username, password);
    }
    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> menuOptions) {
        System.out.println("menuOptions.size() = " + menuOptions.size());
        // get the list of elements and convert them to list of string and assert
        List<String> actualoptions = BrowserUtils.getElementsText(new DashboardPage().menuOptions);

        Assert.assertEquals(menuOptions, actualoptions);
        System.out.println("actualoptions = " + actualoptions);
        System.out.println("menuOptions = " + menuOptions);
    }
    @When("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String, String> userInfo) {
        //Use map information to login and also verify firstname and lastname
        //Login with map info
        new LoginPage().login(userInfo.get("username"),userInfo.get("password"));
        //Verify firstname and lastname
        String actualName = new DashboardPage().getUserName();
        String expectedName = userInfo.get("firstname")+" "+userInfo.get("lastname");
        Assert.assertEquals(actualName, expectedName);
        System.out.println("expectedName = " + expectedName);
        System.out.println("actualName = " + actualName);
        System.out.println("userInfo = " + userInfo);
    }
}
