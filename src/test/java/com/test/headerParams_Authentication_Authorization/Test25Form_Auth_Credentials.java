package com.test.headerParams_Authentication_Authorization;

import static io.restassured.RestAssured.*;

import io.restassured.authentication.FormAuthConfig;

public class Test25Form_Auth_Credentials {

	public static void main(String[] args) {
		FormAuthConfig  formConfig=new FormAuthConfig("index.php","uid","password");
		
		given()
		      .baseUri("http://demo.guru99.com/v1/index.php")
		      .auth().form("mngr356676", "deqUpav", formConfig)
	   .when()
	          .post()
	   .then()
	          .log().all();
	}
}
