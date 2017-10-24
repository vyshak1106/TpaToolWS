package com.bmw.tpa.service.impl;

import javax.ejb.Singleton;

import com.bmw.tpa.dao.ContractForecastDAO;
import com.bmw.tpa.model.ContractForecast;
import com.bmw.tpa.service.ContractForecastService;

/**
 * @author niraj
 *
 */
@Singleton
public class ContractForecastServiceBean implements ContractForecastService {
	
	private ContractForecastDAO contractForecastDAO;

	public ContractForecast getContractForecast() {
		return contractForecastDAO.getContractForecast();
	}

	public ContractForecast createContractForecast(ContractForecast cf) {
		return contractForecastDAO.createContractForecast(cf);
	}

	public ContractForecast updateContractForecast(ContractForecast cf) {
		return contractForecastDAO.updateContractForecast(cf);
	}

	public void deleteContractForecast(ContractForecast cf) {
		contractForecastDAO.deleteContractForecast(cf);	
	}

}
