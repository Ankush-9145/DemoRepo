package com.test.githubCRUD.Oper;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;

public class Test35UpdateExistingRepos {

	public static void main(String[] args) {
		
		JSONObject obj=new JSONObject();
		obj.put("name", "ankush");

		given()
		      .baseUri("https://api.github.com/repos/Ankush-9145/ankush1223")
		      .auth().oauth2("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")
		      .header("accept","application/vnd.github.v3+json")
		      .body(obj.toString())
	    .when()
	          .patch()
	    .then()
	          .log().all();
	}

}
