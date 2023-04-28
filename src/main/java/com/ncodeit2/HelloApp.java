package com.ncodeit2;

public class HelloApp {

	private HelloService hello;
	
	public String getMessageFromHello(String msg) {
		return hello.getMessage(msg);
	}

	public void setHello(HelloService helloService) {
	     	this.hello= helloService;
	     	
		
	}
	
}