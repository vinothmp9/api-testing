package rest_assured_concepts;

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;


public class POST_Methods_Git {
	@Test
	public   void tc001() {
		RestAssured.baseURI="https://api.github.com";	
		RestAssured.given()
		.log().all()
           .queryParam("", "")
           .auth().preemptive().basic("vinothmp9","Muthaiya@18")
           .header("","")
           .body(PayLoad.createrepo())
           	
           .when()
           .post("/user/repos")
           
           .then()
           .log().all().assertThat().statusCode(201).body("name",equalTo("Hello-World45"));
           
	}

}
