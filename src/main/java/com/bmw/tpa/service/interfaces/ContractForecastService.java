package com.bmw.tpa.service.interfaces;

import java.util.List;

import com.bmw.tpa.model.ContractForecast;

/**
 * The Interface ContractForecastService.
 *
 * @author niraj
 */
public interface ContractForecastService {
	
	public List<ContractForecast> getContractForecast();
	
	public void createContractForecast(ContractForecast cf);
	
	public void updateContractForecast(ContractForecast cf);
	
	public void deleteContractForecast(ContractForecast cf);
	
}
