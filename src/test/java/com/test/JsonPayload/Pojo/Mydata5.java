package com.test.JsonPayload.Pojo;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"data1","data2","data3","data4","data5"})
@Generated("Myself")
public class Mydata5 {

	@JsonProperty("engg")
	private MyEng eng;
	
	@JsonProperty("msa")
	private MyMsa msa;

	public MyEng getEng() {
		return eng;
	}

	public void setEng(MyEng eng) {
		this.eng = eng;
	}

	public MyMsa getMsa() {
		return msa;
	}

	public void setMsa(MyMsa msa) {
		this.msa = msa;
	}
}
