package utilities;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;
public class GenerateTokenApi {
    public static String getToken(String username, String password){
        RequestSpecification spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("first" , "api", "second" , "authenticate");
        //Set the expected data
        /*
        {
  "password": "string",
  "rememberMe": true,
  "username": "string"
}
         */
        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("username", username);
        expectedData.put("password", password);
        expectedData.put("rememberMe", true);
        Response response = given().spec(spec).contentType(ContentType.JSON).body(expectedData).when().post("/{first}/{second}");
        JsonPath json = response.jsonPath();
        String token = json.getString("id_token");
        return token;
    }
}