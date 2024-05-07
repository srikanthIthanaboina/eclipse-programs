package com.ashokit;

public class MyConnect implements DBConnect{
	public static void main(String[] args) {
		MyConnect mref = new MyConnect();
		mref.logInfo("--Action--");
		mref.logFatalError("--some thing quit wrong--");
		mref.logWarn("--don't put any thing dummy--");
	
	}

}
