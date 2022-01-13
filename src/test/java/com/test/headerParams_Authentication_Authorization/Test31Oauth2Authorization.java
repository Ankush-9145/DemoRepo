package com.test.headerParams_Authentication_Authorization;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Test31Oauth2Authorization {

	public static void main(String[] args) {
		Response res=given()
				.baseUri("https://api.github.com/user/repos")
				.auth().oauth2("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")
       .when()
                .get();
                  
        System.out.println(res.getStatusCode());
		System.out.println(res.asPrettyString());
		System.out.println(res.header("content-type"));
		System.out.println(res.getBody().jsonPath().getList("name"));
	}

}
