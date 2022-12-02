package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PageS2 {
    public PageS2() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#account-menu>a")
    public WebElement accountMenu;
    @FindBy(id = "login-item")
    public WebElement signInId;
    @FindBy(xpath = "//*[.='Sign in']")
    public WebElement signIn;
    @FindBy(xpath = "//*[@name='username']")
    public WebElement usernameBox;
    @FindBy(xpath = "//*[@name='password']")
    public WebElement passwordBox;
    @FindBy(css = ".btn.btn-primary")
    public WebElement signInButton;
    @FindBy(css = ".dropdown-menu-right.show>:nth-child(2)>span")
    public WebElement passwordLink;
    @FindBy(xpath = "//*[@name='currentPassword']")
    public WebElement currentPasswordBox;
    @FindBy(css = "#newPassword")
    public WebElement newPasswordBox;
    @FindBy(css = "#confirmPassword")
    public WebElement confirmPasswordBox;
    @FindBy(css = ".btn.btn-success>span")
    public WebElement saveButton;
    @FindBy(xpath = "//*[contains(text(), 'Password changed!')]")
    public WebElement passwordChangedMessage;
    @FindBy(css = "div.col-md-8")
    public WebElement passwordScreen;
    // Password Strength
    @FindBy(css = "#strengthBar")
    public WebElement strengthBar;
    @FindBy(css = "#strength")
    public WebElement strength;
    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']") // size = 1
    public List<WebElement> redStrength;
    @FindBy(xpath = "//li[@style='background-color: rgb(255, 153, 0);']") // size = 2
    public List<WebElement> orangeStrengthList;
    @FindBy(xpath = "//li[@style='background-color: rgb(255, 255, 0);']") // size = 3
    public List<WebElement> yellowStrength;
    @FindBy(xpath = "//li[@style='background-color: rgb(153, 255, 0);']") // size = 4
    public List<WebElement> limeGreenStrength;
    @FindBy(xpath = "//li[@style='background-color: rgb(0, 255, 0);']") // size = 5
    public List<WebElement> greenStrength;
    @FindBy(xpath = "//*[.='The password and its confirmation do not match!']")
    public WebElement notMatchTextMessage;
    // DOCTOR
    @FindBy(xpath = "//a//*[.='MY PAGES']")
    public WebElement myPages;
    @FindBy(linkText = "My Inpatients")
    public WebElement myInpatients;
    @FindBy(xpath = "//thead//tr//th")
    public List<WebElement> patientTableTitles;
    @FindBy(xpath = "//span//*[.='Edit']")
    public List<WebElement> editButtons;
    @FindBy(xpath = "//span//*[.='Edit']")
    public WebElement editButton;
    @FindBy(css = "#in-patient-status")
    public WebElement statusDdm;
    @FindBy(css = "#in-patient-room")
    public WebElement roomDdm;
    @FindBy(css = "table.table")
    public WebElement patientTable;
    @FindBy(css = "#in-patient-appointment")
    public WebElement appointmentDdm;
    @FindBy(css = "#save-entity>span")
    public WebElement saveButtonCreatePatient;
    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement inPatientSaveMassage;
}
