package examples;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class FirstTest {

    // GET https://petstore.swagger.io/v2/pet/findByStatus?status=alive

    @Test
    public void getRequestWithQueryParam() {
        Response response = given().
                baseUri("https://petstore.swagger.io/v2/pet").
                header("Content-Type", "application/json").
                queryParam("status", "alive").
                //  log().all().
                        when().
                get("/findByStatus");
        //print the response body
        //System.out.println(response.getBody().asPrettyString());
        System.out.println(response.getBody().asString());
        //Extract individual properties
        String petstatus = response.then().extract().path("[0]['status']");
        System.out.println("pet status is :" + petstatus);
        Assert.assertEquals(petstatus, "alive");

    }

    @Test
    // GET https://petstore.swagger.io/v2/pet/{petId}
    public void getRequestWithPathParam() {
//send response, get response, assertions
            given().  //Request Specification
                    baseUri("https://petstore.swagger.io/v2/pet").
                    header("Content-Type", "application/json").
                    pathParam("petid", 772321).
                    log().all().
                    when().
                    get("/{petId}").
                    then().  // Response Specification
                    statusCode(200).
                    body("name",equalTo("Riley")).
                    body("status",equalTo("alive")).
                    log().all();
    }
}
