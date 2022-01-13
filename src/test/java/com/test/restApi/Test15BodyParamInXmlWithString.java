package com.test.restApi;

import static io.restassured.RestAssured.*;

public class Test15BodyParamInXmlWithString {

	public static void main(String[] args) {
		
         String x="<Request>\r\n"
         		+ "   <login>login</login>\r\n"
         		+ "   <password>password</password>\r\n"
         		+ "</Request>";
         
         given()
               .baseUri("https://reqbin.com/echo/post/xml")
               .header("Content-Type","application/xml")
               .body(x)
        .when()
               .post()
        .then()
               .log().all();
	}

}
