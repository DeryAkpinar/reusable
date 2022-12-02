package stepDefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US011_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_011StepDef {

    US011_Page us_11 = new US011_Page();
    Actions actions = new Actions(Driver.getDriver());

    @And("Kullanici Physician hesabina giris yapmak icin Sign in butonuna tiklar Hk")
    public void kullaniciPhysicianHesabinaGirisYapmakIcinSignInButonunaTiklarHk() {
        us_11.signInButton.click();
    }
    @Then("Kullanici username kismini doldurur Hk")
    public void kullaniciUsernameKisminiDoldururHk() {
        us_11.username.sendKeys("drhasan");
    }
    @And("Kullanici Password kismini doldurur Hk")
    public void kullaniciPasswordKisminiDoldururHk() {
        us_11.password.sendKeys("Hasan123.");
    }
    @And("Kullanici Sign in butonuna tiklar Hk")
    public void kullaniciSignInButonunaTiklarHk() {
        us_11.signInHesapGiris.click();
    }
    @Then("Kullanici Physician sayfasina basariyla girdigini dogrular Hk")
    public void kullaniciPhysicianSayfasinaBasariylaGirdiginiDogrularHk() {
        Assert.assertTrue(us_11.drHesabiMenusu.isDisplayed());
    }
    @And("Kullanici My Pages sekmesine tiklar Hk")
    public void kullaniciMyPagesSekmesineTiklarHk() {
        us_11.myPages.click();
    }
    @And("Kullanici acilan dropdown menuden  My Appointments secenegine tiklar Hk")
    public void kullaniciAcilanDropdownMenudenMyAppointmentsSecenegineTiklarHk() {
        us_11.myAppointments.click();
    }
    @Then("Kullanici Appointments yazisini gordugunu dogrular Hk")
    public void kullaniciAppointmentsYazisiniGordugunuDogrularHk() {
        Assert.assertTrue(us_11.AppointmentsBasligi.isDisplayed());
    }
    @And("Kullanici Edit linkine tiklar Hk")
    public void kullaniciEditLinkineTiklarHk() {
        ReusableMethods.jsScrollClick(us_11.editHasta1);
    }

    @And("Kullanici  doldurmasi gerekli alanlari gormek icin Edit linkine tiklar Hk")
    public void kullaniciDoldurmasiGerekliAlanlariGormekIcinEditLinkineTiklarHk() {
        ReusableMethods.jsScrollClick(us_11.editHasta2);
    }
    @Then("Kullanici Create or Edit an Appointment sayfasinda oldugunu dogrular Hk")
    public void kullaniciCreateOrEditAnAppointmentSayfasindaOldugunuDogrularHk() {
        Assert.assertTrue(us_11.createOrEditAnAppointmentBasligi.isDisplayed());
    }
    @And("Kullanici Status kutucugunu tiklayarak secim yapar Hk")
    public void kullaniciStatusKutucugunuTiklayarakSecimYaparHk() {
        us_11.statusSecimi.sendKeys(Keys.ENTER);

    }

    @And("Kullanici {string}, {string}, {string}, {string}, {string} kutucuklarina giris yapar Hk")
    public void kullaniciKutucuklarinaGirisYaparHk(String anamnesis, String treatment, String diagnosis, String prescription, String description ) {
        anamnesis= Faker.instance().name().name();
        treatment= Faker.instance().team().sport();
        diagnosis= Faker.instance().name().username();
        prescription= Faker.instance().nation().language();
        description= Faker.instance().food().fruit();

        us_11.anamnesis.sendKeys(anamnesis,Keys.TAB,
                treatment, Keys.TAB,
                diagnosis,Keys.TAB,
                prescription,Keys.TAB,
                description);
                /*
                Keys.TAB,Faker.instance().name().title(),
                Keys.TAB,Faker.instance().animal().name(),
                Keys.TAB,Faker.instance().lorem().word(),
                Keys.TAB,Faker.instance().ancient().primordial(),
                Keys.TAB);
                 */
        ReusableMethods.waitFor(3);
    }

     @And("Kullanici save linkini tiklar Hk")
     public void kullaniciSaveLinkiniTiklarHk() {
        ReusableMethods.jsScrollClick(us_11.doctorCreateSave);
       //  us_11.doctorCreateSave.click();

     }

    @Then("Kullanici islemlerini basariyla yapabildigini dogrular Hk")
    public void kullaniciIslemleriniBasariylaYapabildiginiDogrularHk() {
          ReusableMethods.waitForVisibility(us_11.doctorBasariliKayitOnayi,3);
          Assert.assertTrue(us_11.doctorBasariliKayitOnayi.isDisplayed());

    }


    @And("Kullanici hastanin id bilgisini, Start Date Time, End Date Time, Status, Physician, Patient bilgilerini gordugunu dogrular Hk")
    public void kullaniciHastaninIdBilgisiniStartDateTimeEndDateTimeStatusPhysicianPatientBilgileriniGordugunuDogrularHk() {
        Assert.assertTrue(us_11.idBilgisi.isDisplayed());
        Assert.assertTrue(us_11.startDateTimeBilgisi.isDisplayed());
        Assert.assertTrue(us_11.endDateTimeBilgisi.isDisplayed());
        Assert.assertTrue(us_11.statusBilgisi.isDisplayed());
        Assert.assertTrue(us_11.physicianBilgisi.isDisplayed());
        Assert.assertTrue(us_11.patientBilgisi.isDisplayed());

    }

    @And("Kullanici sayfanin en altina inip save linkine tiklar Hk")
    public void kullaniciSayfaninEnAltinaInipSaveLinkineTiklarHk() {
        ReusableMethods.jsScrollClick(us_11.doctorCreateSave);
     //   us_11.doctorCreateSave.click();

    }

    @And("Kullanici Anamnesis, Treatment, Diagnosis  alanini doldurmak zorunda oldugunu This field is required yazilarini gorerek dogrular Hk")
    public void kullaniciAnamnesisTreatmentDiagnosisAlaniniDoldurmakZorundaOldugunuThisFieldIsRequiredYazilariniGorerekDogrularHk() {
        Assert.assertTrue(us_11.thisFieldIsRequiredYazisi.isDisplayed());
    }

    @And("Kullanici Prescription ve Description alaninin istege bagli oldugunu \\(zorunlu alan olmadigini) herhangi bir uyari yazisi almayarak dogrular Hk")
    public void kullaniciPrescriptionVeDescriptionAlanininIstegeBagliOldugunuZorunluAlanOlmadiginiHerhangiBirUyariYazisiAlmayarakDogrularHk() {
        Assert.assertTrue(us_11.periscriptionAlani.isDisplayed());
        Assert.assertTrue(us_11.descriptionAlani.isDisplayed());
    }

    @And("Kullanici Status kutusundan Pending secenegini tiklar Hk")
    public void kullaniciStatusKutusundanPendingSeceneginiTiklarHk() {
        ReusableMethods.jsScrollClick(us_11.pending);

    }

    @And("Kullanici Status kutusundan Pending secenegini secebildigini dogrular Hk")
    public void kullaniciStatusKutusundanPendingSeceneginiSecebildiginiDogrularHk() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_11.pending.isDisplayed());
    }

    @And("Kullanici Status kutusundan Completed secenegini tiklar Hk")
    public void kullaniciStatusKutusundanCompletedSeceneginiTiklarHk() {
        ReusableMethods.jsScrollClick(us_11.completed);
    }

    @And("Kullanici Status kutusundan Completed secenegini secebildigini dogrular Hk")
    public void kullaniciStatusKutusundanCompletedSeceneginiSecebildiginiDogrularHk() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_11.completed.isDisplayed());
    }

    @And("Kullanici Status kutusundan Cancelled secenegini tiklar Hk")
    public void kullaniciStatusKutusundanCancelledSeceneginiTiklarHk() {
        ReusableMethods.jsScrollClick(us_11.cancelled);
    }

    @And("Kullanici Status kutusundan Cancelled secenegini secebildigini dogrular Hk")
    public void kullaniciStatusKutusundanCancelledSeceneginiSecebildiginiDogrularHk() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_11.cancelled.isDisplayed());
    }
    @And("Sayfayi kapatir Hk")
    public void sayfayiKapatirHk() {
        Driver.closeDriver();
    }
}

