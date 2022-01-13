package com.test.headerParams_Authentication_Authorization;

import static io.restassured.RestAssured.*;

public class Test22Basic_Auth_Credentials {

	public static void main(String[] args) {
		given()
		       .baseUri("http://the-internet.herokuapp.com/basic_auth")
		       .auth().basic("admin", "admin")
	   .when()
	           .get()
	   .then()
	          .log().all();
	}
}
