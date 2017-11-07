/**
 * 
 */
package com.bmw.tpa.dao;

import java.util.List;

import com.bmw.tpa.model.ContractForecast;

/**
 * @author niraj
 *
 */
public interface ContractForecastDAO {
	
	List<ContractForecast> getAllContractForecasts();

	ContractForecast getContractForecast();

	void createContractForecast(ContractForecast cf);

	ContractForecast updateContractForecast(ContractForecast cf);

	void deleteContractForecast(ContractForecast cf);

}
