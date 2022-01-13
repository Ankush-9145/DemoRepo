package com.test.restApi;

import static io.restassured.RestAssured.*;

public class Test03TemplateOrPathParam {

	public static void main(String[] args) {
		
		//way-1 (template/path parameter) in end of base uri
		given()
		   .baseUri("https://jsonplaceholder.typicode.com/posts/10")//path params
		.when()
		   .get()
		.then()
		   .log().all();
		
		//way-2 (template/path parameter) in get() method
		given()
		  .baseUri("https://jsonplaceholder.typicode.com/posts")
		.when()
		  .get("100")//path params
		.then()
		  .log().body();
		
		
		//way-3 (template/path parameter) using pathParams(-,-) method
		given()
		   .baseUri("https://jsonplaceholder.typicode.com/posts")
		   .pathParams("id", 50)//some services it will not work
	    .when()
	       .get()
	    .then()
	       .log().all();
	}
}