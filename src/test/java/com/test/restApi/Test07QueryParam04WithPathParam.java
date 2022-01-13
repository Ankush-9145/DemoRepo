package com.test.restApi;

import static io.restassured.RestAssured.*;
public class Test07QueryParam04WithPathParam {

	public static void main(String[] args) {
		given()
		     .baseUri("https://restcountries.com/v3/name/india")
		     .queryParam("fullText", true)
	   .when()
	        .get()
	   .then()
	        .log().all();
	     
	}
}
