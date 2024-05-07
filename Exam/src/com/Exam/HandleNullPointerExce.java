package com.Exam;

public class HandleNullPointerExce {
	
	private static HandleNullPointerExce a = null;
	
	HandleNullPointerExce() {
		
	}
	public static HandleNullPointerExce getMethod() {
		if(a==null) {
			return new HandleNullPointerExce();
		}else {
			return null;
		}
	}
	private static void nullMethod(String a) {
		try {
			System.out.println(a.charAt(0));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		HandleNullPointerExce.nullMethod(null);
	}


}
