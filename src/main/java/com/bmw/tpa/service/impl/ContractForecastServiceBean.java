package com.bmw.tpa.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.bmw.tpa.dao.ContractForecastDAO;
import com.bmw.tpa.model.ContractForecast;
import com.bmw.tpa.service.ContractForecastService;

/**
 * @author niraj
 *
 */
public class ContractForecastServiceBean implements ContractForecastService {
	@Inject
	private ContractForecastDAO contractForecastDAO;

	public ContractForecast getContractForecast() {
		return contractForecastDAO.getContractForecast();
	}

	public void createContractForecast(ContractForecast cf) {
		contractForecastDAO.createContractForecast(cf);
	}

	public ContractForecast updateContractForecast(ContractForecast cf) {
		return contractForecastDAO.updateContractForecast(cf);
	}

	public void deleteContractForecast(ContractForecast cf) {
		contractForecastDAO.deleteContractForecast(cf);	
	}

	@Override
	public List<ContractForecast> getAllContractForecasts() {
		return this.contractForecastDAO.getAllContractForecasts();
	}

}
