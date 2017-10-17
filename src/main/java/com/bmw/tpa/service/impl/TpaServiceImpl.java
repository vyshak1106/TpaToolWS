/**
 * 
 */
package com.bmw.tpa.service.impl;

import java.util.List;

import javax.ejb.Startup;
import javax.ejb.Stateless;

import com.bmw.tpa.model.Tpa;
import com.bmw.tpa.service.interfaces.TpaService;

/**
 * The Class TpaServiceImpl.
 *
 * @author Swapnil Singh
 */
@Stateless
@Startup
public class TpaServiceImpl implements TpaService {

	/* (non-Javadoc)
	 * @see com.bmw.tpa.service.interfaces.TpaService#getTpas()
	 */
	public List<Tpa> getTpas() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bmw.tpa.service.interfaces.TpaService#createTpa(com.bmw.tpa.model.Tpa)
	 */
	public void createTpa(Tpa tpa) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.bmw.tpa.service.interfaces.TpaService#updateTpa(com.bmw.tpa.model.Tpa)
	 */
	public void updateTpa(Tpa tpa) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.bmw.tpa.service.interfaces.TpaService#deleteTpa(com.bmw.tpa.model.Tpa)
	 */
	public void deleteTpa(Tpa tpa) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.bmw.tpa.service.interfaces.TpaService#deleteMultipleTpas(java.util.List)
	 */
	public void deleteMultipleTpas(List<Tpa> tpas) {
		// TODO Auto-generated method stub
		
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello World!!";
	}
	
}
