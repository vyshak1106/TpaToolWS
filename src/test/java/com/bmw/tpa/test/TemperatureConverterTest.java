/**
 * 
 */
package com.bmw.tpa.test;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author niraj
 *
 */
@RunWith(Arquillian.class)
public class TemperatureConverterTest {

	@Inject
	private TemperatureConverter converter;

	@Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
            .addClass(TemperatureConverter.class)
            .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

	@Test
	public void testConvertToCelsius() {
		Assert.assertEquals(converter.convertToCelsius(32d), 0d,0.001);
		Assert.assertEquals(converter.convertToCelsius(212d), 100d,0.001);
	}

	@Test
	public void testConvertToFarenheit() {
		Assert.assertEquals(32d,converter.convertToFarenheit(0d),0.001);
		Assert.assertEquals(212d,converter.convertToFarenheit(100d),0.001);
	}
	
	@Test
	public void Hi() {
		Assert.assertEquals(converter.sayHello("Niraj"), "Hello Niraj");
	}

}
