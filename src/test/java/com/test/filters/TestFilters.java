package com.test.filters;

import static io.restassured.RestAssured.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

public class TestFilters {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fo1=new FileOutputStream("target\\myreqreport.txt");
        PrintStream ps1 =new PrintStream(fo1);
        
        FileOutputStream fo2=new  FileOutputStream("target\\myresreport.txt");
        PrintStream ps2 =new PrintStream(fo2);
		
		given()
		      .baseUri("https://jsonplaceholder.typicode.com/posts/10")
		      .filter(RequestLoggingFilter.logRequestTo(ps1))
		      .filter(ResponseLoggingFilter.logResponseTo(ps2))
	    .when()
	          .get();
	}
}
