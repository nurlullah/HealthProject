package stepdefinitions.apiStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static utilities.GenerateTokenApi.getToken;

public class APIStepDefs {

    Response response;
    @Given("admin get request for doctor")
    public void admin_get_request_for_doctor() {
        RequestSpecification spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("first", "api", "second", "physicians","third","10520");
        response = given().headers(
                "Authorization", "Bearer "+getToken(ConfigReader.getProperty("admin_username"),ConfigReader.getProperty("admin_password")),
                "Content-Type", ContentType.JSON,
                "Accept" , ContentType.JSON
        ).spec(spec).when().get("/{first}/{second}/{third}");

        response.prettyPrint();



    }

    @Then("verify the doctor with id {int} is exist")
    public void verify_the_doctor_with_id_is_exist(Integer id) {

    }




}
