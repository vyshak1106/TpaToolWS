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
@JsonPropertyOrder({ "_id", "CR_ID", "CR_Doc", "CR_CoC", "Comment to Changes out of CRs", "SLA start (operations) Date",
		"End Date Betrieb", "End Date Wartung", "Check Wartung", "Check Betrieb", "CR_Description",
		"ChangeForecastID" })
public class ChangeRequest {

	@JsonProperty("_id")
	private Id id;
	@JsonProperty("CR_ID")
	private String cRID;
	@JsonProperty("CR_Doc")
	private String cRDoc;
	@JsonProperty("CR_CoC")
	private String cRCoC;
	@JsonProperty("Comment to Changes out of CRs")
	private String commentToChangesOutOfCRs;
	@JsonProperty("SLA start (operations) Date")
	private String sLAStartOperationsDate;
	@JsonProperty("End Date Betrieb")
	private String endDateBetrieb;
	@JsonProperty("End Date Wartung")
	private String endDateWartung;
	@JsonProperty("Check Wartung")
	private String checkWartung;
	@JsonProperty("Check Betrieb")
	private String checkBetrieb;
	@JsonProperty("CR_Description")
	private String cRDescription;
	@JsonProperty("ChangeForecastID")
	private String changeForecastID;
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

	@JsonProperty("CR_ID")
	public String getCRID() {
		return cRID;
	}

	@JsonProperty("CR_ID")
	public void setCRID(String cRID) {
		this.cRID = cRID;
	}

	@JsonProperty("CR_Doc")
	public String getCRDoc() {
		return cRDoc;
	}

	@JsonProperty("CR_Doc")
	public void setCRDoc(String cRDoc) {
		this.cRDoc = cRDoc;
	}

	@JsonProperty("CR_CoC")
	public String getCRCoC() {
		return cRCoC;
	}

	@JsonProperty("CR_CoC")
	public void setCRCoC(String cRCoC) {
		this.cRCoC = cRCoC;
	}

	@JsonProperty("Comment to Changes out of CRs")
	public String getCommentToChangesOutOfCRs() {
		return commentToChangesOutOfCRs;
	}

	@JsonProperty("Comment to Changes out of CRs")
	public void setCommentToChangesOutOfCRs(String commentToChangesOutOfCRs) {
		this.commentToChangesOutOfCRs = commentToChangesOutOfCRs;
	}

	@JsonProperty("SLA start (operations) Date")
	public String getSLAStartOperationsDate() {
		return sLAStartOperationsDate;
	}

	@JsonProperty("SLA start (operations) Date")
	public void setSLAStartOperationsDate(String sLAStartOperationsDate) {
		this.sLAStartOperationsDate = sLAStartOperationsDate;
	}

	@JsonProperty("End Date Betrieb")
	public String getEndDateBetrieb() {
		return endDateBetrieb;
	}

	@JsonProperty("End Date Betrieb")
	public void setEndDateBetrieb(String endDateBetrieb) {
		this.endDateBetrieb = endDateBetrieb;
	}

	@JsonProperty("End Date Wartung")
	public String getEndDateWartung() {
		return endDateWartung;
	}

	@JsonProperty("End Date Wartung")
	public void setEndDateWartung(String endDateWartung) {
		this.endDateWartung = endDateWartung;
	}

	@JsonProperty("Check Wartung")
	public String getCheckWartung() {
		return checkWartung;
	}

	@JsonProperty("Check Wartung")
	public void setCheckWartung(String checkWartung) {
		this.checkWartung = checkWartung;
	}

	@JsonProperty("Check Betrieb")
	public String getCheckBetrieb() {
		return checkBetrieb;
	}

	@JsonProperty("Check Betrieb")
	public void setCheckBetrieb(String checkBetrieb) {
		this.checkBetrieb = checkBetrieb;
	}

	@JsonProperty("CR_Description")
	public String getCRDescription() {
		return cRDescription;
	}

	@JsonProperty("CR_Description")
	public void setCRDescription(String cRDescription) {
		this.cRDescription = cRDescription;
	}

	@JsonProperty("ChangeForecastID")
	public String getChangeForecastID() {
		return changeForecastID;
	}

	@JsonProperty("ChangeForecastID")
	public void setChangeForecastID(String changeForecastID) {
		this.changeForecastID = changeForecastID;
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