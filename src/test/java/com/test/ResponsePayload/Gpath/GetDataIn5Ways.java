package com.test.ResponsePayload.Gpath;

import java.io.File;
import java.util.List;
import java.util.Map;

import io.restassured.path.json.JsonPath;

public class GetDataIn5Ways {

	public static void main(String[] args) {
		File file =new File("src\\test\\resources\\jsonPayload.json");
		JsonPath jPath =new JsonPath(file);
		
		//String data1=jPath.getString("data1");
		System.out.println("data1 value is "+jPath.getString("data1"));
		
		List<Object> data2 = jPath.getList("data2");
		/*for(Object s:data2) {
			System.out.println(s);
		}*/
		System.out.println("data2 value is "+data2);
		
		Map<String, Object> data3 =jPath.getMap("data3");
		System.out.println("data3 value is "+data3);
		
		/*for(String key:data3.keySet()) {
			System.out.println(key+ " "+data3.get(key));
		}*/
		
		List<Map<String, Object>> data4 = jPath.getList("data4");
		
		System.out.println("data4 value is "+data4);
		
		/*for(Map<String,Object> m:data4) {
			for(String key:m.keySet()) {
				System.out.println(key+" "+m.get(key));
			}
		}*/
		
		Map<String, Map<String, Object>> data5 =jPath.getMap("data5");
		System.out.println("data5 value is "+data5);
		
		System.out.println(jPath.getString("data4.find{it.name=='batch254'}.age"));
		
		/*for(String key:data5.keySet()) {
			System.out.println(key+" "+data5.get(key));
		}*/
	}
}
