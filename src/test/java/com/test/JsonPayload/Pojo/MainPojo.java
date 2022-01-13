package com.test.JsonPayload.Pojo;

import java.util.List;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"data1","data2","data3","data4","data5"})
@Generated("Myself")
public class MainPojo {

	@JsonProperty("data1")
	private String data1;
	
	@JsonProperty("data2")
	private List<Object> data2;
	
	@JsonProperty("data3")
	private Mydata3 data3;
	
	@JsonProperty("data4")
	private List<Mydata4> data4;
	
	@JsonProperty("data5")
	private Mydata5 data5;

	public String getData1() {
		return data1;
	}

	public void setData1(String data1) {
		this.data1 = data1;
	}

	public List<Object> getData2() {
		return data2;
	}

	public void setData2(List<Object> data2) {
		this.data2 = data2;
	}

	public Mydata3 getData3() {
		return data3;
	}

	public void setData3(Mydata3 data3) {
		this.data3 = data3;
	}

	public List<Mydata4> getData4() {
		return data4;
	}

	public void setData4(List<Mydata4> data4) {
		this.data4 = data4;
	}

	public Mydata5 getData5() {
		return data5;
	}

	public void setData5(Mydata5 data5) {
		this.data5 = data5;
	}
}
