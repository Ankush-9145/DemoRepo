package com.test.bodyparamsInJson;

import static io.restassured.RestAssured.*;

public class Test13BidyParamsRunner {

	public static void main(String[] args) {
		//create the object of pojo class and set properties
		Test13BodyParamPojo pObj=new Test13BodyParamPojo();
		pObj.setUserId(10);
		pObj.setTitle("wishes");
		pObj.setBody("hello");
		

		given()
		      .baseUri("https://jsonplaceholder.typicode.com/posts")
		      .header("Content-Type","application/json")
		      .body(pObj)//file string object JsonObjext
		.when()
		      .post()
		.then()
		      .log().all();
	}

}
