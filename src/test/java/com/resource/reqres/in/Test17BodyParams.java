package com.resource.reqres.in;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;

public class Test17BodyParams {

	public static void main(String[] args) {
		JSONObject obj=new JSONObject();
		obj.put("name", "ankush");
		obj.put("job", "software engg");
		
		given()
		       .baseUri("https://reqres.in/api/users")
		       .header("Content-Type","application/json")
		       .body(obj.toString())
	   .when()
	           .post()
	   .then()
	           .log().all();

	}

}
