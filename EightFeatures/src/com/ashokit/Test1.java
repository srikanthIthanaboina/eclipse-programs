package com.ashokit;

public class Test1 {
	public static void main(String[] args) {
		myInterface1 myref = (String msg) -> System.out.print(msg);
		myref.greetingMsg("second functional interface");
	}
}
