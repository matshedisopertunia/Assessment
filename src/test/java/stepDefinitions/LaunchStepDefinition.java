package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.RegistrationPageObjects;

public class LaunchStepDefinition
{
    WebDriver driver;


    @Test
    @Given("^I launch my website$")
    public void launch()
    {
        driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        //WebElement iframe = driver.findElement(By.tagName("iframe"));
        //driver.switchTo().frame(iframe);
        RegistrationPageObjects registrationPageObjects =new RegistrationPageObjects(driver);
        registrationPageObjects.register_button.click();
    }

    @Then("I capture my {string} and {string}")
    public void iCaptureMyAnd(String firstname, String lastname)
    {
        RegistrationPageObjects registrationPageObjects =new RegistrationPageObjects(driver);
        //registrationPageObjects.gender_radio_button.click();
        registrationPageObjects.first_name.sendKeys(firstname);
        registrationPageObjects.first_name.sendKeys(lastname);
    }

    @Then("I capture my {string} address")
    public void iCaptureMyAddress(String emailAddress)
    {
        RegistrationPageObjects registrationPageObjects =new RegistrationPageObjects(driver);
        registrationPageObjects.email.sendKeys(emailAddress);
    }

    @And("I create my {string} and {string}")
    public void iCreateMyAnd(String password, String confirmPassword)
    {
        RegistrationPageObjects registrationPageObjects =new RegistrationPageObjects(driver);
        registrationPageObjects.password.sendKeys(password);
        registrationPageObjects.confirm_password.sendKeys(confirmPassword);
    }

    @Then("I click on register")
    public void iClickOnRegister()
    {
        RegistrationPageObjects registrationPageObjects =new RegistrationPageObjects(driver);
        registrationPageObjects.register.click();

        //Extract the registration text
        //
        //WebElement registrationSuccessText = driver.findElement(By.xpath("Your registration completed"));
        //registrationSuccessText.getText();
        //Printing the success registration text to the console..
        //System.out.println(registrationSuccessText.getText());
    }

    @And("I logout")
    public void iLogout()
    {
        RegistrationPageObjects registrationPageObjects =new RegistrationPageObjects(driver);
        registrationPageObjects.logoutButton.click();
        driver.close();
    }
}
