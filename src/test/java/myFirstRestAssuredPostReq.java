import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.SpecificationQuerier;
import org.json.JSONObject;
import org.testng.Assert;

import java.net.HttpURLConnection;

import static java.lang.System.out;

public class myFirstRestAssuredPostReq {
    public static void main(String[] args){

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts";
        JSONObject bodyObj = new JSONObject();
        bodyObj.put("userId",2);
        bodyObj.put("id",12);
        bodyObj.put("title","Test Manasa 2");
        bodyObj.put("body","Body");
        Response res = RestAssured.given().body(bodyObj).post();
        out.println(res.getStatusCode());
        Assert.assertEquals(res.getStatusCode(), HttpURLConnection.HTTP_CREATED);
        out.println(res.prettyPrint());

    }
}
