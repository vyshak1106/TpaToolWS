package com.bmw.tpa.controllers;

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
import com.bmw.tpa.service.ContractForecastService;


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
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ContractForecast getContractForecast(){
		return contractForecastService.getContractForecast();
	}
	
	/**
	 * Adds the new ContractForecast.
	 *
	 * @param ContractForecast the ContractForecast
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ContractForecast addNewContractForecast(ContractForecast contractForecast){
		return contractForecastService.createContractForecast(contractForecast);
	}
	
	/**
	 * Update ContractForecast.
	 *
	 * @param ContractForecast the ContractForecast
	 */
	@PUT
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ContractForecast updateContractForecast(ContractForecast contractForecast){
		return contractForecastService.updateContractForecast(contractForecast);
	}
	
	/**
	 * Delete ContractForecast.
	 *
	 * @param ContractForecast the ContractForecast
	 */
	@DELETE
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteContractForecast(ContractForecast contractForecast){
		contractForecastService.deleteContractForecast(contractForecast);
	}
	
}
