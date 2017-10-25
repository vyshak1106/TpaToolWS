package com.bmw.tpa.dao;

import java.io.IOException;
import java.net.HttpURLConnection;

import javax.inject.Inject;

import org.apache.commons.io.IOUtils;

import com.bmw.tpa.common.ConverterJSON;
import com.bmw.tpa.model.ContractForecast;

/**
 * @author niraj
 *
 */

public class AbstractDAO {

	@Inject
	private RestHeartClient httpClient;
	private IOUtils ioUtils;
	
	
	
	
	public static void main(String[] args) {
		
		/*try {

			URL url = new URL("http://localhost:8081/tpa/contractForecast");
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
			
			ContractForecast con = ConverterJSON.jsonToPOJO(out,ContractForecast.class);
			System.out.println(con);
			conn.disconnect();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
*/
		RestHeartClient client = new RestHeartClient();
		HttpURLConnection conn = client.getConnectionFor("contractForecast");
		try {
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			ContractForecast con = ConverterJSON.jsonToPOJO(IOUtils.toString(conn.getInputStream()),ContractForecast.class);
			System.out.println(con);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
