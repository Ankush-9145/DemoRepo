package com.test.formParams.StripeSite;

import static io.restassured.RestAssured.*;

public class GetSpecificCustomer {

	public static void main(String[] args) {
		given()
		       .baseUri("https://api.stripe.com/v1/customers/cus_KRAwBvFt6Vu8Xp")
		       .auth().basic("sk_test_51JmI2GSJ7wCgyinF6iL8lxAyAsiHQjLbm9fiwbLwrwWbiZh3P03JSZcpjD9P0gDGUb2XLGMbG9NQtfrKU0cEHQ6V00G1Cb1UOm","")
		       .header("Content-Type","application/x-www-form-urlencoded")
	   .when()
	           .get()
	   .then()
	           .log().all();
	}

}
