package com.test.JsonPayload.Pojo;

import java.io.File;

import io.restassured.path.json.JsonPath;

public class Runner {

	public static void main(String[] args) {
		File file = new File("src\\test\\resources\\jsonPayload.json");
		JsonPath jp =new JsonPath(file);
		MainPojo pojo =jp.getObject("$", MainPojo.class);

		/*Mydata3 d =jp.getObject("data3", Mydata3.class);
		System.out.println(d.getAge());
		
		List<Mydata4> d1 = jp.getList("data4", Mydata4.class);
		System.out.println(d1.get(0).getHeight());
		
		Mydata5 m =jp.getObject("data5", Mydata5.class);
		System.out.println(m.getMsa().getITR());*/
		
		System.out.println(pojo.getData1());
		System.out.println(pojo.getData2());
		System.out.println(pojo.getData3().getName());
		System.out.println(pojo.getData3().getAge());
		System.out.println(pojo.getData4().get(1).getHeight());
		System.out.println(pojo.getData5().getEng().getOfficial()+" "+pojo.getData5().getEng().getCommon());
	}
}
