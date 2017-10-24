/**
 * 
 */
package com.bmw.tpa.dao;

import com.bmw.tpa.model.ContractForecast;

/**
 * @author niraj
 *
 */
public interface ContractForecastDAO {

	ContractForecast getContractForecast();

	ContractForecast createContractForecast(ContractForecast cf);

	ContractForecast updateContractForecast(ContractForecast cf);

	void deleteContractForecast(ContractForecast cf);

}
