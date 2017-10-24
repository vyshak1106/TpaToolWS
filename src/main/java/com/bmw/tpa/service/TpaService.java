/**
 * 
 */
package com.bmw.tpa.service;

import java.util.List;

import com.bmw.tpa.model.Tpa;

/**
 * The Interface TpaService.
 *
 * @author Swapnil Singh
 */
public interface TpaService {
	
	public String getMessage();
	
	/**
	 * Gets the tpas.
	 *
	 * @return the tpas
	 */
	public List<Tpa> getTpas();
	
	/**
	 * Creates the tpa.
	 *
	 * @param tpa the tpa
	 */
	public void createTpa(Tpa tpa);
	
	/**
	 * Update tpa.
	 *
	 * @param tpa the tpa
	 */
	public void updateTpa(Tpa tpa);
	
	/**
	 * Delete tpa.
	 *
	 * @param tpa the tpa
	 */
	public void deleteTpa(Tpa tpa);
	
	/**
	 * Delete multiple tpas.
	 *
	 * @param tpas the tpas
	 */
	public void deleteMultipleTpas(List<Tpa> tpas);
}
