package com.test.formParam.InterviewQuestion;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class Test40FormParamIQ {

	public static void main(String[] args) {
		Response res= 
		  given()
		      .baseUri("http://www.smatbot.com/kya_backend/pagehub/chatbot_utils")
		      .formParams("action", "init_chat")
		      .formParam("device_print", "ed79cf898a7951b5f8858d2d7f4f106f")
		      .formParam("chatbot_id", "4174")
		      .formParam("name", "SmatBot")
		      .formParam("language_code", "default")
	    .when()
	          .post();
		
		String value=res.getBody().jsonPath().getString("cb_session");
		System.out.println(value);
		
		given()
	      .baseUri("http://www.smatbot.com/kya_backend/pagehub/chatbot_utils")
	      .formParam("action", "answer")
	      .formParam("answer_text", "test")
	      .formParam("cb_session", value)
	      .formParam("question_id", 4017)
	      .formParam("is_logical", 0)
	      .formParam("sequence", 2)
	      .formParam("chatbot_id", 417)
	      .formParam("option", "undefined")
	      .formParam("visitor_link_traversal", "")
	      .formParam("language_code", "default")
	   .when()
	         .post()
	   .then()
	         .log().all();
	}

}
