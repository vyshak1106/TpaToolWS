package com.bmw.tpa.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "_id", "application_number", "change_forecast_id", "cr_id", "cr_doc", "cr_coc", "cr_description" })
public class ChangeRequest {

	@JsonProperty("_id")
	private Id id;
	@JsonProperty("application_number")
	private Integer applicationNumber;
	@JsonProperty("change_forecast_id")
	private Integer changeForecastId;
	@JsonProperty("cr_id")
	private String crId;
	@JsonProperty("cr_doc")
	private String crDoc;
	@JsonProperty("cr_coc")
	private String crCoc;
	@JsonProperty("cr_description")
	private String crDescription;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("_id")
	public Id getId() {
		return id;
	}

	@JsonProperty("_id")
	public void setId(Id id) {
		this.id = id;
	}

	@JsonProperty("application_number")
	public Integer getApplicationNumber() {
		return applicationNumber;
	}

	@JsonProperty("application_number")
	public void setApplicationNumber(Integer applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	@JsonProperty("change_forecast_id")
	public Integer getChangeForecastId() {
		return changeForecastId;
	}

	@JsonProperty("change_forecast_id")
	public void setChangeForecastId(Integer changeForecastId) {
		this.changeForecastId = changeForecastId;
	}

	@JsonProperty("cr_id")
	public String getCrId() {
		return crId;
	}

	@JsonProperty("cr_id")
	public void setCrId(String crId) {
		this.crId = crId;
	}

	@JsonProperty("cr_doc")
	public String getCrDoc() {
		return crDoc;
	}

	@JsonProperty("cr_doc")
	public void setCrDoc(String crDoc) {
		this.crDoc = crDoc;
	}

	@JsonProperty("cr_coc")
	public String getCrCoc() {
		return crCoc;
	}

	@JsonProperty("cr_coc")
	public void setCrCoc(String crCoc) {
		this.crCoc = crCoc;
	}

	@JsonProperty("cr_description")
	public String getCrDescription() {
		return crDescription;
	}

	@JsonProperty("cr_description")
	public void setCrDescription(String crDescription) {
		this.crDescription = crDescription;
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