/**
 * 
 */
package com.bmw.tpa.dao.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

import com.bmw.tpa.common.ConverterJSON;
import com.bmw.tpa.dao.AbstractDAO;
import com.bmw.tpa.dao.ContractForecastDAO;
import com.bmw.tpa.model.ContractForecast;
import com.bmw.tpa.model.ContractForecastResponseWrapper;
import com.google.gson.Gson;

/**
 * @author niraj
 *
 */
public class ContractForecastDAOBean extends AbstractDAO implements ContractForecastDAO {

	@Inject
	private ConverterJSON jsonConverter;
	
	private static final Logger LOGGER = Logger.getLogger(ContractForecastDAOBean.class);
	
	public ContractForecast getContractForecast(String ObjectId) {
		ContractForecast contractForecast=null;
		try{
			HttpURLConnection conn = initConnection("contractForecastUpdate",ObjectId);
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			contractForecast= this.jsonConverter.getResponseFromJSON(IOUtils.toString(conn.getInputStream()),ContractForecast.class);
			closeConnection(conn);
			}
			catch(IOException e){
				LOGGER.warn("Unable to fect all ContractForecasts...",e);
			}
		return contractForecast;
	}

	@Override
	public void createContractForecast(ContractForecast cf) {
		HttpURLConnection conn = null;

		if(null!=cf.get_id()){
			ContractForecast contractForecastById=getContractForecast(cf.get_id().get$oid());
			contractForecastById.setValid_to(getYesterdayDateString());
			LOGGER.info("Stting yesterday's date"+getYesterdayDateString());
			updateContractForecastToInActive(contractForecastById);
			cf.set_id(null);
		}
		String json = new Gson().toJson(formateDateBeforeSave(cf));
		StringBuilder sb = new StringBuilder();
		LOGGER.info("ContractForecast json for Update"+json);
		
		try{
		conn = initConnection("contractForecast");
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/json");
		OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
	        out.write(json);// here i sent the parameter
	        out.close();
	        int HttpResult = conn.getResponseCode();
	        if (HttpResult == HttpURLConnection.HTTP_OK) {
	            BufferedReader br = new BufferedReader(new InputStreamReader(
	            		conn.getInputStream(), "utf-8"));
	            String line = null;
	            while ((line = br.readLine()) != null) {
	                sb.append(line + "\n");
	            }
	            br.close();
	            LOGGER.info("Response" + sb.toString());
	            
	        } else {
	        	LOGGER.info("Message "+conn.getResponseMessage());
	        }
		}
		catch(IOException e){
			LOGGER.warn("Unable to fect all ContractForecasts...",e);
		}
		finally{
			 if (conn != null)
				 conn.disconnect();
		}
		// TODO Auto-generated method stub
	
	}
	public ContractForecast formateDateBeforeSave(ContractForecast contractForecast){
		contractForecast.setValid_to(getSubString(contractForecast.getValid_to()));
		contractForecast.setValid_from(getSubString(contractForecast.getValid_from()));
		return contractForecast;
	}
	public String getSubString(String date){
		String subStringValue=date;
		return subStringValue.substring(0, 10);
	}
	

	public void updateContractForecastToInActive(ContractForecast cf) {
		HttpURLConnection conn = null;
		String json = new Gson().toJson(formateDateBeforeSave(cf));
		StringBuilder sb = new StringBuilder();
		LOGGER.info("ContractForecast json for put"+json);
		try{
		conn = initConnection("contractForecastUpdate",cf.get_id().get$oid());
		conn.setDoOutput(true);
		conn.setRequestMethod("PUT");
		conn.setRequestProperty("Content-Type", "application/json");
		OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
	        out.write(json);// here i sent the parameter
	        out.close();
	        int HttpResult = conn.getResponseCode();
	        if (HttpResult == HttpURLConnection.HTTP_OK) {
	            BufferedReader br = new BufferedReader(new InputStreamReader(
	            		conn.getInputStream(), "utf-8"));
	            String line = null;
	            while ((line = br.readLine()) != null) {
	                sb.append(line + "\n");
	            }
	            br.close();
	            LOGGER.info("Response" + sb.toString());
	            
	        } else {
	        	LOGGER.info("Message "+conn.getResponseMessage());
	        }
		}
		catch(IOException e){
			LOGGER.warn("Unable to fect all ContractForecasts...",e);
		}
		finally{
			 if (conn != null)
				 conn.disconnect();
		}
		// TODO Auto-generated method stub
		
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
	
	private Date yesterday() {
	    final Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE, -1);
	    return cal.getTime();
	}
	
	private String getYesterdayDateString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(yesterday());
}

	@Override
	public ContractForecast getContractForecast() {
		// TODO Auto-generated method stub
		return null;
	}

}
