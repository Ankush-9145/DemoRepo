package com.test.restApi;

import static io.restassured.RestAssured.*;
public class Test09MatrixParam {

	public static void main(String[] args) {
		// https://petstore.swagger.io/v2/pet/findbystatus;matrixparam=test?offset=0&pagesize=20

		//for ; in uri to identify matrix parameter
		//matrix parameter with query parameter
		urlEncodingEnabled=false;
		given()
		      .baseUri("https://petstore.swagger.io/v2/pet/findByStatus;matrixParam=test")
		      .queryParam("offSet", 0)
		      .queryParam("pageSize", 20)
	   .when()
	          .get()
	   .then()
	          .log().all();
	}

}
