package com.test.JsonPayload.Pojo;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"data1","data2","data3","data4","data5"})
@Generated("Myself")
public class Mydata3 {

	@JsonProperty("name")
	private String name;
	
	@JsonProperty("age")
	private int age;
	
	public void setName(String n) {
		name=n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int a) {
		age=a;
	}
	
	public int getAge() {
		return age;
	}
}
