package baseurl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class MedunnaBaseUrl {

    public static RequestSpecification spec;
    //If you use @Before annotation at the top of a method, it will be executed before every test method.

    public static void medunnaSetUp(){

        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();

    }
}
