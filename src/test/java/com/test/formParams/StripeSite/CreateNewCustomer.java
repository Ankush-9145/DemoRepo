package com.test.formParams.StripeSite;

import static io.restassured.RestAssured.*;

public class CreateNewCustomer {

	public static void main(String[] args) {
		// sk_test_51JmI2GSJ7wCgyinF6iL8lxAyAsiHQjLbm9fiwbLwrwWbiZh3P03JSZcpjD9P0gDGUb2XLGMbG9NQtfrKU0cEHQ6V00G1Cb1UOm

		given()
		      .baseUri("https://api.stripe.com/v1/customers")
		      .header("Authorization","Bearer sk_test_51JmI2GSJ7wCgyinF6iL8lxAyAsiHQjLbm9fiwbLwrwWbiZh3P03JSZcpjD9P0gDGUb2XLGMbG9NQtfrKU0cEHQ6V00G1Cb1UOm")
		      .header("Content-Type","application/x-www-form-urlencoded")
		      .formParam("email", "ankushd.tebd@gmail.com")
		      .formParam("description", "my optional account")
		      .formParam("name", "ankush dongre")
		      .formParam("phone", "9145204527")
	   .when()
	          .post()
	  .then()
	          .log().all();
	}

}
