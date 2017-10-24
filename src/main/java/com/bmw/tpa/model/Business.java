package com.bmw.tpa.model;

/**
 * @author niraj
 *
 */
public class Business {
	
	private String id;
	
	private String businessName;
	
	private String applicationName;
	
	private String ktandOthers;
	
	private ContractForecast contractForecast;

	public Business() {
		super();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Business [id=" + id + ", businessName=" + businessName + ", applicationName=" + applicationName
				+ ", ktandOthers=" + ktandOthers + "]";
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
	 * @return the businessName
	 */
	public String getBusinessName() {
		return businessName;
	}

	/**
	 * @param businessName the businessName to set
	 */
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
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
	 * @return the ktandOthers
	 */
	public String getKtandOthers() {
		return ktandOthers;
	}

	/**
	 * @param ktandOthers the ktandOthers to set
	 */
	public void setKtandOthers(String ktandOthers) {
		this.ktandOthers = ktandOthers;
	}

	/**
	 * @return the contractForecast
	 */
	public ContractForecast getContractForecast() {
		return contractForecast;
	}

	/**
	 * @param contractForecast the contractForecast to set
	 */
	public void setContractForecast(ContractForecast contractForecast) {
		this.contractForecast = contractForecast;
	}
	

}
