package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedmeminPages {

    public MedmeminPages() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountMenu;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement dropSign;

    @FindBy(xpath = "//input[@placeholder='Your username']")
    public WebElement username;

    @FindBy(xpath = "//input[@placeholder='Your password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement signIn;

    @FindBy(xpath = "//li[@class='dropdown nav-item']")
    public WebElement signAcoountMenu;

    @FindBy(xpath = "//a[@href='/account/settings']")
    public WebElement settings;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstNameValu;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastNameValue;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailValue;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveBut;

    @FindBy (xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement succes;

    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement myPages;

    @FindBy (xpath = "//a[@href='/physician-appointment'][1]")
    public WebElement myAppointment;

    @FindBy (xpath = "//tbody")
    public WebElement bodyAppoint;

    @FindBy (xpath = "//thead//th[1]")
    public WebElement idHead;

    @FindBy (xpath = "//thead//th[2]")
    public WebElement sdtHead;

    @FindBy (xpath = "//thead//th[3]")
    public WebElement edtHead;

    @FindBy (xpath = "//thead//th[4]")
    public WebElement statusHead;

    @FindBy (xpath = "//input[@id='fromDate']")
    public WebElement fromDate;

    @FindBy (xpath = "//input[@id='toDate']")
    public WebElement toDate;
}