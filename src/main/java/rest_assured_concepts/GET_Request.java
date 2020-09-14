package rest_assured_concepts;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_Request {

	//public static void main(String[] args) {
		
	
	@Test
		public void test1() {
			// TODO Auto-generated method stub

		
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		Response response = request.get("/api/users/2");
		String asString = response.asString();
		System.out.println(asString);
		int statuscode=response.getStatusCode();
		System.out.println("status code:"+statuscode);
	Assert.assertEquals(200, statuscode);
	}

}
