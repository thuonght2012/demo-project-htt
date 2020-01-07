package tests;

import cucumber.api.java.en.Given;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import runner.TestRunner;

import static runner.TestRunner.*;

public class PageProvider {
    private static LoginPage loginPage;

    public static LoginPage getLoginPage(){
        if (loginPage  == null) {
            loginPage = PageFactory.initElements(TestRunner.driver, LoginPage.class);
        }
        return loginPage;

    }
}
