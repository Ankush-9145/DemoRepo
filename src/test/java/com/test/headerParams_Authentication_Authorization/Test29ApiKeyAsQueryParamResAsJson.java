package com.test.headerParams_Authentication_Authorization;

import static io.restassured.RestAssured.*;

import java.util.Scanner;

public class Test29ApiKeyAsQueryParamResAsJson {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter city name::");
		String city=sc.nextLine();
		sc.close();
		
		given()
		       .baseUri("https://api.weatherapi.com/v1/current.json")
		       .queryParam("key", "b48b21e1e02844ab8ae85024212707")
		       .queryParam("q", city)
	    .when()
	           .get()
	    .then()
	           .log().all();
	}

}
