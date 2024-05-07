package com.ashokit;

public interface DBConnect {
	default void logInfo(String msg) {
		logMessage(msg,"Info");
	}
	default void logWarn(String msg) {
		logMessage(msg,"warn");
	}
	default void logFatalError(String msg) {
		logMessage(msg,"error");
	}
	private void logMessage(String msg,String loglevel) {
		System.out.println(msg+"->"+loglevel);
	}
}
