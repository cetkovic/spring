package com.codesessions.spring;

import org.springframework.util.Assert;

import junit.framework.Test;
import junit.framework.TestSuite;

public class ControllerTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(ControllerTests.class.getName());
		//$JUnit-BEGIN$

		//$JUnit-END$
		return suite;
	}
	
	@org.junit.Test
	public void test1(){
		Assert.isNull(null);
	}

}
