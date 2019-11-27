package com.mercadolibre.dojos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the dojo.
 */
public class DojoTest {

	@Before
	public void setup() {

	}

	@Test
	public void test_case_00() {
		Object o = new Object();

		// ... 
		// Code here!
		// ...
		Assert.assertEquals(1,1);
		Assert.assertSame(o,o);
	}

	@Test( expected = RuntimeException.class)
	public void test_case_01() {

		throw new RuntimeException();
	}
}
