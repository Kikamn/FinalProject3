package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static helper.Utility.generateRandomEmail;

public class Models {
    private static RequestSpecification request;

    public static void setHeader(){
        request = RestAssured.given()
                .header("Content-type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "6650888882074fd5d7c53b55");
    }

    public static Response getListUser(String endpoint){
        setHeader();
        return request.when().get(endpoint);
    }

    public static Response postNewUser(String endpoint){
        String title = "ms";
        String firstName = "kika";
        String lastName = "Ningsih";
        String picture = "https://randomuser.me/api/portraits/women/58.jpg";
        String email = generateRandomEmail();

        JSONObject payload = new JSONObject();
        payload.put("title", title);
        payload.put("firstName", firstName);
        payload.put("lastName", lastName);
        payload.put("picture", picture);
        payload.put("email", email);

        setHeader();
        return request.body(payload.toString()).when().post(endpoint);
    }

    public static Response deleteUser (String endpoint, String user_id){
        setHeader();
        String finalEndPoint = endpoint + "/" + user_id;
        return request.when().delete(finalEndPoint);
    }

    public static Response putUpdateUserID(String endpoint){
        setHeader();
        String title = "ms";
        String firstName = "Adrian";
        String lastName = "Lukiman";
        String picture = "https://randomuser.me/api/portraits/women/58.jpg";
        String email = generateRandomEmail();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("title", title);
        jsonObject.put("firstName", firstName);
        jsonObject.put("lastName", lastName);
        jsonObject.put("picture", picture);
        jsonObject.put("email", email);

        String finalEndPoint = endpoint ;
        return request.body(jsonObject.toString()).when().put(finalEndPoint);
    }
}

