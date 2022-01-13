package com.test.headerParams_Authentication_Authorization;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class Test28BearerToken_Authorization03 {

	public static void main(String[] args) {
		//generate token
		String s="{\r\n"
				+ "  \"userName\": \"Test123\",\r\n"
				+ "  \"password\": \"Ankush@123\"\r\n"
				+ "}";
		
		Response res=given()
		       .baseUri("https://bookstore.toolsqa.com/Account/v1/GenerateToken")
		       .header("Content-Type","application/json")
		       .body(s)
	   .when()
	          .post();
		
		String a=res.getBody().jsonPath().getString("token");
	    System.out.println(a);
		
		//create a book 
		String x="{\r\n"
				+ "  \"userId\": \"70fd2683-10f5-4181-b2c6-ecd9fc0d2dd4\",\r\n"
				+ "  \"collectionOfIsbns\": [\r\n"
				+ "    {\r\n"
				+ "      \"isbn\": \"6545646464646\"\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}";
		
		given()
		       .baseUri("https://bookstore.toolsqa.com/BookStore/v1/Books")
		       .header("Authorization", "Bearer "+a)
		       .header("Content-Type","application/json")
		       .body(x)
	   .when()
	           .post()
	   .then()
	           .log().all();
	}
}