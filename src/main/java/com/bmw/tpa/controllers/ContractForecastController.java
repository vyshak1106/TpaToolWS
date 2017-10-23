package com.bmw.tpa.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bmw.tpa.model.ContractForecast;
import com.bmw.tpa.service.interfaces.ContractForecastService;


/**
 * The Class ContractForecastController.
 *
 * @author niraj
 */
@Path("/contractForecast")
public class ContractForecastController {
	
	/** The ContractForecast service. */
	@Inject
	private ContractForecastService contractForecastService;
	
	/**
	 * Gets the ContractForecasts.
	 *
	 * @return the ContractForecasts
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/findall")
	public List<ContractForecast> getContractForecast(){
		List<ContractForecast> cfcList= new ArrayList<ContractForecast>();
		ContractForecast cf;
		cf = new ContractForecast();
		cf.setApplicationName("Medoc");
		cf.setApplicationNumber("M-203");
		cf.setCmdbid("23023");
		cf.setOperationScope("Global");
		cf.setMaintenanceScope("With IBM");
		cf.setValidFrom(new Date());
		cf.setValidTo(new Date());
		cf.setPriceBand("1 million");
		cfcList.add(cf);
		
		cf = new ContractForecast();
		cf.setApplicationName("DRP");
		cf.setApplicationNumber("M-204");
		cf.setCmdbid("24563");
		cf.setOperationScope("Global");
		cf.setMaintenanceScope("With IBM");
		cf.setValidFrom(new Date());
		cf.setValidTo(new Date());
		cf.setPriceBand("3 million");
		cfcList.add(cf);
		return cfcList;
		//return contractForecastService.getContractForecast();
	}
	
	/**
	 * Adds the new ContractForecast.
	 *
	 * @param ContractForecast the ContractForecast
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void addNewContractForecast(ContractForecast contractForecast){
		contractForecastService.createContractForecast(contractForecast);
	}
	
	/**
	 * Update ContractForecast.
	 *
	 * @param ContractForecast the ContractForecast
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateContractForecast(ContractForecast contractForecast){
		contractForecastService.updateContractForecast(contractForecast);
	}
	
	/**
	 * Delete ContractForecast.
	 *
	 * @param ContractForecast the ContractForecast
	 */
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteContractForecast(ContractForecast contractForecast){
		contractForecastService.deleteContractForecast(contractForecast);
	}
	
}
