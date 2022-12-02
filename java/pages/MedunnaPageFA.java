package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPageFA {
    public MedunnaPageFA(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //US_002
    @FindBy(xpath = "//*[@id=\"account-menu\"]")
    public WebElement accountMenuFA;

    @FindBy(xpath = "//*[@id=\"account-menu\"]/div/a[2]/span")
    public WebElement registerFristFA;

    @FindBy(xpath = "//input[@id=\"ssn\"]")
    public WebElement ssnFA;

    @FindBy(xpath = "//input[@id=\"firstName\"]")
    public WebElement firstnameFA;

    @FindBy(xpath = "//input[@id=\"lastName\"]")
    public WebElement lastnameFA;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement usernameFA;

    @FindBy(xpath = "/html/body/div/div/div/div[4]/div/div/div/div[2]/div/form/div[5]/input")
    public WebElement emailFA;

    @FindBy(xpath = "//input[@id=\"firstPassword\"]")
    public WebElement firstPasswordFA;

    @FindBy(xpath = "//input[@id=\"secondPassword\"]")
    public WebElement comfirmationPasswordFA;

    @FindBy(xpath = "//button[@id=\"register-submit\"]")
    public WebElement registerSubmitFA;

    @FindBy(xpath ="//div[@style=\"pointer-events: none;\"]")
    public WebElement registerSavedFA;

    @FindBy(xpath = "//div[text()='Your username is required.']")
    public WebElement yourUserNameisRequiredFA;
    @FindBy(xpath = "//div[text()='This field is invalid']")
    public WebElement thisFiledisInvalidFA;
    @FindBy(xpath = "//div[text()='Your username is invalid.']")
    public WebElement yourUserNameisInvalidFA;

}
