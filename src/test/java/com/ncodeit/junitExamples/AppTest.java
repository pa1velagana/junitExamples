package com.ncodeit.junitExamples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
	
	@Test
	public void f1() {
		App myTestClass = new App();
		int result = myTestClass.doSomething("2", 5);
		assertEquals(5, result);
	}
	
	@Test
	public void f2() {
		App myTestClass = new App();
		int result = myTestClass.doSomething("4", 15);
		assertEquals(4, result);
	}


	}

