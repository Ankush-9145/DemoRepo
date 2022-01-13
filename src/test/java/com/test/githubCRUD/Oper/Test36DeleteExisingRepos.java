package com.test.githubCRUD.Oper;

import static io.restassured.RestAssured.*;

public class Test36DeleteExisingRepos {

	public static void main(String[] args) {
	
		given()
		      .baseUri("https://api.github.com/repos/Ankush-9145/ankdjaskdjdkkskjkkkjk")
		      .auth().oauth2("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")
		.when()
		      .delete()
		.then()
		      .log().all();
	}

}
