package rest_assured_deserialization;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import rest_assured_deserialization_pojo.ResponsePage;

public class Deserialization {
	@Test
public void tc001() {
	RestAssured.baseURI="https://reqres.in/api/users/";
	 Response response = RestAssured.given().queryParam("page", "2").get();
	System.out.println(response.asString());
	ResponsePage ResponsePage = response.as(ResponsePage.class);
	System.out.println(ResponsePage);
	String last_name = ResponsePage.getData().get(5).getLast_name();
	String url = ResponsePage.getAd().getUrl();
	String per_page = ResponsePage.getPer_page();
	System.out.println(last_name);
	System.out.println(url);
	System.out.println(per_page);
}
}
