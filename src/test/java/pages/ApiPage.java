package pages;

import helper.Endpoint;
import helper.Utility;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;

import java.io.File;

import static helper.Models.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiPage {
    String setURL, global_id;
    Response res;
    public void prepareURLValidFor(String url){
        switch (url){
            case "GET_USER":
                setURL = Endpoint.GET_USER;
                break;
            case "POST_USER":
                setURL = Endpoint.POST_USER;
                break;
            case "DELETE_USER":
                setURL = Endpoint.DELETE_USER;
                break;
            case "VALID_USER":
                setURL = Endpoint.VALID_USER;
                break;
            default:
                System.out.println("input right url");
        }
        System.out.println("Endpoint yang di gunakan : " + setURL);
    }

    public void hitAPIGetListData(){
        res = getListUser(setURL);
        System.out.println(res.getBody().asString());
    }

    public void hitAPIPostUser(){
        res = postNewUser(setURL);
        System.out.println(res.getBody().asString());
    }

    public void validationStatusCodeIsEquals(int statusCode){
        assertThat(res.statusCode()).isEqualTo(statusCode);
    }

    public void validationResponseBodyGetListUser(){
        String id = res.jsonPath().getString("data[0].id");
        String title = res.jsonPath().getString("data[0].title");
        String firstName = res.jsonPath().getString("data[0].firstName");
        String lastName = res.jsonPath().getString("data[0].lastName");
        String picture = res.jsonPath().getString("data[0].picture");

        Assertions.assertThat(id).isNotNull();
        Assertions.assertThat(title).isIn("mr", "ms","miss", "mrs");
        Assertions.assertThat(firstName).isNotNull();
        Assertions.assertThat(lastName).isNotNull();
        Assertions.assertThat(picture).isNotNull();
    }

    public void validationResponseJsonWhitJSONSchema(String fileName){
        File JSONFile = Utility.getJSONSchema(fileName);
        res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JSONFile));
    }

    public void validationResponseBodyPostNewUser(){
        JsonPath jsonPath = res.jsonPath();
        String id = jsonPath.get("id");
        String title = jsonPath.get("title");
        String firstName = jsonPath.get("firstName");
        String lastName = jsonPath.get("lastName");
        String picture = jsonPath.get("picture");
        String email = jsonPath.get("email");

        Assertions.assertThat(id).isNotNull();
        Assertions.assertThat(title).isIn("mr", "ms","miss", "mrs");
        Assertions.assertThat(firstName).isNotNull();
        Assertions.assertThat(lastName).isNotNull();
        Assertions.assertThat(picture).isNotNull();
        Assertions.assertThat(email).isNotNull();

        System.out.println(res.getBody().asString());
        global_id =id;
    }

    public void hitAPIDeleteUser(){
        res = deleteUser(setURL, global_id);
    }

    public void hitAPIUpdateDataUser(){
        res = putUpdateUserID(setURL);
        System.out.println(res.getBody().asString());
    }

    public void validationResponseBodyUpdateUserNew(){
        JsonPath jsonPath = res.jsonPath();
        String id = jsonPath.get("id");
        String title = jsonPath.get("title");
        String firstName = jsonPath.get("firstName");
        String lastName = jsonPath.get("lastName");
        String picture = jsonPath.get("picture");
        String email = jsonPath.get("email");

        Assertions.assertThat(id).isNotNull();
        Assertions.assertThat(title).isIn("mr", "ms","miss", "mrs");
        Assertions.assertThat(firstName).isNotNull();
        Assertions.assertThat(lastName).isNotNull();
        Assertions.assertThat(picture).isNotNull();
        Assertions.assertThat(email).isNotNull();
    }

}
