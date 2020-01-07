package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static runner.TestRunner.driver;

public class LoginTest extends PageProvider {
    @Given("I open page at website (.*)$")
    public void user_already_on_home_page(String website) throws InterruptedException {
        Thread.sleep(3000);
        driver.get(website);
        driver.manage().window().maximize();
    }
    @When("^I click on login customer button$")
    public void clickToLogin() throws InterruptedException {
        Thread.sleep(3000);
        getLoginPage().setBtnClick();
    }
    @And("^I choose my username to login as (.*)$")
    public void chooseUsename(String name) throws InterruptedException {
        Thread.sleep(3000);
        getLoginPage().setUserSelect(name);
    }
    @Then("^I click submit Login$")
    public  void clickSubmit() throws InterruptedException {
        Thread.sleep(3000);
        getLoginPage().setBtnSubmit();
    }
}
