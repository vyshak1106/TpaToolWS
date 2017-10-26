package com.bmw.tpa.common;

import java.io.IOException;

import javax.inject.Singleton;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@Singleton
public class ConverterJSON {

	private ObjectMapper mapper = new ObjectMapper();
	
	public <T> T  getResponseFromJSON(String json,Class<T> cls) {
		T obj = null;
		try {
			obj = mapper.readValue(json, cls);
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
