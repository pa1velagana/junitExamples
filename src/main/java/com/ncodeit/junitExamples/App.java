package com.ncodeit.junitExamples;

public class App {
	public int doSomething(String param1, int param2) {
		if (param2 < 10) {
			return param2;
		} else {
			return Integer.parseInt(param1);
		}
	}
}