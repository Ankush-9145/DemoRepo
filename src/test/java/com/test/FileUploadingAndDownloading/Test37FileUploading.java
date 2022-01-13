package com.test.FileUploadingAndDownloading;

import static io.restassured.RestAssured.*;

import java.io.File;

public class Test37FileUploading {

	public static void main(String[] args) {
		File file =new File("C:\\Users\\shri\\Desktop\\Testcase.txt");
		given()
		      .baseUri("https://the-internet.herokuapp.com/upload")
		      //.multiPart("file", file,"multipart/form-data")//common MIME-Type for all type of files
		      .multiPart("file",file,"text/plain")//ex:- MIME type for txt file
	   .when()
	          .post()
	   .then()
	          .log().all();
	}

}
