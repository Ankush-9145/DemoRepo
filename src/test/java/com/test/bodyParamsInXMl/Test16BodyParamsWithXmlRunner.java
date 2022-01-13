package com.test.bodyParamsInXMl;

import static io.restassured.RestAssured.*;

public class Test16BodyParamsWithXmlRunner {

	public static void main(String[] args) {
		Test16BodyParamsWithXmlPojo obj=new Test16BodyParamsWithXmlPojo();
		obj.setLogin("login");
		obj.setPassword("password");
		
		given()
		       .baseUri("https://reqbin.com/echo/post/xml")
		       .header("Content-Type","application/xml")
		       .body(obj)
	   .when()
	           .post()
	   .then()
	           .log().all();

	}

}
