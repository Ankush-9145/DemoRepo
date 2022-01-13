package com.test.headerParams_Authentication_Authorization;

import static io.restassured.RestAssured.*;

public class Test24Digest_Auth_Credentials {

	public static void main(String[] args) {
		given()
		       .baseUri("http://the-internet.herokuapp.com/basic_auth")
		       .auth().digest("admin", "admin")
	    .when()
	           .get()
	    .then()
	           .log().all();
	}
}
