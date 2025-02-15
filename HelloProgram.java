package com.dc.stream.test.app;

public class HelloProgram {
	
	public void hello(){
		System.out.println("Hello Pradip Shinde");
		System.out.println("Welcome to java 17");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to the main");
		HelloProgram hp = new HelloProgram();
		hp.hello();
	}
}
