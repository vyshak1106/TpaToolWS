package com.bmw.tpa.common;

import java.io.IOException;

import com.bmw.tpa.model.ContractForecast;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverterJSON {

	public static String pojoToJSON(Object obj) {

		ObjectMapper mapper = new ObjectMapper();
		String json = "";
		try {
			json = mapper.writeValueAsString(obj);
			System.out.println(json);

			// Use pretty print for printing the output
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj));

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return json;

	}

	public static ContractForecast jsonToPOJO(String json) {

		ObjectMapper mapper = new ObjectMapper();
		ContractForecast obj = null;
		try {
			obj = mapper.readValue(json, ContractForecast.class);

			System.out.println(obj);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;

	}

}
