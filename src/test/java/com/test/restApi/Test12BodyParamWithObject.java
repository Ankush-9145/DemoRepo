package com.test.restApi;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;

public class Test12BodyParamWithObject {

	public static void main(String[] args) {
		JSONObject obj=new JSONObject();
		obj.put("userId", 10);
		obj.put("title", "wishes");
		obj.put("body", "all the best");
		
		given()
		       .baseUri("https://jsonplaceholder.typicode.com/posts")
		       .header("content-type","application/json")
		       .body(obj.toString())
		.when()
		       .post()
		.then()
		       .log().all();
	}
}
