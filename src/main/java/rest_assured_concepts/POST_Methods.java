package rest_assured_concepts;

import org.junit.Test;

import io.restassured.RestAssured;


public class POST_Methods {
	@Test
	public   void tc001() {
		RestAssured.baseURI="https://reqres.in/";	
		RestAssured.given()
		.log().all()
           .queryParam("", "")
           .auth().preemptive().basic("","")
           .header("","")
           .body("{\r\n" + 
           		"    \"name\": \"morpheus\",\r\n" + 
           		"    \"job\": \"leader\"\r\n" + 
           		"}")
           	
           .when()
           .post("/api/users")
           
           .then()
           .log().all().assertThat().statusCode(201);
           
	}

}
