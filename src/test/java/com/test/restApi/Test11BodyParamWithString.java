package com.test.restApi;

import static io.restassured.RestAssured.*;

public class Test11BodyParamWithString {

	public static void main(String[] args) {
		String j="{\r\n"
				+ "  \"userId\":10,\r\n"
				+ "  \"title\":\"wishes\",\r\n"
				+ "  \"body\":\"hi students,all the best\"\r\n"
				+ "}";
		
		given()
		       .baseUri("https://jsonplaceholder.typicode.com/posts")
		       .header("content-type","application/json")
		       .body(j)
	  .when()
	         .post()
	  .then()
	         .log().all();
	}
}
