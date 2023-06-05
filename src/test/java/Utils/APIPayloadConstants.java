package Utils;

import org.json.JSONObject;

public class APIPayloadConstants {
    //we will pass the body in multiple formats, for this we created this class
    public static String createEmployeePayload() {
        String createEmployeePayload = "{\\n\" +\n" +
                "                        \"  \\\"emp_firstname\\\": \\\"Olya\\\",\\n\" +\n" +
                "                        \"  \\\"emp_lastname\\\": \\\"Shi\\\",\\n\" +\n" +
                "                        \"  \\\"emp_middle_name\\\": \\\"An\\\",\\n\" +\n" +
                "                        \"  \\\"emp_gender\\\": \\\"F\\\",\\n\" +\n" +
                "                        \"  \\\"emp_birthday\\\": \\\"2001-01-01\\\",\\n\" +\n" +
                "                        \"  \\\"emp_status\\\": \\\"Confirmed\\\",\\n\" +\n" +
                "                        \"  \\\"emp_job_title\\\": \\\"PA\\\"\\n\" +\n" +
                "                        \"  \\n\" +\n" +
                "                        \"}";
        return createEmployeePayload;

    }

    public static String createEmployeePayloadJson() {
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", "Olya");
        obj.put("emp_lastname", "Shi");
        obj.put("emp_middle_name", "An");
        obj.put("emp_gender", "F");
        obj.put("emp_birthday", "2001-01-01");
        obj.put("emp_status", "Confirmed");
        obj.put("emp_job_title", "PA");
        return obj.toString();
    }

    public static String createEmployeePayloadDynamic
            (String emp_firstname, String emp_lastname,
             String emp_middle_name, String emp_gender, String emp_birthday,
             String emp_status, String emp_job_title) {

        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", emp_firstname);
        obj.put("emp_lastname", emp_lastname);
        obj.put("emp_middle_name", emp_middle_name);
        obj.put("emp_gender", emp_gender);
        obj.put("emp_birthday", emp_birthday);
        obj.put("emp_status", emp_status);
        obj.put("emp_job_title", emp_job_title);

        return obj.toString();
    }

    public static String updateEmployeePayloadJson(){
        JSONObject obj = new JSONObject();
        obj.put("employee_id","53177A");
        obj.put("emp_firstname","valya");
        obj.put("emp_lastname","pupik");
        obj.put("emp_middle_name","ms");
        obj.put("emp_gender","M");
        obj.put("emp_birthday","2021-05-20");
        obj.put("emp_status","Probation");
        obj.put("emp_job_title","Chief");
        return obj.toString();
    }
}