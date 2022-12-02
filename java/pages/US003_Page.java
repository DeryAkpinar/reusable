package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US003_Page {

    public US003_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@id='account-menu']")
    public WebElement girisIkon;

    @FindBy (xpath = "//*[text()='Register']")
    public WebElement registerLink;

    @FindBy (xpath = "//*[text()='Registration']")
    public WebElement registrationYazisi;

    @FindBy (xpath = "//*[@id='firstPassword']")
    public WebElement newPasswordKutusu;

    @FindBy (xpath = "(//*[@class='point'])[2]")
    public WebElement newPasswordIkinciSeviye;

    @FindBy (xpath = "(//*[@class='point'])[5]")
    public WebElement newPasswordBesinciSeviye;

    @FindBy (xpath = "//*[@id='secondPassword']")
    public WebElement newPasswordConfirmationKutusu;

    @FindBy (xpath = "(//*[text()='Register'])[2]")
    public WebElement registerSubmit;

    @FindBy (xpath = "//*[@class='invalid-feedback']")
    public WebElement sifreKisaUyariMesaji;

    @FindBy (xpath = "//*[@id='firstName']")
    public WebElement firstnameGiris;

    @FindBy (xpath = "//*[@id='ssn']")
    public WebElement sssnNoGiris;

    @FindBy (xpath = "//*[@id='lastName']")
    public WebElement lastnameGiris;

    @FindBy (xpath = "//*[@id='username']")
    public WebElement usernameGiris;

    @FindBy (xpath = "//*[@id='email']")
    public WebElement emailGiris;

    @FindBy (xpath = "//*[@class='Toastify__toast-body']")
    public WebElement basariliKayitGostergesi;

    @FindBy (xpath = "(//*[@class='point'])[1]")
    public WebElement newPasswordBirinciSeviye;

    @FindBy (xpath = "//div[@id='strength']")
    public WebElement newPasswordStrength;

}
