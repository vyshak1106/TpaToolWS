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
	private Integer changeForecastId;
	@JsonProperty("application_number")
	private Integer applicationNumber;
	@JsonProperty("application_name")
	private String applicationName;
	@JsonProperty("cmddb_id")
	private String cmddbId;
	@JsonProperty("operation_scope")
	private String operationScope;
	@JsonProperty("maintenance_scope")
	private String maintenanceScope;
	@JsonProperty("valid_from")
	private String validFrom;
	@JsonProperty("valid_to")
	private String validTo;
	@JsonProperty("price_band")
	private String priceBand;
	@JsonProperty("service_level")
	private String serviceLevel;
	@JsonProperty("lead_timezone")
	private String leadTimezone;
	@JsonProperty("timeZone_extendToSaturday")
	private String timeZoneExtendToSaturday;
	@JsonProperty("public_holidayRegulation")
	private String publicHolidayRegulation;
	@JsonProperty("extended_service_monFri")
	private String extendedServiceMonFri;
	@JsonProperty("extended_service_sat")
	private String extendedServiceSat;
	@JsonProperty("extended_service_sun")
	private String extendedServiceSun;
	@JsonProperty("operation_cluster")
	private String operationCluster;
	@JsonProperty("sr_number")
	private String srNumber;
	@JsonProperty("operation_dept")
	private String operationDept;
	@JsonProperty("operation_group")
	private String operationGroup;
	@JsonProperty("operation_cost")
	private Integer operationCost;
	@JsonProperty("maintenance_cluster")
	private String maintenanceCluster;
	@JsonProperty("maintenance_department")
	private String maintenanceDepartment;
	@JsonProperty("maintenance_group")
	private String maintenanceGroup;
	@JsonProperty("maintenance_cost")
	private Integer maintenanceCost;
	@JsonProperty("source_code")
	private String sourceCode;
	@JsonProperty("privacy_policy")
	private String privacyPolicy;
	@JsonProperty("dvp_data")
	private String dvpData;
	@JsonProperty("onsite_operation")
	private String onsiteOperation;
	@JsonProperty("onsite_maintenance")
	private String onsiteMaintenance;
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
	public Integer getChangeForecastId() {
		return changeForecastId;
	}

	@JsonProperty("change_forecast_id")
	public void setChangeForecastId(Integer changeForecastId) {
		this.changeForecastId = changeForecastId;
	}

	@JsonProperty("application_number")
	public Integer getApplicationNumber() {
		return applicationNumber;
	}

	@JsonProperty("application_number")
	public void setApplicationNumber(Integer applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	@JsonProperty("application_name")
	public String getApplicationName() {
		return applicationName;
	}

	@JsonProperty("application_name")
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	@JsonProperty("cmddb_id")
	public String getCmddbId() {
		return cmddbId;
	}

	@JsonProperty("cmddb_id")
	public void setCmddbId(String cmddbId) {
		this.cmddbId = cmddbId;
	}

	@JsonProperty("operation_scope")
	public String getOperationScope() {
		return operationScope;
	}

	@JsonProperty("operation_scope")
	public void setOperationScope(String operationScope) {
		this.operationScope = operationScope;
	}

	@JsonProperty("maintenance_scope")
	public String getMaintenanceScope() {
		return maintenanceScope;
	}

	@JsonProperty("maintenance_scope")
	public void setMaintenanceScope(String maintenanceScope) {
		this.maintenanceScope = maintenanceScope;
	}

	@JsonProperty("valid_from")
	public String getValidFrom() {
		return validFrom;
	}

	@JsonProperty("valid_from")
	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	@JsonProperty("valid_to")
	public String getValidTo() {
		return validTo;
	}

	@JsonProperty("valid_to")
	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}

	@JsonProperty("price_band")
	public String getPriceBand() {
		return priceBand;
	}

	@JsonProperty("price_band")
	public void setPriceBand(String priceBand) {
		this.priceBand = priceBand;
	}

	@JsonProperty("service_level")
	public String getServiceLevel() {
		return serviceLevel;
	}

	@JsonProperty("service_level")
	public void setServiceLevel(String serviceLevel) {
		this.serviceLevel = serviceLevel;
	}

	@JsonProperty("lead_timezone")
	public String getLeadTimezone() {
		return leadTimezone;
	}

	@JsonProperty("lead_timezone")
	public void setLeadTimezone(String leadTimezone) {
		this.leadTimezone = leadTimezone;
	}

	@JsonProperty("timeZone_extendToSaturday")
	public String getTimeZoneExtendToSaturday() {
		return timeZoneExtendToSaturday;
	}

	@JsonProperty("timeZone_extendToSaturday")
	public void setTimeZoneExtendToSaturday(String timeZoneExtendToSaturday) {
		this.timeZoneExtendToSaturday = timeZoneExtendToSaturday;
	}

	@JsonProperty("public_holidayRegulation")
	public String getPublicHolidayRegulation() {
		return publicHolidayRegulation;
	}

	@JsonProperty("public_holidayRegulation")
	public void setPublicHolidayRegulation(String publicHolidayRegulation) {
		this.publicHolidayRegulation = publicHolidayRegulation;
	}

	@JsonProperty("extended_service_monFri")
	public String getExtendedServiceMonFri() {
		return extendedServiceMonFri;
	}

	@JsonProperty("extended_service_monFri")
	public void setExtendedServiceMonFri(String extendedServiceMonFri) {
		this.extendedServiceMonFri = extendedServiceMonFri;
	}

	@JsonProperty("extended_service_sat")
	public String getExtendedServiceSat() {
		return extendedServiceSat;
	}

	@JsonProperty("extended_service_sat")
	public void setExtendedServiceSat(String extendedServiceSat) {
		this.extendedServiceSat = extendedServiceSat;
	}

	@JsonProperty("extended_service_sun")
	public String getExtendedServiceSun() {
		return extendedServiceSun;
	}

	@JsonProperty("extended_service_sun")
	public void setExtendedServiceSun(String extendedServiceSun) {
		this.extendedServiceSun = extendedServiceSun;
	}

	@JsonProperty("operation_cluster")
	public String getOperationCluster() {
		return operationCluster;
	}

	@JsonProperty("operation_cluster")
	public void setOperationCluster(String operationCluster) {
		this.operationCluster = operationCluster;
	}

	@JsonProperty("sr_number")
	public String getSrNumber() {
		return srNumber;
	}

	@JsonProperty("sr_number")
	public void setSrNumber(String srNumber) {
		this.srNumber = srNumber;
	}

	@JsonProperty("operation_dept")
	public String getOperationDept() {
		return operationDept;
	}

	@JsonProperty("operation_dept")
	public void setOperationDept(String operationDept) {
		this.operationDept = operationDept;
	}

	@JsonProperty("operation_group")
	public String getOperationGroup() {
		return operationGroup;
	}

	@JsonProperty("operation_group")
	public void setOperationGroup(String operationGroup) {
		this.operationGroup = operationGroup;
	}

	@JsonProperty("operation_cost")
	public Integer getOperationCost() {
		return operationCost;
	}

	@JsonProperty("operation_cost")
	public void setOperationCost(Integer operationCost) {
		this.operationCost = operationCost;
	}

	@JsonProperty("maintenance_cluster")
	public String getMaintenanceCluster() {
		return maintenanceCluster;
	}

	@JsonProperty("maintenance_cluster")
	public void setMaintenanceCluster(String maintenanceCluster) {
		this.maintenanceCluster = maintenanceCluster;
	}

	@JsonProperty("maintenance_department")
	public String getMaintenanceDepartment() {
		return maintenanceDepartment;
	}

	@JsonProperty("maintenance_department")
	public void setMaintenanceDepartment(String maintenanceDepartment) {
		this.maintenanceDepartment = maintenanceDepartment;
	}

	@JsonProperty("maintenance_group")
	public String getMaintenanceGroup() {
		return maintenanceGroup;
	}

	@JsonProperty("maintenance_group")
	public void setMaintenanceGroup(String maintenanceGroup) {
		this.maintenanceGroup = maintenanceGroup;
	}

	@JsonProperty("maintenance_cost")
	public Integer getMaintenanceCost() {
		return maintenanceCost;
	}

	@JsonProperty("maintenance_cost")
	public void setMaintenanceCost(Integer maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}

	@JsonProperty("source_code")
	public String getSourceCode() {
		return sourceCode;
	}

	@JsonProperty("source_code")
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	@JsonProperty("privacy_policy")
	public String getPrivacyPolicy() {
		return privacyPolicy;
	}

	@JsonProperty("privacy_policy")
	public void setPrivacyPolicy(String privacyPolicy) {
		this.privacyPolicy = privacyPolicy;
	}

	@JsonProperty("dvp_data")
	public String getDvpData() {
		return dvpData;
	}

	@JsonProperty("dvp_data")
	public void setDvpData(String dvpData) {
		this.dvpData = dvpData;
	}

	@JsonProperty("onsite_operation")
	public String getOnsiteOperation() {
		return onsiteOperation;
	}

	@JsonProperty("onsite_operation")
	public void setOnsiteOperation(String onsiteOperation) {
		this.onsiteOperation = onsiteOperation;
	}

	@JsonProperty("onsite_maintenance")
	public String getOnsiteMaintenance() {
		return onsiteMaintenance;
	}

	@JsonProperty("onsite_maintenance")
	public void setOnsiteMaintenance(String onsiteMaintenance) {
		this.onsiteMaintenance = onsiteMaintenance;
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