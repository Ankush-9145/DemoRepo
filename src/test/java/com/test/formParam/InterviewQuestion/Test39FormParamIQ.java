package com.test.formParam.InterviewQuestion;

import static io.restassured.RestAssured.*;

public class Test39FormParamIQ {

	public static void main(String[] args) {
		given()
		      .baseUri("http://www.smatbot.com/kya_backend/pagehub/chatbot_utils")
		      .formParams("action", "init_chat")
		      .formParam("device_print", "ed79cf898a7951b5f8858d2d7f4f106f")
		      .formParam("chatbot_id", "4174")
		      .formParam("name", "SmatBot")
		      .formParam("language_code", "default")
	    .when()
	          .post()
	    .then()
	          .log().all();
	}

}
