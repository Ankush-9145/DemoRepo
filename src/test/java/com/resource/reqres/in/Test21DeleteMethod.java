package com.resource.reqres.in;

import static io.restassured.RestAssured.*;

public class Test21DeleteMethod {

	public static void main(String[] args) {
		given()
		      .baseUri("https://reqres.in/api/users/2")
		.when()
		      .delete()
		.then()
		       .log().all();

	}
}
