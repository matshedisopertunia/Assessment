package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageObjects
{
    WebDriver driver;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
    public WebElement register_button;

    @FindBy(css = "#gender-female")
    public WebElement gender_radio_button;

    @FindBy(css = "#FirstName")
    public WebElement first_name;

    @FindBy(css = "#LastName")
    public WebElement last_name;

    @FindBy(css = "#GBddK6 > div > label > input[type=checkbox]")
    public WebElement verify_human;

    @FindBy(css = "#Email")
    public WebElement email;

    @FindBy(css = "#Password")
    public WebElement password;

    @FindBy(css = "#ConfirmPassword")
    public WebElement confirm_password;

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement register;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    public WebElement logoutButton;

    public RegistrationPageObjects(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

}
