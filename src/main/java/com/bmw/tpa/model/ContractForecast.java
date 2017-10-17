package com.bmw.tpa.model;

import java.util.Date;

/**
 * @author niraj
 *
 */
public class ContractForecast {

	private String id;
	
	private String applicationNumber;
	
	private String applicationName;
	
	private String cmdbid;
	
	private String operationScope;
	
	private String maintenanceScope;
	
	private Date validFrom;
	
	private Date validTo;
	
	private String priceBand;
	
	private String serviceLevel;
	
	private String leadTimeZone;
	
	private String secondTimeZone;
	
	private String thirdTimeZone;
	
	private String timeZoneExtendtoSaturday;
	
	private String publicHolidayRegulation;
	
	private String extendedServiceMonFri;
	
	private String extendedServiceSat;
	
	private String extendedServiceSun;
	
	private String operationCluster;
	
	private String sRNummer;
	
	private String operationDept;
	
	private String operationGroup;
	
	private String operationCost;
	
	private String maintenanceCluster;
	
	private String maintenanceDepartment;
	
	private String maintenanceGroup;
	
	private String maintenanceCost;
	
	private String sourceCode;
	
	private String privacyPolicy;
	
	private String DVPData;
	
	private String onsiteOperation;
	
	private String onsiteMaintenance;
	


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
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
				+ privacyPolicy + ", DVPData=" + DVPData + ", onsiteOperation=" + onsiteOperation
				+ ", onsiteMaintenance=" + onsiteMaintenance + "]";
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the applicationNumber
	 */
	public String getApplicationNumber() {
		return applicationNumber;
	}

	/**
	 * @param applicationNumber the applicationNumber to set
	 */
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	/**
	 * @return the applicationName
	 */
	public String getApplicationName() {
		return applicationName;
	}

	/**
	 * @param applicationName the applicationName to set
	 */
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	/**
	 * @return the cmdbid
	 */
	public String getCmdbid() {
		return cmdbid;
	}

	/**
	 * @param cmdbid the cmdbid to set
	 */
	public void setCmdbid(String cmdbid) {
		this.cmdbid = cmdbid;
	}

	/**
	 * @return the operationScope
	 */
	public String getOperationScope() {
		return operationScope;
	}

	/**
	 * @param operationScope the operationScope to set
	 */
	public void setOperationScope(String operationScope) {
		this.operationScope = operationScope;
	}

	/**
	 * @return the maintenanceScope
	 */
	public String getMaintenanceScope() {
		return maintenanceScope;
	}

	/**
	 * @param maintenanceScope the maintenanceScope to set
	 */
	public void setMaintenanceScope(String maintenanceScope) {
		this.maintenanceScope = maintenanceScope;
	}

	/**
	 * @return the validFrom
	 */
	public Date getValidFrom() {
		return validFrom;
	}

	/**
	 * @param validFrom the validFrom to set
	 */
	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	/**
	 * @return the validTo
	 */
	public Date getValidTo() {
		return validTo;
	}

	/**
	 * @param validTo the validTo to set
	 */
	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	/**
	 * @return the priceBand
	 */
	public String getPriceBand() {
		return priceBand;
	}

	/**
	 * @param priceBand the priceBand to set
	 */
	public void setPriceBand(String priceBand) {
		this.priceBand = priceBand;
	}

	/**
	 * @return the serviceLevel
	 */
	public String getServiceLevel() {
		return serviceLevel;
	}

	/**
	 * @param serviceLevel the serviceLevel to set
	 */
	public void setServiceLevel(String serviceLevel) {
		this.serviceLevel = serviceLevel;
	}

	/**
	 * @return the leadTimeZone
	 */
	public String getLeadTimeZone() {
		return leadTimeZone;
	}

	/**
	 * @param leadTimeZone the leadTimeZone to set
	 */
	public void setLeadTimeZone(String leadTimeZone) {
		this.leadTimeZone = leadTimeZone;
	}

	/**
	 * @return the secondTimeZone
	 */
	public String getSecondTimeZone() {
		return secondTimeZone;
	}

	/**
	 * @param secondTimeZone the secondTimeZone to set
	 */
	public void setSecondTimeZone(String secondTimeZone) {
		this.secondTimeZone = secondTimeZone;
	}

	/**
	 * @return the thirdTimeZone
	 */
	public String getThirdTimeZone() {
		return thirdTimeZone;
	}

	/**
	 * @param thirdTimeZone the thirdTimeZone to set
	 */
	public void setThirdTimeZone(String thirdTimeZone) {
		this.thirdTimeZone = thirdTimeZone;
	}

	/**
	 * @return the timeZoneExtendtoSaturday
	 */
	public String getTimeZoneExtendtoSaturday() {
		return timeZoneExtendtoSaturday;
	}

	/**
	 * @param timeZoneExtendtoSaturday the timeZoneExtendtoSaturday to set
	 */
	public void setTimeZoneExtendtoSaturday(String timeZoneExtendtoSaturday) {
		this.timeZoneExtendtoSaturday = timeZoneExtendtoSaturday;
	}

	/**
	 * @return the publicHolidayRegulation
	 */
	public String getPublicHolidayRegulation() {
		return publicHolidayRegulation;
	}

	/**
	 * @param publicHolidayRegulation the publicHolidayRegulation to set
	 */
	public void setPublicHolidayRegulation(String publicHolidayRegulation) {
		this.publicHolidayRegulation = publicHolidayRegulation;
	}

	/**
	 * @return the extendedServiceMonFri
	 */
	public String getExtendedServiceMonFri() {
		return extendedServiceMonFri;
	}

	/**
	 * @param extendedServiceMonFri the extendedServiceMonFri to set
	 */
	public void setExtendedServiceMonFri(String extendedServiceMonFri) {
		this.extendedServiceMonFri = extendedServiceMonFri;
	}

	/**
	 * @return the extendedServiceSat
	 */
	public String getExtendedServiceSat() {
		return extendedServiceSat;
	}

	/**
	 * @param extendedServiceSat the extendedServiceSat to set
	 */
	public void setExtendedServiceSat(String extendedServiceSat) {
		this.extendedServiceSat = extendedServiceSat;
	}

	/**
	 * @return the extendedServiceSun
	 */
	public String getExtendedServiceSun() {
		return extendedServiceSun;
	}

	/**
	 * @param extendedServiceSun the extendedServiceSun to set
	 */
	public void setExtendedServiceSun(String extendedServiceSun) {
		this.extendedServiceSun = extendedServiceSun;
	}

	/**
	 * @return the operationCluster
	 */
	public String getOperationCluster() {
		return operationCluster;
	}

	/**
	 * @param operationCluster the operationCluster to set
	 */
	public void setOperationCluster(String operationCluster) {
		this.operationCluster = operationCluster;
	}

	/**
	 * @return the sRNummer
	 */
	public String getsRNummer() {
		return sRNummer;
	}

	/**
	 * @param sRNummer the sRNummer to set
	 */
	public void setsRNummer(String sRNummer) {
		this.sRNummer = sRNummer;
	}

	/**
	 * @return the operationDept
	 */
	public String getOperationDept() {
		return operationDept;
	}

	/**
	 * @param operationDept the operationDept to set
	 */
	public void setOperationDept(String operationDept) {
		this.operationDept = operationDept;
	}

	/**
	 * @return the operationGroup
	 */
	public String getOperationGroup() {
		return operationGroup;
	}

	/**
	 * @param operationGroup the operationGroup to set
	 */
	public void setOperationGroup(String operationGroup) {
		this.operationGroup = operationGroup;
	}

	/**
	 * @return the operationCost
	 */
	public String getOperationCost() {
		return operationCost;
	}

	/**
	 * @param operationCost the operationCost to set
	 */
	public void setOperationCost(String operationCost) {
		this.operationCost = operationCost;
	}

	/**
	 * @return the maintenanceCluster
	 */
	public String getMaintenanceCluster() {
		return maintenanceCluster;
	}

	/**
	 * @param maintenanceCluster the maintenanceCluster to set
	 */
	public void setMaintenanceCluster(String maintenanceCluster) {
		this.maintenanceCluster = maintenanceCluster;
	}

	/**
	 * @return the maintenanceDepartment
	 */
	public String getMaintenanceDepartment() {
		return maintenanceDepartment;
	}

	/**
	 * @param maintenanceDepartment the maintenanceDepartment to set
	 */
	public void setMaintenanceDepartment(String maintenanceDepartment) {
		this.maintenanceDepartment = maintenanceDepartment;
	}

	/**
	 * @return the maintenanceGroup
	 */
	public String getMaintenanceGroup() {
		return maintenanceGroup;
	}

	/**
	 * @param maintenanceGroup the maintenanceGroup to set
	 */
	public void setMaintenanceGroup(String maintenanceGroup) {
		this.maintenanceGroup = maintenanceGroup;
	}

	/**
	 * @return the maintenanceCost
	 */
	public String getMaintenanceCost() {
		return maintenanceCost;
	}

	/**
	 * @param maintenanceCost the maintenanceCost to set
	 */
	public void setMaintenanceCost(String maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}

	/**
	 * @return the sourceCode
	 */
	public String getSourceCode() {
		return sourceCode;
	}

	/**
	 * @param sourceCode the sourceCode to set
	 */
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	/**
	 * @return the privacyPolicy
	 */
	public String getPrivacyPolicy() {
		return privacyPolicy;
	}

	/**
	 * @param privacyPolicy the privacyPolicy to set
	 */
	public void setPrivacyPolicy(String privacyPolicy) {
		this.privacyPolicy = privacyPolicy;
	}

	/**
	 * @return the dVPData
	 */
	public String getDVPData() {
		return DVPData;
	}

	/**
	 * @param dVPData the dVPData to set
	 */
	public void setDVPData(String dVPData) {
		DVPData = dVPData;
	}

	/**
	 * @return the onsiteOperation
	 */
	public String getOnsiteOperation() {
		return onsiteOperation;
	}

	/**
	 * @param onsiteOperation the onsiteOperation to set
	 */
	public void setOnsiteOperation(String onsiteOperation) {
		this.onsiteOperation = onsiteOperation;
	}

	/**
	 * @return the onsiteMaintenance
	 */
	public String getOnsiteMaintenance() {
		return onsiteMaintenance;
	}

	/**
	 * @param onsiteMaintenance the onsiteMaintenance to set
	 */
	public void setOnsiteMaintenance(String onsiteMaintenance) {
		this.onsiteMaintenance = onsiteMaintenance;
	}
	
}
