package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US004pages {
    public US004pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "account-menu")
    public WebElement girisButonu;
    @FindBy(id = "login-item")
    public WebElement signInButonu;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement usernameTextbox;
    @FindBy(xpath = "//*[contains(text(),'Authentication information not correct.')]")
    public WebElement basarisizGirisDogrulama;
    @FindBy (xpath = "//*[text()='Batch81 Batch81']")
    public WebElement basariliGirisDogrulama;
    @FindBy (css = "input#rememberMe")
    public WebElement rememberMebutton;
    @FindBy (xpath = "//*[text()='Did you forget your password?']")
    public WebElement didYouForgetPasswordButton;
    @FindBy (xpath = "//*[text()='Register a new account']")
    public WebElement registerNewAccountButton;
    @FindBy (xpath = "//*[text()='Cancel']")
    public WebElement cancelButton;
}
