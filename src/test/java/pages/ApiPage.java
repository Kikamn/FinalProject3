package pages;

import helper.Endpoint;
import helper.Utility;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;

import java.io.File;

import static helper.Models.getListUser;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiPage {
    String setURL;
    Response res;
    public void prepareURLValidFor(String url){
        switch (url){
            case "GET_USER":
                setURL = Endpoint.GET_USER;
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



}
