package com.test.headerParams_Authentication_Authorization;

import static io.restassured.RestAssured.*;

public class Test26BearerToken_Authorization01 {

	public static void main(String[] args) {
		String s="{\r\n"
				+ "  \"userName\": \"Test123\",\r\n"
				+ "  \"password\": \"Ankush@123\"\r\n"
				+ "}";
		
		
		given()
		      .baseUri("https://bookstore.toolsqa.com/Account/v1/User")
		      .header("Content-Type","application/json")
		      .body(s)
	   .when()
	         .post()
	   .then()
	         .log().all();
	}

}
