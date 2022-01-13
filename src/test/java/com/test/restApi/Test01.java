package com.test.restApi;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test01 {

	public static void main(String[] args) {
	    RestAssured.baseURI="https://jsonplaceholder.typicode.com/posts";
	    
	    Response res=RestAssured.get();
	    
	    System.out.println(res.body().asPrettyString());
	    
	    //System.out.println(res.getBody().asString());

	}

}
