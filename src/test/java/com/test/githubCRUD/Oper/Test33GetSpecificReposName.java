package com.test.githubCRUD.Oper;

import static io.restassured.RestAssured.*;

public class Test33GetSpecificReposName {

	public static void main(String[] args) {
		given()
		      .baseUri("https://api.github.com/repos/Ankush-9145/ankushbhai123")
		      .auth().oauth2("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")
		.when()
		       .get()
	    .then()
	           .log().all();

	}

}
