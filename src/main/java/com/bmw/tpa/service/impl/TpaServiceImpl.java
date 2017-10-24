/**
 * 
 */
package com.bmw.tpa.service.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.bmw.tpa.model.Tpa;
import com.bmw.tpa.service.TpaService;

/**
 * The Class TpaServiceImpl.
 *
 * @author Swapnil Singh
 */
public class TpaServiceImpl implements TpaService {
	
	private static final Logger LOGGER = Logger.getLogger(TpaServiceImpl.class);


	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		LOGGER.info("Calling Message...");
		return "Hello World!!";
	}

	@Override
	public List<Tpa> getTpas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createTpa(Tpa tpa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTpa(Tpa tpa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTpa(Tpa tpa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMultipleTpas(List<Tpa> tpas) {
		// TODO Auto-generated method stub
		
	}
	
}
