package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pageObjects.LoginPageObjects;


public class LoginStepDefinition
{
     WebDriver driver;

    @Then("^I navigate to the site$")
    public void login()
    {
        driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();


    }
    @Then("I click login")
    public void iClickLogin()
    {
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.login_button.click();
    }

    @Then("I capture {string} and {string}")
    public void iCaptureAnd(String email_address, String password)
    {
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.email_field.sendKeys(email_address);
        loginPageObjects.password_field.sendKeys(password);
        loginPageObjects.login.click();
    }

    @Then("I click on computers tab")
    public void iClickOnComputersTab()
    {
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.computer_tab.click();
        loginPageObjects.desktop.click();
    }

    @Then("I click on desktops tab")
    public void iClickOnDesktopsTab()
    {
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.desktop.click();
        loginPageObjects.sortByDropDown.click();
        loginPageObjects.sortOption.isDisplayed();
        loginPageObjects.sortOption.click();

        Select select = new Select(loginPageObjects.sortOption);
        select.selectByVisibleText("Name: A to Z");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('dropdownId').blur();");

        //loginPageObjects.sortOption.click();
    }

    @Then("I add all desktops to cart")
    public void iAddAllDesktopsToCart()
    {
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);

        loginPageObjects.ram_dropDown.click();
        Select select = new Select(loginPageObjects.ram_dropDown);
        select.selectByValue("2 GB");

        //loginPageObjects.second_desktop.click();
        //loginPageObjects.third_desktop.click();
    }


}
