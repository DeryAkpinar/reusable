package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TestPage {


    public TestPage() { PageFactory.initElements(Driver.getDriver(), this);     }

    @FindBy (xpath = "//*[text()='My Appointments']")
    public WebElement myAppointments;

    @FindBy (xpath = "//*[text()='Edit'][1]")
    public WebElement PatientEdit;

    @FindBy (xpath = "//*[text()='Request A Test']")
    public WebElement requestATestButton;

    @FindBy (xpath = "//h2")
    public WebElement TestItemsHeader;

    @FindBy (xpath = "//tbody//tr//td[2]")
    public List <WebElement> testItems;

    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement testSave;

    @FindBy (xpath = "//input[@id='1402']")
    public WebElement ureaBox;

    @FindBy (xpath = "//input[@id='1403']")
    public WebElement creatinineBox;

    @FindBy (xpath = "//input[@id='1404']")
    public WebElement sodiumBox;

    @FindBy (xpath = "//input[@id='1405']")
    public WebElement potassiumnBox;

    @FindBy (xpath = "//input[@id='1406']")
    public WebElement totalProteinBox;

    @FindBy (xpath = "//input[@id='1407']")
    public WebElement albuminBox;
    @FindBy (xpath = "//input[@id='1408']")
    public WebElement hemoglobinBox;

    @FindBy (xpath = "//input[@id='129700']")
    public WebElement glucoseBox;



}
