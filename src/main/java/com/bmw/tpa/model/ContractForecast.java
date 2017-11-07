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
@JsonPropertyOrder({ "_id", "change_forecast_id", "application_number", "application_name", "cmddb_id",
		"operation_scope", "maintenance_scope", "valid_from", "valid_to", "price_band", "service_level",
		"lead_timezone", "timeZone_extendToSaturday", "public_holidayRegulation", "extended_service_monFri",
		"extended_service_sat", "extended_service_sun", "operation_cluster", "sr_number", "operation_dept",
		"operation_group", "operation_cost", "maintenance_cluster", "maintenance_department", "maintenance_group",
		"maintenance_cost", "source_code", "privacy_policy", "dvp_data", "onsite_operation", "onsite_maintenance",
		"business", "kt_and_others" })
public class ContractForecast {

	@JsonProperty("_id")
	private Id id;
	@JsonProperty("change_forecast_id")
	private Integer change_forecast_id;
	@JsonProperty("application_number")
	private Integer application_number;
	@JsonProperty("application_name")
	private String application_name;
	@JsonProperty("operation_scope")
	private String operation_scope;
	@JsonProperty("maintenance_scope")
	private String maintenance_scope;
	@JsonProperty("valid_from")
	private String valid_from;
	@JsonProperty("valid_to")
	private String valid_to;
	@JsonProperty("price_band")
	private String price_band;
	@JsonProperty("service_level")
	private String service_level;
	@JsonProperty("lead_timezone")
	private String lead_timezone;
	@JsonProperty("timeZone_extendToSaturday")
	private String timeZone_extendToSaturday;
	@JsonProperty("public_holidayRegulation")
	private String public_holidayRegulation;
	@JsonProperty("extended_service_monFri")
	private String extended_service_monFri;
	@JsonProperty("extended_service_sat")
	private String extended_service_sat;
	@JsonProperty("extended_service_sun")
	private String extended_service_sun;
	@JsonProperty("operation_cluster")
	private String operation_cluster;
	@JsonProperty("sr_number")
	private String sr_number;
	@JsonProperty("operation_dept")
	private String operation_dept;
	@JsonProperty("operation_group")
	private String operation_group;
	@JsonProperty("operation_cost")
	private Integer operation_cost;
	@JsonProperty("maintenance_cluster")
	private String maintenance_cluster;
	@JsonProperty("maintenance_department")
	private String maintenance_department;
	@JsonProperty("maintenance_group")
	private String maintenance_group;
	@JsonProperty("maintenance_cost")
	private Integer maintenance_cost;
	@JsonProperty("source_code")
	private String source_code;
	@JsonProperty("privacy_policy")
	private String privacy_policy;
	@JsonProperty("dvp_data")
	private String dvp_data;
	@JsonProperty("onsite_operation")
	private String onsite_operation;
	@JsonProperty("onsite_maintenance")
	private String onsite_maintenance;
	@JsonProperty("business")
	private List<Business> business = null;
	@JsonProperty("kt_and_others")
	private List<KtAndOther> ktAndOthers = null;
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
	@JsonProperty("change_forecast_id")
	public Integer getChange_forecast_id() {
		return change_forecast_id;
	}
	@JsonProperty("change_forecast_id")
	public void setChange_forecast_id(Integer change_forecast_id) {
		this.change_forecast_id = change_forecast_id;
	}
	@JsonProperty("application_number")
	public Integer getApplication_number() {
		return application_number;
	}
	@JsonProperty("application_number")
	public void setApplication_number(Integer application_number) {
		this.application_number = application_number;
	}
	@JsonProperty("application_name")
	public String getApplication_name() {
		return application_name;
	}
	@JsonProperty("application_name")
	public void setApplication_name(String application_name) {
		this.application_name = application_name;
	}

	@JsonProperty("cmddb_id")
	private String cmddb_id;
	
	public String getCmddb_id() {
		return cmddb_id;
	}
	@JsonProperty("cmddb_id")
	public void setCmddb_id(String cmddb_id) {
		this.cmddb_id = cmddb_id;
	}
	@JsonProperty("operation_scope")
	public String getOperation_scope() {
		return operation_scope;
	}
	@JsonProperty("operation_scope")
	public void setOperation_scope(String operation_scope) {
		this.operation_scope = operation_scope;
	}
	@JsonProperty("maintenance_scope")
	public String getMaintenance_scope() {
		return maintenance_scope;
	}
	@JsonProperty("maintenance_scope")
	public void setMaintenance_scope(String maintenance_scope) {
		this.maintenance_scope = maintenance_scope;
	}
	@JsonProperty("valid_from")
	public String getValid_from() {
		return valid_from;
	}
	@JsonProperty("valid_from")
	public void setValid_from(String valid_from) {
		this.valid_from = valid_from;
	}
	@JsonProperty("valid_to")
	public String getValid_to() {
		return valid_to;
	}
	@JsonProperty("valid_to")
	public void setValid_to(String valid_to) {
		this.valid_to = valid_to;
	}
	@JsonProperty("price_band")
	public String getPrice_band() {
		return price_band;
	}
	@JsonProperty("price_band")
	public void setPrice_band(String price_band) {
		this.price_band = price_band;
	}
	@JsonProperty("service_level")
	public String getService_level() {
		return service_level;
	}
	@JsonProperty("service_level")
	public void setService_level(String service_level) {
		this.service_level = service_level;
	}
	@JsonProperty("lead_timezone")
	public String getLead_timezone() {
		return lead_timezone;
	}
	@JsonProperty("lead_timezone")
	public void setLead_timezone(String lead_timezone) {
		this.lead_timezone = lead_timezone;
	}
	@JsonProperty("timeZone_extendToSaturday")
	public String getTimeZone_extendToSaturday() {
		return timeZone_extendToSaturday;
	}
	@JsonProperty("timeZone_extendToSaturday")
	public void setTimeZone_extendToSaturday(String timeZone_extendToSaturday) {
		this.timeZone_extendToSaturday = timeZone_extendToSaturday;
	}
	@JsonProperty("public_holidayRegulation")
	public String getPublic_holidayRegulation() {
		return public_holidayRegulation;
	}
	@JsonProperty("public_holidayRegulation")
	public void setPublic_holidayRegulation(String public_holidayRegulation) {
		this.public_holidayRegulation = public_holidayRegulation;
	}
	@JsonProperty("extended_service_monFri")
	public String getExtended_service_monFri() {
		return extended_service_monFri;
	}
	@JsonProperty("extended_service_monFri")
	public void setExtended_service_monFri(String extended_service_monFri) {
		this.extended_service_monFri = extended_service_monFri;
	}
	@JsonProperty("extended_service_sat")
	public String getExtended_service_sat() {
		return extended_service_sat;
	}
	@JsonProperty("extended_service_sat")
	public void setExtended_service_sat(String extended_service_sat) {
		this.extended_service_sat = extended_service_sat;
	}
	@JsonProperty("extended_service_sun")
	public String getExtended_service_sun() {
		return extended_service_sun;
	}
	@JsonProperty("extended_service_sun")
	public void setExtended_service_sun(String extended_service_sun) {
		this.extended_service_sun = extended_service_sun;
	}
	@JsonProperty("operation_cluster")
	public String getOperation_cluster() {
		return operation_cluster;
	}
	@JsonProperty("operation_cluster")
	public void setOperation_cluster(String operation_cluster) {
		this.operation_cluster = operation_cluster;
	}
	@JsonProperty("sr_number")
	public String getSr_number() {
		return sr_number;
	}
	@JsonProperty("sr_number")
	public void setSr_number(String sr_number) {
		this.sr_number = sr_number;
	}
	@JsonProperty("operation_dept")
	public String getOperation_dept() {
		return operation_dept;
	}
	@JsonProperty("operation_dept")
	public void setOperation_dept(String operation_dept) {
		this.operation_dept = operation_dept;
	}
	@JsonProperty("operation_group")
	public String getOperation_group() {
		return operation_group;
	}
	@JsonProperty("operation_group")
	public void setOperation_group(String operation_group) {
		this.operation_group = operation_group;
	}
	@JsonProperty("operation_cost")
	public Integer getOperation_cost() {
		return operation_cost;
	}
	@JsonProperty("operation_cost")
	public void setOperation_cost(Integer operation_cost) {
		this.operation_cost = operation_cost;
	}
	@JsonProperty("maintenance_cluster")
	public String getMaintenance_cluster() {
		return maintenance_cluster;
	}
	@JsonProperty("maintenance_cluster")
	public void setMaintenance_cluster(String maintenance_cluster) {
		this.maintenance_cluster = maintenance_cluster;
	}
	@JsonProperty("maintenance_department")
	public String getMaintenance_department() {
		return maintenance_department;
	}
	@JsonProperty("maintenance_department")
	public void setMaintenance_department(String maintenance_department) {
		this.maintenance_department = maintenance_department;
	}
	@JsonProperty("maintenance_group")
	public String getMaintenance_group() {
		return maintenance_group;
	}
	@JsonProperty("maintenance_group")
	public void setMaintenance_group(String maintenance_group) {
		this.maintenance_group = maintenance_group;
	}
	@JsonProperty("maintenance_cost")
	public Integer getMaintenance_cost() {
		return maintenance_cost;
	}
	@JsonProperty("maintenance_cost")
	public void setMaintenance_cost(Integer maintenance_cost) {
		this.maintenance_cost = maintenance_cost;
	}
	@JsonProperty("source_code")
	public String getSource_code() {
		return source_code;
	}
	@JsonProperty("source_code")
	public void setSource_code(String source_code) {
		this.source_code = source_code;
	}
	@JsonProperty("privacy_policy")
	public String getPrivacy_policy() {
		return privacy_policy;
	}
	@JsonProperty("privacy_policy")
	public void setPrivacy_policy(String privacy_policy) {
		this.privacy_policy = privacy_policy;
	}
	@JsonProperty("dvp_data")
	public String getDvp_data() {
		return dvp_data;
	}
	@JsonProperty("dvp_data")
	public void setDvp_data(String dvp_data) {
		this.dvp_data = dvp_data;
	}
	@JsonProperty("onsite_operation")
	public String getOnsite_operation() {
		return onsite_operation;
	}
	@JsonProperty("onsite_operation")
	public void setOnsite_operation(String onsite_operation) {
		this.onsite_operation = onsite_operation;
	}
	@JsonProperty("onsite_maintenance")
	public String getOnsite_maintenance() {
		return onsite_maintenance;
	}
	@JsonProperty("onsite_maintenance")
	public void setOnsite_maintenance(String onsite_maintenance) {
		this.onsite_maintenance = onsite_maintenance;
	}


	@JsonProperty("business")
	public List<Business> getBusiness() {
		return business;
	}

	@JsonProperty("business")
	public void setBusiness(List<Business> business) {
		this.business = business;
	}

	@JsonProperty("kt_and_others")
	public List<KtAndOther> getKtAndOthers() {
		return ktAndOthers;
	}

	@JsonProperty("kt_and_others")
	public void setKtAndOthers(List<KtAndOther> ktAndOthers) {
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

}