package com.test.restApi;

import static io.restassured.RestAssured.*;

public class Test02 {

	public static void main(String[] args) {
		given()
		    .baseUri("https://jsonplaceholder.typicode.com/posts")//RequestSpecification
	.when()
	      .get()
	      
	 .then()
	      
	       .log().body();
	}
}
