package com.test.bodyparamsInJson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Test13BodyParamPojo {

	/*
	 * "userId":10,
     * "title":"wishes",
     * "body":"hi students,all the best"
   */
	
	//based on the request take the properties of pojo class
	//@JsonProperty value is same as Json keys
	
	@JsonProperty("userId")
	private int Id;
	
	@JsonProperty("title")
	private String t;
	
	@JsonProperty("body")
	private String b;
	
	public void setUserId(int x) {
		this.Id=x;
	}
	
	public void setTitle(String x) {
		this.t=x;
	}
	
	public void setBody(String x) {
		this.b=x;
	}
}