package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class StaffPage {
    public StaffPage() { PageFactory.initElements(Driver.getDriver(), this);     }

   @FindBy(xpath = "//*[@id='account-menu']")
    public WebElement accountMenu;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement accountSignIn;

    @FindBy(xpath = "//input[@name=\"username\"]")
    public WebElement signInUserName;

    @FindBy(xpath = "//input[@name=\"password\"]")
    public WebElement signInPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement myPages;

    @FindBy(xpath = "//span[contains(text(),'Search Patient')]")
    public WebElement searchPatients;

    @FindBy(xpath = "//tbody//td")
    public List<WebElement> tablePatientsCellsInfo;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm'][1]")
    public WebElement editButton;

    @FindBy(xpath = "//input[@name='id']")
    public WebElement patientIdInfoEdit;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement patientFirstNameInfoEdit;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement patientLastNameInfoEdit;

    @FindBy(xpath = "//textarea[@id='patient-description']")
    public WebElement patientDescriptionInfoEdit;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement patientInfoEditSaveButton;

    @FindBy(xpath = "//a[@class='btn btn-info btn-sm'][1]")
    public WebElement adminviewUpdate;

    @FindBy(xpath="//input[@name='ssn']")
    public WebElement ssnBox;

    @FindBy(xpath = "//*[text()='View']")
    public WebElement viewButton;

    @FindBy(xpath = "//*[text()='Patient']")
    public WebElement viewControl;

    @FindBy (xpath = "//dd")
    public List<WebElement> viewPatientInfo;

    @FindBy(xpath = "//*[text()='Edit']")
    public WebElement stateUpdateEdit;

    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement adminItemsTitlesMenu;

    @FindBy(xpath = "//span[contains(text(),'Patient')]")
    public WebElement adminPatient;

    @FindBy(xpath = "//*[text()='Create a new Patient']")
    public WebElement createANewPatientButton;

    @FindBy(xpath = "//*[text()='Country']")
    public WebElement countryScroll;
    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement patientIsUpdated;







}
