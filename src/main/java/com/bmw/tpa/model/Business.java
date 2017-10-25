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
@JsonPropertyOrder({ "_id", "Year", "ApplicationNumber", "ChangeForecastID", "Business", "Kt_and_Others" })
public class Business {

	@JsonProperty("_id")
	private Id id;
	@JsonProperty("Year")
	private Integer year;
	@JsonProperty("ApplicationNumber")
	private Integer applicationNumber;
	@JsonProperty("ChangeForecastID")
	private String changeForecastID;
	@JsonProperty("Business")
	private List<Double> business = null;
	@JsonProperty("Kt_and_Others")
	private List<Double> ktAndOthers = null;
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

	@JsonProperty("Year")
	public Integer getYear() {
		return year;
	}

	@JsonProperty("Year")
	public void setYear(Integer year) {
		this.year = year;
	}

	@JsonProperty("ApplicationNumber")
	public Integer getApplicationNumber() {
		return applicationNumber;
	}

	@JsonProperty("ApplicationNumber")
	public void setApplicationNumber(Integer applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	@JsonProperty("ChangeForecastID")
	public String getChangeForecastID() {
		return changeForecastID;
	}

	@JsonProperty("ChangeForecastID")
	public void setChangeForecastID(String changeForecastID) {
		this.changeForecastID = changeForecastID;
	}

	@JsonProperty("Business")
	public List<Double> getBusiness() {
		return business;
	}

	@JsonProperty("Business")
	public void setBusiness(List<Double> business) {
		this.business = business;
	}

	@JsonProperty("Kt_and_Others")
	public List<Double> getKtAndOthers() {
		return ktAndOthers;
	}

	@JsonProperty("Kt_and_Others")
	public void setKtAndOthers(List<Double> ktAndOthers) {
		this.ktAndOthers = ktAndOthers;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({ "$oid" })
	private class Id {

		@JsonProperty("$oid")
		private String $oid;
		@JsonIgnore
		private Map<String, Object> additionalProperties = new HashMap<String, Object>();

		@JsonProperty("$oid")
		public String get$oid() {
			return $oid;
		}

		@JsonProperty("$oid")
		public void set$oid(String $oid) {
			this.$oid = $oid;
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
}
