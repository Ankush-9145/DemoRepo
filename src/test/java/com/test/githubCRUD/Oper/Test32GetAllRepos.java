package com.test.githubCRUD.Oper;

import static io.restassured.RestAssured.*;

public class Test32GetAllRepos {

	public static void main(String[] args) {
		given()
		       .baseUri("https://api.github.com/user/repos")
		       .auth().oauth2("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")
		.when()
		       .get()
		.then()
		       .log().all();

	}

}
