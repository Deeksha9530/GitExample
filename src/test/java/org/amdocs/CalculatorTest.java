package org.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void addition() {
		CalculatorApplication calculator = new CalculatorApplication();
		double output= calculator.solve("5 6 +");
		double expected = 11;
		assertEquals(expected,output,0);
	}

}
