package com.test.restApi;

import static io.restassured.RestAssured.*;;

public class Test05QueryParam02 {

	public static void main(String[] args) {
		given()
		  .baseUri("https://api.weatherapi.com/v1/current.json")
		  .queryParam("key", "b48b21e1e02844ab8ae85024212707")
		  .queryParam("q", "pune")
	   .when()
	       .get()
	   .then()
	        .log().body();

	}

}
