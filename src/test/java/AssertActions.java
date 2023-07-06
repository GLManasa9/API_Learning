import org.testng.Assert;

import java.net.HttpURLConnection;

public class AssertActions {
    static void assertStatusCodeCreated(int code){
        try {
            Assert.assertEquals(code, HttpURLConnection.HTTP_CREATED);
            System.out.println("Created");
        }
        catch(AssertionError e) {
            System.out.println("Encountered an issue, please recheck the request. Response status code is "+code);
            System.out.println(e.getLocalizedMessage());
        }
    }

    static void assertStatusCodeOK(int code){
        try {
            Assert.assertEquals(code, HttpURLConnection.HTTP_OK);
        }
        catch(AssertionError e) {
            System.out.println("Encountered an issue, please recheck the request. Response status code is "+code);
            System.out.println(e.getLocalizedMessage());
        }
    }
}
