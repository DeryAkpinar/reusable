package pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class InfoEdit {
    private String id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String birthDateHour_Munite;
    private String email;
    private String phone;
    private String gender;
    private String bloodGroup;
    private String address;
    private String description;
    private String user;
    private String country;
    private String state_City;

}
