package com.test.restApi;

import static io.restassured.RestAssured.*;

import java.io.File;

public class Test10BodyParamWithFile {

	public static void main(String[] args) {
		File f=new File("src/test/resources/mydata.json");
		given()
		      .baseUri("https://jsonplaceholder.typicode.com/posts")
		      .header("Content-Type", "application/json")
		      .body(f)
		.when()
		      .post()
		.then()
		      .log().all();
	}

}
