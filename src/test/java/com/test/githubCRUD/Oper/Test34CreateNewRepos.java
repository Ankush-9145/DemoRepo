package com.test.githubCRUD.Oper;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;

public class Test34CreateNewRepos {

	public static void main(String[] args) {
		JSONObject obj=new JSONObject();
		obj.put("name", "ankdjaskdjdkkskjkkkjk");
		given()
		       .baseUri("https://api.github.com/user/repos")
		       .auth().oauth2("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")
		       .body(obj.toString())
	    .when()
	           .post()
	    .then()
	           .log().all();

	}

}
