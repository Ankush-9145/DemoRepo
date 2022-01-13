package com.resource.reqres.in;

import java.io.File;

import static io.restassured.RestAssured.*; 

public class Test19BodyParamWithPutMethod {

	public static void main(String[] args) {
		File f=new File("src/test/resources/data.json");
		
		given()   
		      .baseUri("https://reqres.in/api/users/2")
		      .header("Content-Type","application/json")
		      .body(f)
	   .when()
	          .put()
	   .then()
	          .log().all();

	}
}