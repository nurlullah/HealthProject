package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;

import static baseurl.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;

public class GenerateAppointmentTokenApi {

    public static String getToken(){
        RequestSpecification spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("first" , "api", "second" , "authenticate");

    Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("physician_username", "team02_physician");
        expectedData.put("physician_password", "bilge_dede");
        expectedData.put("rememberMe", true);
    Response response = given().spec(spec).contentType(ContentType.JSON).body(expectedData).when().post("/{first}/{second}");
    JsonPath json = response.jsonPath();
    String physicianToken = json.getString("id_token");
        return physicianToken;
}
}
