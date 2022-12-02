package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US011_Page {
    public US011_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@id='login-item']")
    public WebElement signInButton;

    @FindBy (xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy (xpath = "(//span[text()='Sign in'])[3]")
    public WebElement signInHesapGiris;

    @FindBy (xpath = "//li[@id='account-menu']")
    public WebElement drHesabiMenusu;

    @FindBy (xpath = "//li[@id='entity-menu']")
    public WebElement myPages;

    @FindBy (xpath = "//span[text()='My Appointments']")
    public WebElement myAppointments;

    @FindBy (xpath = "//h2[@id='appointment-heading']")
    public WebElement AppointmentsBasligi;

    @FindBy (xpath = "(//a//span[text()='Edit'])[2]")
    public WebElement editHasta2;  //  //span[text()='Edit']    //(//span[@class='d-none d-md-inline'])[2]
// (//div[@class='btn-group flex-btn-group-container'])[2]
    @FindBy (xpath = "(//div[@class='btn-group flex-btn-group-container'])[1]")
    public WebElement editHasta1;  //  //span[text()='Edit']
    @FindBy (xpath = "//h2[@id='hospitalmsappfrontendApp.appointment.home.createOrEditLabel']")
    public WebElement createOrEditAnAppointmentBasligi;

    @FindBy (xpath = "//select[@id='appointment-status']")
    public WebElement statusSecimi;

    @FindBy (xpath = "//textarea[@id='appointment-anamnesis']")
    public WebElement anamnesis;

    @FindBy (xpath = "//button//span[text()='Save']")   //  //span[text()='Save']
    public WebElement doctorCreateSave;

    @FindBy (xpath = "//*[contains(text(),'The Appointment is updated with identifier')]")     // yesil dogrulama yakalama
    public WebElement doctorBasariliKayitOnayi;

    @FindBy (xpath = "//tbody/tr/td[1]")
    public WebElement idBilgisi;

    @FindBy (xpath = "//tbody/tr/td[2]")
    public WebElement startDateTimeBilgisi;

    @FindBy (xpath = "//tbody/tr/td[3]")
    public WebElement endDateTimeBilgisi;

    @FindBy (xpath = "//tbody/tr/td[4]")
    public WebElement statusBilgisi;

    @FindBy (xpath = "//tbody/tr/td[11]")
    public WebElement physicianBilgisi;

    @FindBy (xpath = "//tbody/tr/td[12]")
    public WebElement patientBilgisi;

    @FindBy (xpath = "(//div[@class='invalid-feedback'])")
    public WebElement thisFieldIsRequiredYazisi;

    @FindBy (xpath = "//textarea[@id='appointment-prescription']")
    public WebElement periscriptionAlani;

     @FindBy (xpath = "//textarea[@id='appointment-description']")
    public WebElement descriptionAlani;

    @FindBy (xpath = "//select/option[@value='PENDING']")
    public WebElement pending;

    @FindBy (xpath = "//select/option[@value='COMPLETED']")
    public WebElement completed;

    @FindBy (xpath = "//select/option[@value='CANCELLED']")
    public WebElement cancelled;



////div[@class='Toastify']
    // //div[@role='alert']
    // //div[text()='']








}
