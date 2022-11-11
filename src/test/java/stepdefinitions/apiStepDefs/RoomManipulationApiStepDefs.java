package stepdefinitions.apiStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import pojos.Room;
import pojos.RoomForPost;
import pojos.RoomForPut;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static baseurl.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static utilities.GenerateTokenApi.generateToken;

public class RoomManipulationApiStepDefs {
    Response response;
    Room expectedRoom=new Room();
    RoomForPost expectedRoomPost = new RoomForPost();
    RoomForPut expectedRoomPut=new RoomForPut();
      private static int roomId;

    @Given("User sends a get request all rooms")
    public void userSendsAGetRequestAllRooms(){
        spec.pathParams("first","api","second","rooms").queryParam("size",10000);

        response=given().headers("Authorization","Bearer "+generateToken(),
                "Content-Type",ContentType.JSON,
                "Accept",ContentType.JSON).spec(spec).when().get("/{first}/{second}");
    }

    @Then("User validates room data")
    public void userValidatesRoomData() throws IOException {
          List<Map<String,Object>> actualDataListMap=response.as(List.class);
          Assert.assertEquals(actualDataListMap.size(),Room.getTotalRoomNumber());
    }

    @Given("User sends a post request for new room")
    public void user_sends_a_post_request_for_new_room() {
      spec.pathParams("first","api","second","rooms");

      expectedRoomPost.setRoomNumber(13579);
      expectedRoomPost.setRoomType("DELUXE");
      expectedRoomPost.setDescription("Team 02 special room");
      expectedRoomPost.setPrice(100);
      expectedRoomPost.setStatus(true);

      response=given().headers("Authorization","Bearer "+generateToken(),
              "Content-Type", ContentType.JSON,"Accept",ContentType.JSON).
              spec(spec).contentType(ContentType.JSON).
              body(expectedRoomPost).when().post("/{first}/{second}");
      }
    @Then("User validates the posted data")
    public void user_validates_the_posted_data() throws IOException {
        Map<String,Object> result = response.as(HashMap.class);
        roomId = (int)result.get("id");

        Assert.assertEquals(result.get("roomType"),expectedRoomPost.getRoomType());
        Assert.assertEquals((int)result.get("roomNumber"),expectedRoomPost.getRoomNumber());
        Assert.assertEquals(result.get("description"),expectedRoomPost.getDescription());
        Assert.assertEquals((boolean)result.get("status"),expectedRoomPost.isStatus());
        Assert.assertEquals((double)result.get("price"),expectedRoomPost.getPrice(),0);
    }

    @Given("User sends a put request for room")
    public void userSendsAPutRequestForRoom() {
        spec.pathParams("first","api","second","rooms");

        expectedRoomPut.setId(roomId);
        expectedRoomPut.setRoomType("DAYCARE");
        expectedRoomPut.setStatus(true);
        expectedRoomPut.setPrice(170.0);
        expectedRoomPut.setDescription("Very spe");
        expectedRoomPut.setRoomNumber(13579);

        response=given().headers("Authorization","Bearer "+generateToken(),
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON).spec(spec).contentType(ContentType.JSON).
                body(expectedRoomPut).when().put("/{first}/{second}");
        }
    @Then("User validates the updated room data")
    public void userValidatesTheUpdatedRoomData() throws IOException {
        ObjectMapper obj=new ObjectMapper();
        RoomForPut actualRoomObj=obj.readValue(response.asString(), RoomForPut.class);

        Assert.assertEquals(expectedRoomPut.isStatus(),actualRoomObj.isStatus());
        Assert.assertEquals(expectedRoomPut.getRoomType(),actualRoomObj.getRoomType());
        Assert.assertEquals(expectedRoomPut.getDescription(),actualRoomObj.getDescription());
        Assert.assertEquals(expectedRoomPut.getRoomNumber(),actualRoomObj.getRoomNumber());
        Assert.assertEquals(expectedRoomPut.getPrice(),actualRoomObj.getPrice(),0);
    }

    @Given("User sends a delete request for room")
    public void userSendsADeleteRequestForRoom() {
        spec.pathParams("first","api","second","rooms","third",roomId);

        response=given().headers("Authorization","Bearer "+generateToken(),
                "Content-Type",ContentType.JSON,"Accept",ContentType.JSON).
                spec(spec).contentType(ContentType.JSON).when().delete("/{first}/{second}/{third}");
        }

    @Then("User validates deleted room not exist")
    public void userValidatesDeletedRoomNotExist() {
        response.then().assertThat().statusCode(204);
     }
}
