package APIStepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class GenerateToken {

    String baseURI = RestAssured.baseURI = "http://hrm.syntaxtechs.net/syntaxapi/api";
    public static String token;

    @Given("a JWT is generated")
    public void a_jwt_is_generated() {
        RequestSpecification generateTokenRequest =
                given().header("Content-Type","application/json").
                        body("{\n" +
                                "    \"email\": \"olazy11@mail.ru\",\n" +
                                "    \"password\": \"sunshine51\"\n" +
                                "}");

        //hitting the endpoint
        Response response = generateTokenRequest.when().post("/generateToken.php");

        //storing the token in global variable
        token = "Bearer " + response.jsonPath().getString("token");
        System.out.println(token);
    }

}
