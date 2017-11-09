package com.bmw.tpa.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "year", "data" })
public class Business {

	@JsonProperty("year")
	private Integer year;
	@JsonProperty("data")
	private List<Data> data = null;

	@JsonProperty("year")
	public Integer getYear() {
		return year;
	}

	@JsonProperty("year")
	public void setYear(Integer year) {
		this.year = year;
	}

	@JsonProperty("data")
	public List<Data> getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(List<Data> data) {
		this.data = data;
	}

}