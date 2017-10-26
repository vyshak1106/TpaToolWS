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
@JsonPropertyOrder({
    "_id",
    "applicationNumber",
    "applicationName",
    "cmdbid",
    "operationScope",
    "maintenanceScope",
    "validFrom",
    "validTo",
    "priceBand",
    "serviceLevel",
    "leadTimeZone",
    "secondTimeZone",
    "thirdTimeZone",
    "timeZoneExtendtoSaturday",
    "publicHolidayRegulation",
    "extendedServiceMonFri",
    "extendedServiceSat",
    "extendedServiceSun",
    "operationCluster",
    "sRNummer",
    "operationDept",
    "operationGroup",
    "operationCost",
    "maintenanceCluster",
    "maintenanceDepartment",
    "maintenanceGroup",
    "maintenanceCost",
    "sourceCode",
    "privacyPolicy",
    "DVPData",
    "onsiteOperation",
    "onsiteMaintenance"
})
public class ContractForecast {

    @JsonProperty("_id")
    private Id id;
    @JsonProperty("applicationNumber")
    private Integer applicationNumber;
    @JsonProperty("applicationName")
    private String applicationName;
    @JsonProperty("cmdbid")
    private String cmdbid;
    @JsonProperty("operationScope")
    private String operationScope;
    @JsonProperty("maintenanceScope")
    private String maintenanceScope;
    @JsonProperty("validFrom")
    private String validFrom;
    @JsonProperty("validTo")
    private String validTo;
    @JsonProperty("priceBand")
    private String priceBand;
    @JsonProperty("serviceLevel")
    private String serviceLevel;
    @JsonProperty("leadTimeZone")
    private String leadTimeZone;
    @JsonProperty("secondTimeZone")
    private String secondTimeZone;
    @JsonProperty("thirdTimeZone")
    private String thirdTimeZone;
    @JsonProperty("timeZoneExtendtoSaturday")
    private String timeZoneExtendtoSaturday;
    @JsonProperty("publicHolidayRegulation")
    private String publicHolidayRegulation;
    @JsonProperty("extendedServiceMonFri")
    private String extendedServiceMonFri;
    @JsonProperty("extendedServiceSat")
    private String extendedServiceSat;
    @JsonProperty("extendedServiceSun")
    private String extendedServiceSun;
    @JsonProperty("operationCluster")
    private String operationCluster;
    @JsonProperty("sRNummer")
    private String sRNummer;
    @JsonProperty("operationDept")
    private String operationDept;
    @JsonProperty("operationGroup")
    private String operationGroup;
    @JsonProperty("operationCost")
    private Integer operationCost;
    @JsonProperty("maintenanceCluster")
    private String maintenanceCluster;
    @JsonProperty("maintenanceDepartment")
    private String maintenanceDepartment;
    @JsonProperty("maintenanceGroup")
    private String maintenanceGroup;
    @JsonProperty("maintenanceCost")
    private Integer maintenanceCost;
    @JsonProperty("sourceCode")
    private String sourceCode;
    @JsonProperty("privacyPolicy")
    private String privacyPolicy;
    @JsonProperty("DVPData")
    private String dVPData;
    @JsonProperty("onsiteOperation")
    private String onsiteOperation;
    @JsonProperty("onsiteMaintenance")
    private String onsiteMaintenance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContractForecast() {
    }

    /**
     * 
     * @param privacyPolicy
     * @param sourceCode
     * @param extendedServiceSun
     * @param priceBand
     * @param serviceLevel
     * @param operationGroup
     * @param maintenanceCluster
     * @param maintenanceGroup
     * @param validTo
     * @param maintenanceScope
     * @param id
     * @param secondTimeZone
     * @param timeZoneExtendtoSaturday
     * @param applicationNumber
     * @param extendedServiceSat
     * @param operationScope
     * @param maintenanceDepartment
     * @param onsiteOperation
     * @param leadTimeZone
     * @param operationCost
     * @param thirdTimeZone
     * @param applicationName
     * @param extendedServiceMonFri
     * @param sRNummer
     * @param maintenanceCost
     * @param publicHolidayRegulation
     * @param cmdbid
     * @param validFrom
     * @param dVPData
     * @param onsiteMaintenance
     * @param operationDept
     * @param operationCluster
     */
    public ContractForecast(Id id, Integer applicationNumber, String applicationName, String cmdbid, String operationScope, String maintenanceScope, String validFrom, String validTo, String priceBand, String serviceLevel, String leadTimeZone, String secondTimeZone, String thirdTimeZone, String timeZoneExtendtoSaturday, String publicHolidayRegulation, String extendedServiceMonFri, String extendedServiceSat, String extendedServiceSun, String operationCluster, String sRNummer, String operationDept, String operationGroup, Integer operationCost, String maintenanceCluster, String maintenanceDepartment, String maintenanceGroup, Integer maintenanceCost, String sourceCode, String privacyPolicy, String dVPData, String onsiteOperation, String onsiteMaintenance) {
        this.id = id;
        this.applicationNumber = applicationNumber;
        this.applicationName = applicationName;
        this.cmdbid = cmdbid;
        this.operationScope = operationScope;
        this.maintenanceScope = maintenanceScope;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.priceBand = priceBand;
        this.serviceLevel = serviceLevel;
        this.leadTimeZone = leadTimeZone;
        this.secondTimeZone = secondTimeZone;
        this.thirdTimeZone = thirdTimeZone;
        this.timeZoneExtendtoSaturday = timeZoneExtendtoSaturday;
        this.publicHolidayRegulation = publicHolidayRegulation;
        this.extendedServiceMonFri = extendedServiceMonFri;
        this.extendedServiceSat = extendedServiceSat;
        this.extendedServiceSun = extendedServiceSun;
        this.operationCluster = operationCluster;
        this.sRNummer = sRNummer;
        this.operationDept = operationDept;
        this.operationGroup = operationGroup;
        this.operationCost = operationCost;
        this.maintenanceCluster = maintenanceCluster;
        this.maintenanceDepartment = maintenanceDepartment;
        this.maintenanceGroup = maintenanceGroup;
        this.maintenanceCost = maintenanceCost;
        this.sourceCode = sourceCode;
        this.privacyPolicy = privacyPolicy;
        this.dVPData = dVPData;
        this.onsiteOperation = onsiteOperation;
        this.onsiteMaintenance = onsiteMaintenance;
    }

    @JsonProperty("_id")
    public Id getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(Id id) {
        this.id = id;
    }

    @JsonProperty("applicationNumber")
    public Integer getApplicationNumber() {
        return applicationNumber;
    }

    @JsonProperty("applicationNumber")
    public void setApplicationNumber(Integer applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    @JsonProperty("applicationName")
    public String getApplicationName() {
        return applicationName;
    }

    @JsonProperty("applicationName")
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    @JsonProperty("cmdbid")
    public String getCmdbid() {
        return cmdbid;
    }

    @JsonProperty("cmdbid")
    public void setCmdbid(String cmdbid) {
        this.cmdbid = cmdbid;
    }

    @JsonProperty("operationScope")
    public String getOperationScope() {
        return operationScope;
    }

    @JsonProperty("operationScope")
    public void setOperationScope(String operationScope) {
        this.operationScope = operationScope;
    }

    @JsonProperty("maintenanceScope")
    public String getMaintenanceScope() {
        return maintenanceScope;
    }

    @JsonProperty("maintenanceScope")
    public void setMaintenanceScope(String maintenanceScope) {
        this.maintenanceScope = maintenanceScope;
    }

    @JsonProperty("validFrom")
    public String getValidFrom() {
        return validFrom;
    }

    @JsonProperty("validFrom")
    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    @JsonProperty("validTo")
    public String getValidTo() {
        return validTo;
    }

    @JsonProperty("validTo")
    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    @JsonProperty("priceBand")
    public String getPriceBand() {
        return priceBand;
    }

    @JsonProperty("priceBand")
    public void setPriceBand(String priceBand) {
        this.priceBand = priceBand;
    }

    @JsonProperty("serviceLevel")
    public String getServiceLevel() {
        return serviceLevel;
    }

    @JsonProperty("serviceLevel")
    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    @JsonProperty("leadTimeZone")
    public String getLeadTimeZone() {
        return leadTimeZone;
    }

    @JsonProperty("leadTimeZone")
    public void setLeadTimeZone(String leadTimeZone) {
        this.leadTimeZone = leadTimeZone;
    }

    @JsonProperty("secondTimeZone")
    public String getSecondTimeZone() {
        return secondTimeZone;
    }

    @JsonProperty("secondTimeZone")
    public void setSecondTimeZone(String secondTimeZone) {
        this.secondTimeZone = secondTimeZone;
    }

    @JsonProperty("thirdTimeZone")
    public String getThirdTimeZone() {
        return thirdTimeZone;
    }

    @JsonProperty("thirdTimeZone")
    public void setThirdTimeZone(String thirdTimeZone) {
        this.thirdTimeZone = thirdTimeZone;
    }

    @JsonProperty("timeZoneExtendtoSaturday")
    public String getTimeZoneExtendtoSaturday() {
        return timeZoneExtendtoSaturday;
    }

    @JsonProperty("timeZoneExtendtoSaturday")
    public void setTimeZoneExtendtoSaturday(String timeZoneExtendtoSaturday) {
        this.timeZoneExtendtoSaturday = timeZoneExtendtoSaturday;
    }

    @JsonProperty("publicHolidayRegulation")
    public String getPublicHolidayRegulation() {
        return publicHolidayRegulation;
    }

    @JsonProperty("publicHolidayRegulation")
    public void setPublicHolidayRegulation(String publicHolidayRegulation) {
        this.publicHolidayRegulation = publicHolidayRegulation;
    }

    @JsonProperty("extendedServiceMonFri")
    public String getExtendedServiceMonFri() {
        return extendedServiceMonFri;
    }

    @JsonProperty("extendedServiceMonFri")
    public void setExtendedServiceMonFri(String extendedServiceMonFri) {
        this.extendedServiceMonFri = extendedServiceMonFri;
    }

    @JsonProperty("extendedServiceSat")
    public String getExtendedServiceSat() {
        return extendedServiceSat;
    }

    @JsonProperty("extendedServiceSat")
    public void setExtendedServiceSat(String extendedServiceSat) {
        this.extendedServiceSat = extendedServiceSat;
    }

    @JsonProperty("extendedServiceSun")
    public String getExtendedServiceSun() {
        return extendedServiceSun;
    }

    @JsonProperty("extendedServiceSun")
    public void setExtendedServiceSun(String extendedServiceSun) {
        this.extendedServiceSun = extendedServiceSun;
    }

    @JsonProperty("operationCluster")
    public String getOperationCluster() {
        return operationCluster;
    }

    @JsonProperty("operationCluster")
    public void setOperationCluster(String operationCluster) {
        this.operationCluster = operationCluster;
    }

    @JsonProperty("sRNummer")
    public String getSRNummer() {
        return sRNummer;
    }

    @JsonProperty("sRNummer")
    public void setSRNummer(String sRNummer) {
        this.sRNummer = sRNummer;
    }

    @JsonProperty("operationDept")
    public String getOperationDept() {
        return operationDept;
    }

    @JsonProperty("operationDept")
    public void setOperationDept(String operationDept) {
        this.operationDept = operationDept;
    }

    @JsonProperty("operationGroup")
    public String getOperationGroup() {
        return operationGroup;
    }

    @JsonProperty("operationGroup")
    public void setOperationGroup(String operationGroup) {
        this.operationGroup = operationGroup;
    }

    @JsonProperty("operationCost")
    public Integer getOperationCost() {
        return operationCost;
    }

    @JsonProperty("operationCost")
    public void setOperationCost(Integer operationCost) {
        this.operationCost = operationCost;
    }

    @JsonProperty("maintenanceCluster")
    public String getMaintenanceCluster() {
        return maintenanceCluster;
    }

    @JsonProperty("maintenanceCluster")
    public void setMaintenanceCluster(String maintenanceCluster) {
        this.maintenanceCluster = maintenanceCluster;
    }

    @JsonProperty("maintenanceDepartment")
    public String getMaintenanceDepartment() {
        return maintenanceDepartment;
    }

    @JsonProperty("maintenanceDepartment")
    public void setMaintenanceDepartment(String maintenanceDepartment) {
        this.maintenanceDepartment = maintenanceDepartment;
    }

    @JsonProperty("maintenanceGroup")
    public String getMaintenanceGroup() {
        return maintenanceGroup;
    }

    @JsonProperty("maintenanceGroup")
    public void setMaintenanceGroup(String maintenanceGroup) {
        this.maintenanceGroup = maintenanceGroup;
    }

    @JsonProperty("maintenanceCost")
    public Integer getMaintenanceCost() {
        return maintenanceCost;
    }

    @JsonProperty("maintenanceCost")
    public void setMaintenanceCost(Integer maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    @JsonProperty("sourceCode")
    public String getSourceCode() {
        return sourceCode;
    }

    @JsonProperty("sourceCode")
    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    @JsonProperty("privacyPolicy")
    public String getPrivacyPolicy() {
        return privacyPolicy;
    }

    @JsonProperty("privacyPolicy")
    public void setPrivacyPolicy(String privacyPolicy) {
        this.privacyPolicy = privacyPolicy;
    }

    @JsonProperty("DVPData")
    public String getDVPData() {
        return dVPData;
    }

    @JsonProperty("DVPData")
    public void setDVPData(String dVPData) {
        this.dVPData = dVPData;
    }

    @JsonProperty("onsiteOperation")
    public String getOnsiteOperation() {
        return onsiteOperation;
    }

    @JsonProperty("onsiteOperation")
    public void setOnsiteOperation(String onsiteOperation) {
        this.onsiteOperation = onsiteOperation;
    }

    @JsonProperty("onsiteMaintenance")
    public String getOnsiteMaintenance() {
        return onsiteMaintenance;
    }

    @JsonProperty("onsiteMaintenance")
    public void setOnsiteMaintenance(String onsiteMaintenance) {
        this.onsiteMaintenance = onsiteMaintenance;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    
    @Override
	public String toString() {
		return "ContractForecast [id=" + id + ", applicationNumber=" + applicationNumber + ", applicationName="
				+ applicationName + ", cmdbid=" + cmdbid + ", operationScope=" + operationScope + ", maintenanceScope="
				+ maintenanceScope + ", validFrom=" + validFrom + ", validTo=" + validTo + ", priceBand=" + priceBand
				+ ", serviceLevel=" + serviceLevel + ", leadTimeZone=" + leadTimeZone + ", secondTimeZone="
				+ secondTimeZone + ", thirdTimeZone=" + thirdTimeZone + ", timeZoneExtendtoSaturday="
				+ timeZoneExtendtoSaturday + ", publicHolidayRegulation=" + publicHolidayRegulation
				+ ", extendedServiceMonFri=" + extendedServiceMonFri + ", extendedServiceSat=" + extendedServiceSat
				+ ", extendedServiceSun=" + extendedServiceSun + ", operationCluster=" + operationCluster
				+ ", sRNummer=" + sRNummer + ", operationDept=" + operationDept + ", operationGroup=" + operationGroup
				+ ", operationCost=" + operationCost + ", maintenanceCluster=" + maintenanceCluster
				+ ", maintenanceDepartment=" + maintenanceDepartment + ", maintenanceGroup=" + maintenanceGroup
				+ ", maintenanceCost=" + maintenanceCost + ", sourceCode=" + sourceCode + ", privacyPolicy="
				+ privacyPolicy + ", dVPData=" + dVPData + ", onsiteOperation=" + onsiteOperation
				+ ", onsiteMaintenance=" + onsiteMaintenance + ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
        "$oid"
    })
    private class Id {

        @JsonProperty("$oid")
        private String $oid;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         * No args constructor for use in serialization
         * 
         */
        public Id() {
        }

        /**
         * 
         * @param $oid
         */
        public Id(String $oid) {
            this.$oid = $oid;
        }

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
