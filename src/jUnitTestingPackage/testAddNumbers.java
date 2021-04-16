package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunction junit = new jUnitFunction();
		int result = junit.addNumber(20, 40);
		assertEquals(60, result);
	}

}
