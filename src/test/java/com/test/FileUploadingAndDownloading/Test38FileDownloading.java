package com.test.FileUploadingAndDownloading;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileOutputStream;

import io.restassured.response.Response;

public class Test38FileDownloading {

	public static void main(String[] args) throws Exception {
		Response res=
		given()
		       .baseUri("https://chercher.tech/files/minion.zip")//download file name as path param
		.when()
		       .get();
		System.out.println(res.getStatusCode());
		System.out.println(res.getHeader("Content-Type"));
		
		byte[] resBody=res.getBody().asByteArray();
		File file =new File("target\\mydata.zip");
		FileOutputStream fos=new FileOutputStream(file);
		fos.write(resBody);
		fos.close();
		
	}

}
