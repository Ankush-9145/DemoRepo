package com.test.restApi;


import  static io.restassured.RestAssured.*;

import java.io.File;
public class Test14BodyParamInXmlWithFile {

	public static void main(String[] args) {
	
        File f=new File("src\\test\\resources\\mydata.xml");
        
        given()
               .baseUri("https://reqbin.com/echo/post/xml")
               .header("Content-Type","application/json")
               .body(f)
        .when()
               .post()
        .then()
                .log().all();
	}

}
