package com.test.JsonPayload.Pojo;

import java.util.List;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"data1","data2","data3","data4","data5"})
@Generated("Myself")
public class MyMsa {

	@JsonProperty("cars")
	private List<String> cars;
	
	@JsonProperty("ITR")
	private Boolean ITR;

	public List<String> getCars() {
		return cars;
	}

	public void setCars(List<String> cars) {
		this.cars = cars;
	}

	public Boolean getITR() {
		return ITR;
	}

	public void setITR(Boolean iTR) {
		ITR = iTR;
	}
}
