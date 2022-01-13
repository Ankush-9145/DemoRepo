package com.test.headerParams_Authentication_Authorization;

import static io.restassured.RestAssured.*;

public class Test27BearerToken_Authorization02 {
     //generate baerer token
	public static void main(String[] args) {
		// user-id=2deccda8-fd5e-4875-bb53-cde9f9c7f028
		//"token": 
		//"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IkFwaVRlc3QxMjMiLCJwYXNzd29yZCI6IkFua3VzaEAxMjMiLCJpYXQiOjE2MzM0MzkwNjN9.uGtIVfiBasiCDpw93yVeURWOhUNNG6Bz39VDeVxM_Lg"
		String s="{\r\n"
				+ "  \"userName\": \"ApiTest123\",\r\n"
				+ "  \"password\": \"Ankush@123\"\r\n"
				+ "}";
		
		given()
		       .baseUri("https://bookstore.toolsqa.com/Account/v1/GenerateToken")
		       .header("Content-Type","application/json")
		       .body(s)
	   .when()
	          .post()
	   .then()
	         .log().all();
	}
}