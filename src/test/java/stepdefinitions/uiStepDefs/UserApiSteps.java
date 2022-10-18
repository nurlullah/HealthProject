package stepdefinitions.uiStepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
import static utilities.GenerateTokenApi.getToken;
public class UserApiSteps {
    Response response;
    @Given("user sends a get request for users")
    public void user_sends_a_get_request_for_users() {
        RequestSpecification spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("first", "api", "second", "users");
        response = given().headers(
                "Authorization", "Bearer "+getToken(),
                "Content-Type", ContentType.JSON,
                "Accept" , ContentType.JSON
        ).spec(spec).when().get("/{first}/{second}");
    }
    @Given("user converts user records to Java")
    public void user_converts_user_records_to_java() {
        response.prettyPrint();
    }
    @Then("user validates user data")
    public void user_validates_user_data() {
    }
}