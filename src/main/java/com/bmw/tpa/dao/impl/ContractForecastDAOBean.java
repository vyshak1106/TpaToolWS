/**
 * 
 */
package com.bmw.tpa.dao.impl;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

import com.bmw.tpa.common.ConverterJSON;
import com.bmw.tpa.dao.AbstractDAO;
import com.bmw.tpa.dao.ContractForecastDAO;
import com.bmw.tpa.model.ContractForecast;
import com.bmw.tpa.model.ContractForecastResponseWrapper;

/**
 * @author niraj
 *
 */
public class ContractForecastDAOBean extends AbstractDAO implements ContractForecastDAO {

	@Inject
	private ConverterJSON jsonConverter;
	
	private static final Logger LOGGER = Logger.getLogger(ContractForecastDAOBean.class);
	@Override
	public ContractForecast getContractForecast() {
		return null;
	}

	@Override
	public ContractForecast createContractForecast(ContractForecast cf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContractForecast updateContractForecast(ContractForecast cf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteContractForecast(ContractForecast cf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ContractForecast> getAllContractForecasts() {
		ContractForecastResponseWrapper con = null;
		try{
		HttpURLConnection conn = initConnection("contractForecast");
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		con = this.jsonConverter.getResponseFromJSON(IOUtils.toString(conn.getInputStream()),ContractForecastResponseWrapper.class);
		closeConnection(conn);
		}
		catch(IOException e){
			LOGGER.warn("Unable to fect all ContractForecasts...",e);
		}
		return con.getEmbedded();
	}

}
