package com.bmw.tpa.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

import com.bmw.tpa.exception.ErrorType;
import com.google.common.base.Strings;

/**
 * @author niraj
 *
 */
public class SettingHelper {
	
	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(SettingHelper.class.getName());
	
	static {
		Properties props = new Properties();

		String propertyFile = System.getProperty("tpa.properties");
		
		if (Strings.isNullOrEmpty(propertyFile)) {
			throw new RuntimeException(ErrorType.CONFIG_LOAD.getMessage());
		}
		
		try (InputStream inputStream = new FileInputStream(propertyFile)) {
			props.load(inputStream);
		} catch (IOException e) {
			LOGGER.severe(ErrorType.CONFIG_MISSING.getMessage()+" :"+e.getMessage());
			throw new RuntimeException(ErrorType.CONFIG_MISSING.getMessage());
		}
		
		for (Map.Entry<Object, Object> entry : props.entrySet()) {
			System.setProperty(entry.getKey().toString().trim(), entry.getValue().toString().trim());
		}
	}
	public static String getProperty(String key){
		return System.getProperty(key);
	}
}
