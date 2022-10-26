package stepdefinitions.apiStepDefs;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Registration;


import java.io.IOException;

import static baseurl.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static utilities.GenerateTokenApi.getToken;

public class ApiRegistrationPageStepDefs {
    Response response;
    Registration[] registrations;
    @Given("user sends a get request for registration data")
    public void user_sends_a_get_request_for_registration_data() {
      //set the url
      spec.pathParams("first","api","second","users").queryParams("size",15000);

      //send the request
       response =given().headers("Authorization","Bearer "+getToken(),
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON).spec(spec).when().get("/{first}/{second}");

    }

    @Then("user converts JSon data to java")
    public void user_converts_j_son_data_to_java() throws IOException {
        ObjectMapper obj = new ObjectMapper();
        registrations = obj.readValue(response.asString(),Registration[].class);
        System.out.println(registrations.length);

    }
    @Then("user validates username by api usernames should be unique")
    public void user_validates_username_by_api_usernames_should_be_unique() {
        boolean flag = false;
        int length = registrations.length;
        Registration lastUser = registrations[length-1];
        int count = 0;
        System.out.println(lastUser.toString());
        for (Registration each:registrations){
            if (each.getLogin().equals(lastUser.getLogin())){
                flag = true;
                count++;
                System.out.println(each.toString());
            }
        }
        Assert.assertTrue(flag);
        Assert.assertEquals(count,1);
    }

    @And("user validates {string} by api")
    public void userValidatesByApi(String email) {
        boolean flag = false;
        for (Registration each:registrations){
            if (each.getEmail().equals(email)){
                flag = true;

                System.out.println(each.toString());
            }
        }
        Assert.assertTrue(flag);

    }

}

