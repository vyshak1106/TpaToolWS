package com.bmw.tpa.service;

import com.bmw.tpa.model.ContractForecast;

/**
 * The Interface ContractForecastService.
 *
 * @author niraj
 */
public interface ContractForecastService {
	
	public ContractForecast getContractForecast();
	
	public ContractForecast createContractForecast(ContractForecast cf);
	
	public ContractForecast updateContractForecast(ContractForecast cf);
	
	public void deleteContractForecast(ContractForecast cf);
	
}
