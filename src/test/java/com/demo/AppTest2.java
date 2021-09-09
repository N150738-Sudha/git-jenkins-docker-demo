package com.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest2 {
	private App app;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		app = new App();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSum() {
		assertEquals(10, app.sum(5, 5));
	}
	
	@Test
	public void testSum1() {
		assertEquals(8, app.sum(5, 3));
	}

	@Test
	public void testSum2() {
		assertEquals(4, app.sum(1, 3));
	}
}
