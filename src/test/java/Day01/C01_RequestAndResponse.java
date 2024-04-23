package Day01;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.apache.http.Header;

import static io.restassured.RestAssured.given;

public class C01_RequestAndResponse {
    /*
    Given
        https://restful-booker.herokuapp.com/booking
    When
        User sends a GET Request to the url
    Then
        Print Status Code (should be 200)
    And
        Print content type (should be 200)
    And
        Print Status Line (should be HTTP/1.1 200 OK)
    And
        Print Connection and Date headers on console
    And
        Print all headers on console

*/
    public static void main(String[] args) {


        String url = "https://restful-booker.herokuapp.com/booking";
       Response response= given().get(url);
       //print response
       response.prettyPrint();

       // how to Print Status Code (should be 200)
       int statusCode = response.statusCode();
        System.out.println("statusCode = " + statusCode);


        //how to print content type
      String contentType =  response.contentType();
        System.out.println("contentType = " + contentType);

        // how to Print Status Line (should be HTTP/1.1 200 OK)
       String statusLine = response.statusLine();
        System.out.println("statusLine = " + statusLine);


        // how to Print Connection and Date headers on console
        // how to get value from header
        String conn = response.header("Connection");
        System.out.println("conn = " + conn);

        String date = response.header("date");
        System.out.println("date = " + date);

        // how to Print all headers on console
        Headers headers = response.headers();
        System.out.println("headers = " + headers);

        // how to get response time
        response.time();


    }
}