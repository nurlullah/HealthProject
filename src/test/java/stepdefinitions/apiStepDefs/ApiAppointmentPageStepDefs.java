package stepdefinitions.apiStepDefs;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Appointment;

import java.io.IOException;

import static baseurl.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static utilities.GenerateTokenApi.getToken;

public class ApiAppointmentPageStepDefs {

    Response response;
    Appointment[] appointments;

      @Given("user sends a get request for appointments")
    public void user_sends_a_get_request_for_appointments() {

          // set the URL
          spec.pathParams("first","api", "second", "appointments").queryParams("size",15000);
    //send the request
          response =given().headers("Authorization","Bearer "+getToken("team02_physician","bilge_dede"),
                  "Content-Type", ContentType.JSON,
                  "Accept",ContentType.JSON).spec(spec).when().get("/{first}/{second}");


      }


    @Given("user converts user records to Java")
    public void user_converts_user_records_to_java() throws IOException {

        ObjectMapper obj = new ObjectMapper();
        appointments = obj.readValue(response.asString(),Appointment[].class);
        System.out.println(appointments.length);


    }
    @Then("user validates user data")
    public void user_validates_user_data() {



    }


}
