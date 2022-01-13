package com.test.restApi;

import static io.restassured.RestAssured.*;

public class Test04QueryParam01 {

	public static void main(String[] args) {
		given()
		   .baseUri("https://www.google.com/search")
		   .queryParam("q", "abdul kalam")
		.when()
		   .get()
		.then()
		   .log().body();
	}

}
