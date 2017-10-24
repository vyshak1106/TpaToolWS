package com.bmw.tpa.model;

/**
 * @author niraj
 *
 */
public class ChangeRequest {

	private String id;
	
	private String cRId;
	
	private String cRDoc;
	
	private String cRCoc;
	
	private String cRDescription;
	
	private ContractForecast contractForecast;

	public ChangeRequest() {
		super();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ChangeRequest [id=" + id + ", cRId=" + cRId + ", cRDoc=" + cRDoc + ", cRCoc=" + cRCoc
				+ ", cRDescription=" + cRDescription + "]";
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
	 * @return the cRId
	 */
	public String getcRId() {
		return cRId;
	}

	/**
	 * @param cRId the cRId to set
	 */
	public void setcRId(String cRId) {
		this.cRId = cRId;
	}

	/**
	 * @return the cRDoc
	 */
	public String getcRDoc() {
		return cRDoc;
	}

	/**
	 * @param cRDoc the cRDoc to set
	 */
	public void setcRDoc(String cRDoc) {
		this.cRDoc = cRDoc;
	}

	/**
	 * @return the cRCoc
	 */
	public String getcRCoc() {
		return cRCoc;
	}

	/**
	 * @param cRCoc the cRCoc to set
	 */
	public void setcRCoc(String cRCoc) {
		this.cRCoc = cRCoc;
	}

	/**
	 * @return the cRDescription
	 */
	public String getcRDescription() {
		return cRDescription;
	}

	/**
	 * @param cRDescription the cRDescription to set
	 */
	public void setcRDescription(String cRDescription) {
		this.cRDescription = cRDescription;
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
