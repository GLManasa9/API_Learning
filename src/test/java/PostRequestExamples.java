import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;

public class PostRequestExamples {
    public static void main(String[] args){
        RestAssured.baseURI = "https://reqres.in/";
        JSONObject obj = new JSONObject();
        obj.put("email","test@gmail.com");
        obj.put("username","testmail");
        obj.put("password","test");
        Response res = RestAssured.given().body(obj).post("/api/register");
        res.prettyPrint();
        AssertActions.assertStatusCodeCreated(res.getStatusCode());

        //second post request
        JSONObject obj2 = new JSONObject();
        obj2.put("name","manasa_g");
        obj2.put("job","tester");
        res = RestAssured.given().header("Content-type","application/json")
                .body(obj)
                .when()
                .post("/api/users");
        res.prettyPrint();
        AssertActions.assertStatusCodeCreated(res.getStatusCode());
    }
}
