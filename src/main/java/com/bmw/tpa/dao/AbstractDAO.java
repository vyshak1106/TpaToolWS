package com.bmw.tpa.dao;

import java.io.IOException;
import java.net.HttpURLConnection;

import javax.inject.Inject;

/**
 * @author niraj
 *
 */

abstract public class AbstractDAO {
	
	@Inject
	private RestHeartClient httpClient;

	public HttpURLConnection initConnection(String type) throws IOException{
		return (HttpURLConnection) this.httpClient.getURLFor(type).openConnection();
	}
	
	public HttpURLConnection initConnection(String type,String Objectid) throws IOException{
		return (HttpURLConnection) this.httpClient.getURLFor(type,Objectid).openConnection();
	}
	
	
	public void closeConnection(HttpURLConnection conn) throws IOException{
		conn.getInputStream().close();
		conn.disconnect();
	}
	
	
	
	
	//public static void main(String[] args) {
		
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
		/*RestHeartClient client = new RestHeartClient();
		HttpURLConnection conn = client.getConnectionFor("contractForecast");
		try {
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			ContractForecastResponseWrapper con = jsonConverter.getResponseFromJSON(IOUtils.toString(conn.getInputStream()),ContractForecastResponseWrapper.class);
			//LOGGER.info(con.getEmbedded());
			
			for(ContractForecast contractForecast:con.getEmbedded()){
			LOGGER.info(contractForecast.getCmdbid());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	//}
	/*public static void main(String[] args) {
		 CloseableHttpAsyncClient client = HttpAsyncClients.createDefault();
		    client.start();
		    HttpGet request = new HttpGet("http://www.google.com");
		     
		    Future<HttpResponse> future = client.execute(request, null);
		    HttpResponse response = future.get();
		    assertThat(response.getStatusLine().getStatusCode(), equalTo(200));
		    client.close();
	}*/
}
