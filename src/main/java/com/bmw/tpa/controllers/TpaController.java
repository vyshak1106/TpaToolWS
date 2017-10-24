/**
 * 
 */
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

import com.bmw.tpa.model.Tpa;
import com.bmw.tpa.service.TpaService;

/**
 * The Class TpaController.
 *
 * @author Swapnil Singh
 */
@Path("/tpas")
public class TpaController {
	
	/** The tpa service. */
	@Inject
	private TpaService tpaService;
	
	/**
	 * Gets the tpas.
	 *
	 * @return the tpas
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Tpa> getTpas(){
		return null;
	}
	
	/**
	 * Adds the new tpa.
	 *
	 * @param tpa the tpa
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void addNewTpa(Tpa tpa){
	}
	
	/**
	 * Update tpa.
	 *
	 * @param tpa the tpa
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateTpa(Tpa tpa){
		
	}
	
	/**
	 * Delete tpa.
	 *
	 * @param tpa the tpa
	 */
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteTpa(Tpa tpa){
		
	}
	
	/**
	 * Delete tpas.
	 *
	 * @param tpas the tpas
	 */
	/*@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteTpas(List<Tpa> tpas){
		
	}*/
	
	@GET
	@Path("/m")
	@Produces(MediaType.APPLICATION_JSON)
	public String getMessage(){
		return this.tpaService.getMessage();
	}
}
