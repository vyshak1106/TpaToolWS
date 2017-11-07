/**
 * 
 */
package com.bmw.tpa.dao;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Singleton;

import org.apache.log4j.Logger;

/**
 * @author Swapnil Singh
 *
 */
@Singleton
public class RestHeartClient {
	private static final Logger LOGGER = Logger.getLogger(RestHeartClient.class);
	private Map<String,RestClient> restEndPoints = new HashMap<>();
	
	public URL getURLFor(String connectionName){
		return this.restEndPoints.get(connectionName).getUrl();
	}
	
	public RestHeartClient() {
		this.restEndPoints.put("contractForecast",new RestClient("http://localhost:8080/tpa/contractForecast"));
	}

	private class RestClient{
		private URL url;
		public RestClient(String url) {
			try {
				this.url = new URL(url);
			} catch (IOException e) {
				LOGGER.warn("Could not initialize... ", e);
			}
		}
		public URL getUrl() {
			return url;
		}
		
	}
}
