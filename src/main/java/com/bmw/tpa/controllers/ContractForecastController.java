package com.bmw.tpa.controllers;

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
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.bmw.tpa.model.ContractForecast;
import com.bmw.tpa.service.ContractForecastService;
import com.google.gson.Gson;


/**
 * The Class ContractForecastController.
 *
 * @author niraj
 */
@Path("/contractForecast")
public class ContractForecastController {
	
	private static final Logger LOGGER = Logger.getLogger(ContractForecastController.class);
	
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
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addNewContractForecast(ContractForecast contractForecast) {
		LOGGER.info("Inside addNewContractForecast");
		contractForecastService.createContractForecast(contractForecast);
		return Response.status(200).entity("SuccessFully Created").build();
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

			LOGGER.info(contractForecast);

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
	
	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ContractForecast> getAllContractForecasts(){
		LOGGER.info("Inside getAllContractForecasts ");
		List<ContractForecast> contractForecasts = contractForecastService.getAllContractForecasts();
		for(ContractForecast con:contractForecasts){
			LOGGER.info(con);
		}
		return contractForecasts;
	}


	
}
