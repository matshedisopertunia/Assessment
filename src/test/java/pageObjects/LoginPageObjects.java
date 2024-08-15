package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects
{
    WebDriver driver;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    public WebElement login_button;

    @FindBy(css = "#Email")
    public WebElement email_field;

    @FindBy(css = "#Password")
    public WebElement password_field;

    @FindBy(xpath = "//button[text()='Log in']")
    public WebElement login;

    @FindBy(xpath = "//select[@id='products-orderby']")
    public WebElement sortByDropDown;

    @FindBy(xpath = "//option[text()='Name: A to Z']")
    public WebElement sortOption;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
    public WebElement computer_tab;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/ul/li[1]/a")
    public WebElement desktop;

    @FindBy(xpath = "(//button[text()='Add to cart'])[1]")
    public WebElement first_desktop;

    @FindBy(xpath = "(//button[text()='Add to cart'])[2]")
    public WebElement second_desktop;

    @FindBy(xpath = "(//button[text()='Add to cart'])[3]")
    public WebElement third_desktop;

    @FindBy(xpath = "  //select[@id='product_attribute_2']")
    public WebElement ram_dropDown;

    @FindBy(xpath = "//option[text()='2 GB']")
    public WebElement ram_option;

    //
    public LoginPageObjects(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
}
