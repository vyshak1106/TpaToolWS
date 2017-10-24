package com.bmw.tpa.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.bmw.tpa.common.ConverterJSON;
import com.bmw.tpa.model.ContractForecast;

/**
 * @author niraj
 *
 */

public class AbstractDAO {

	
	
	//http://localhost:8282/tpatool/contract_forecast
	public static void main(String[] args) {

		try {

			URL url = new URL("http://localhost:8282/tpatool/contract_forecast");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;
			String out="";
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				out+=output;
				System.out.println(output);
			}
			
			ContractForecast con = ConverterJSON.jsonToPOJO(out);
			System.out.println(con);
			conn.disconnect();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
