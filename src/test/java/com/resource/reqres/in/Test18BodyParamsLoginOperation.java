package com.resource.reqres.in;

import static io.restassured.RestAssured.*;

public class Test18BodyParamsLoginOperation {

	public static void main(String[] args) {
		String x="{\r\n"
				+ "    \"email\": \"eve.holt@reqres.in\",\r\n"
				+ "    \"password\": \"cityslicka\"\r\n"
				+ "}";
		
		given() 
		      .baseUri("https://reqres.in/api/login")
		      .header("Content-Type","application/json")
		      .body(x)
	    .when()
	          .post()
	    .then()
	          .log().all();
	}
}