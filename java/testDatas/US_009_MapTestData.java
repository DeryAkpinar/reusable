package testDatas;

import java.util.HashMap;
import java.util.Map;

public class US_009_MapTestData {
    public Map<String, Object> expectedMap(String gender,Object cstate_id,String birth_date,String last_name,Object description,
                                           String last_modified_date,Object adress,String last_modified_by,String created_by,
                                           String phone, Integer user_id, String blood_group,Integer id, String created_date,
                                           String first_name, Object country_id, String email)
    {   Map<String,Object> expectedPatient= new HashMap<>();
        expectedPatient.put("gender",gender);
        expectedPatient.put("cstate_id",cstate_id);
        expectedPatient.put("birth_date",birth_date);
        expectedPatient.put("last_name",last_name);
        expectedPatient.put("description",description);
        expectedPatient.put("last_modified_date",last_modified_date);
        expectedPatient.put("adress",adress);
        expectedPatient.put("last_modified_by",last_modified_by);
        expectedPatient.put("created_by",created_by);
        expectedPatient.put("phone",phone);
        expectedPatient.put("user_id",user_id);
        expectedPatient.put("blood_group",blood_group);
        expectedPatient.put("id",id);
        expectedPatient.put("created_date",created_date);
        expectedPatient.put("first_name",first_name);
        expectedPatient.put("country_id",country_id);
        expectedPatient.put("email",email);
        return expectedPatient;     }
}
