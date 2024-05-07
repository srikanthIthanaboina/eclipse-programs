package com.Exam;

public class HandleArithmeticException {
	
	public static void addMethod(int a,int b) {
		try {
			int div = a/b;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		HandleArithmeticException.addMethod(10,0);
	}

}
