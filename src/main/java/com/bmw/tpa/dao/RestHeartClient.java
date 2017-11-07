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
	
	public HttpURLConnection getConnectionFor(String connectionName){
		return this.restEndPoints.get(connectionName).getConnection();
	}
	
	public RestHeartClient() {
		this.restEndPoints.put("contractForecast",new RestClient("http://localhost:8081/tpa/contractForecast"));
	}

	private class RestClient{
		private URL url;
		private HttpURLConnection connection;
		public RestClient(String url) {
			try {
				this.url = new URL(url);
				this.connection = (HttpURLConnection) this.url.openConnection();
			} catch (IOException e) {
				LOGGER.warn("Could not initialize... ", e);
			}
		}
		public HttpURLConnection getConnection() {
			return connection;
		}
	}
}
