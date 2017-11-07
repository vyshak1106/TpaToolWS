package com.bmw.tpa.service;

import java.util.List;

import com.bmw.tpa.model.ContractForecast;

/**
 * The Interface ContractForecastService.
 *
 * @author niraj
 */
public interface ContractForecastService {
	
	List<ContractForecast> getAllContractForecasts();
	
	public ContractForecast getContractForecast();
	
	public void createContractForecast(ContractForecast cf);
	
	public ContractForecast updateContractForecast(ContractForecast cf);
	
	public void deleteContractForecast(ContractForecast cf);
	
}
