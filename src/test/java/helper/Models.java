package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

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
}
