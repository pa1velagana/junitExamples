package com.ncodeit2;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class HelloAppTest {
	private HelloApp helloApp;
	private HelloService helloService;
	
	@Before
	public void setUp() {
		helloService = mock(HelloService.class);
		helloApp = new HelloApp();
		helloApp.setHello(helloService);
	}
	
	@Test
	public void testGetMessageFromHello() {
		String expectedMsg = "Hello, World!";
		when(helloService.getMessage("Hello, World!")).thenReturn(expectedMsg);
		
		String actualMsg = helloApp.getMessageFromHello("Hello, World!");
		
		verify(helloService).getMessage("Hello, World!");
		assertEquals(expectedMsg, actualMsg);
	}
}
