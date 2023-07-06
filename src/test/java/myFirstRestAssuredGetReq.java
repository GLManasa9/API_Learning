import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

import java.net.HttpURLConnection;

import static io.restassured.RestAssured.given;
import static java.lang.System.out;

class myFirstRestAssuredGetReq {

    public static void main(String[] args) throws JsonProcessingException {
        RestAssured.baseURI = "https://reqres.in/api/";
        String page = "2";
//        Response res = given().pathParam("pageID",page)
//                .get("/users?page={pageID}");
        Response res = given().queryParam("page",page)
                .get("/users");
        Assert.assertEquals(res.statusCode(), HttpURLConnection.HTTP_OK);
        out.println(res.getStatusCode());
//        out.println(res.prettyPrint());
        ObjectMapper om = new ObjectMapper();
        String resObj = res.prettyPrint();
        AssertActions.assertStatusCodeOK(res.getStatusCode());
        ListOfUsersPOJO root = om.readValue(resObj, ListOfUsersPOJO.class);
        //printing json object
        out.println(root.Support);
        out.println("===================");
        //printing key-value pair json object
        out.println("Text:"+root.Support.getText());
        out.println("===================");
        //printing json array index 0 of data json array
        out.println(root.getData().get(0));
        out.println("===================");
        //printing the key-value pair of data json array
        out.println("Email:"+root.getData().get(0).email);
        out.println("===================");
        RestAssured.reset();
    }
}