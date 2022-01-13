package com.test.restApi;

import static io.restassured.RestAssured.*;

import java.util.Scanner;

public class Test08QueryParam05WithPathParamScanner {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter country name:: ");
		String country=sc.nextLine();
		System.out.println("Enter a value like true or false:: ");
		String value=sc.nextLine();
		sc.close();
		
		given()
		      .baseUri("https://restcountries.com/v3/name/"+country)
		      .queryParam("fullText", value)
	    .when()
	          .get()
	    .then()
	          .log().all();

	}

}
