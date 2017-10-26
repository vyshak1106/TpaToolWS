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
@JsonPropertyOrder({ "_embedded", "_id", "_returned" })
public class BusinessResponseWrapper {

	@JsonProperty("_embedded")
	private List<Business> embedded = null;
	@JsonProperty("_id")
	private String id;
	@JsonProperty("_returned")
	private Integer returned;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("_embedded")
	public List<Business> getEmbedded() {
		return embedded;
	}

	@JsonProperty("_embedded")
	public void setEmbedded(List<Business> embedded) {
		this.embedded = embedded;
	}

	@JsonProperty("_id")
	public String getId() {
		return id;
	}

	@JsonProperty("_id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("_returned")
	public Integer getReturned() {
		return returned;
	}

	@JsonProperty("_returned")
	public void setReturned(Integer returned) {
		this.returned = returned;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}