package com.vytrack.step_definations;

import com.vytrack.pages.ContactPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDef {

    @When("the user is on the fleet page")
    public void the_user_is_on_the_fleet_page() {
        System.out.println("Fleet page");
    }

    @When("the user navigate fleet to vehicles")
    public void the_user_navigate_fleet_to_vehicles() {
        System.out.println("Navigate fleet to vehicles");
    }

    @Then("expected title is vehicles")
    public void expected_title_is_vehicles() {
        System.out.println("Vehicles page");
    }

    @When("the user is on the marketing page")
    public void the_user_is_on_the_marketing_page() {
        System.out.println("Marketing page");
    }

    @When("the user navigate marketing to campaigns")
    public void the_user_navigate_marketing_to_campaigns() {
        System.out.println("Navigate marketing to campaigns");
    }

    @Then("expected title is campaigns")
    public void expected_title_is_campaigns() {
        System.out.println("Campaigns page");
    }

    @When("the user is on the activities page")
    public void the_user_is_on_the_activities_page() {
        System.out.println("Activities page");
    }

    @When("the user navigate activities to calender events")
    public void the_user_navigate_activities_to_calender_events() {
        System.out.println("Navigate activities to calender events");
    }

    @Then("expected title is calender events")
    public void expected_title_is_calender_events() {
        System.out.println("Calender events page");
    }

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        DashboardPage dashboardPage = new DashboardPage();
//        dashboardPage.waitUntilLoaderScreenDisappear();
        dashboardPage.navigateToModule(tab, module);
    }
    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer pageNum) {
        BrowserUtils.waitFor(3);
        ContactPage contactPage = new ContactPage();
        contactPage.waitUntilLoaderScreenDisappear();
        Integer actualNumber = Integer.parseInt(contactPage.pageNumber.getAttribute("value"));
        Assert.assertEquals(pageNum, actualNumber);
    }
}
