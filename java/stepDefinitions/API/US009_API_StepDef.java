package stepDefinitions.API;

import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Country;
import pojos.PatientnotInPatient;
import pojos.User;
import pojos.User2;
import utilities.ConfigReader;
import utilities.ObjectMapperUtils;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;


public class US009_API_StepDef {
    @When("Kullanici hasta bilgilerini dogrularZZ")
    public void Kullanici_hasta_bilgilerini_dogrular() {

String patientEndPoint = ConfigReader.getProperty("patientZEndPoint");
Response response=given().headers("Authorization", "Bearer " + generateToken())
                         .when().get(patientEndPoint);
response.prettyPrint();
            /*
        {
                "createdBy": "patientcanc",
                "createdDate": "2022-11-18T16:14:32.610943Z",
                "id": 310803,
                "firstName": "Patient Can",
                "lastName": "Canan",
                "birthDate": "1977-01-01T08:30:00Z",
                "phone": "5555555555",
                "gender": "MALE",
                "bloodGroup": "Apositive",
                "adress": "Istanbul",
                "email": "patientcanc@gmail.com",
                "description": "Kemik Kanseri",
                "user": {
                    "createdBy": "anonymousUser",
                    "createdDate": "2022-08-14T13:03:18.038906Z",
                    "id": 188518,
                    "login": "user_112233445_56677889991660482197929",
                    "firstName": "Brain",
                    "lastName": "Stehr",
                    "email": "shirlene.pouros@yahoo.com",
                    "activated": true,
                    "langKey": "en",
                    "imageUrl": null,
                    "resetDate": null,
                    "ssn": "542-59-8193"
        },
                "appointments": null,
                "inPatients": null,
                "country": {
                    "id": 43955,
                    "name": "Germany"
        },
                "cstate": null
        }         */

Country innerCountry=new Country(43955,"Germany");
User2 innerUser2=new User2("anonymousUser", "2022-08-14T13:03:18.038906Z", 188518,
                "user_112233445_56677889991660482197929", "Brain", "Stehr",
                "shirlene.pouros@yahoo.com", true, "en", null,
                null, "542-59-8193");
PatientnotInPatient expectedData=new PatientnotInPatient("patientcanc", "2022-11-18T16:14:32.610943Z", 310803, "Patient Can", "Canan", "1977-01-01T08:30:00Z",
                "5555555555", "MALE", "Apositive", "Istanbul", "patientcanc@gmail.com", "Kemik Kanseri", innerUser2, null, null,
                innerCountry, null);
System.out.println("expectedData = " + expectedData);

PatientnotInPatient actualData= ObjectMapperUtils.convertJsonToJava(response.asString(), PatientnotInPatient.class);
System.out.println("actualData = " + actualData);

Assert.assertEquals(200, response.getStatusCode());
Assert.assertEquals(expectedData.getId(), actualData.getId());
Assert.assertEquals(expectedData.getFirstName(), actualData.getFirstName());
Assert.assertEquals(expectedData.getLastName(), actualData.getLastName());
Assert.assertEquals(innerCountry.getId(), actualData.getCountry().getId());
Assert.assertEquals(innerUser2.getEmail(), actualData.getUser().getEmail());    }

}

