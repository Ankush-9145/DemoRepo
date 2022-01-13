package com.resource.reqres.in;

import static io.restassured.RestAssured.*;

public class Test20BodyParamsWithPatchMethod {

	public static void main(String[] args) {
		
		String x="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}";
		
		given()
		      .baseUri("https://reqres.in/api/users/2")
		      .header("Content-Type","application/json")
		      .body(x)
	   .when()
	          .patch()
	   .then()
	          .log().all();
	}

}
