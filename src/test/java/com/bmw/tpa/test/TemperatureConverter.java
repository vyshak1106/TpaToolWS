/**
 * 
 */
package com.bmw.tpa.test;

/**
 * @author niraj
 *
 */
public class TemperatureConverter {

	public double convertToCelsius(double f) {
		return ((f - 32) * 5 / 9);
	}

	public double convertToFarenheit(double c) {
		return ((c * 9 / 5) + 32);
	}
	
	public String sayHello(String name) {
		return "Hello "+name;
	}

}
