public class kkk {
    protected RequestSpecification spec;
    //If you use @Before annotation at the top of a method, it will be executed before every test method.
    @Before
    public void setUp(){

        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();

    }
}
