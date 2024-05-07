package com.ashokit;

public class Test {
	public static void main(String[] args) {
		//mypredictor mp = new Addition();
//		mypredictor mp = new mypredictor() {
//			@Override
//			public void Calucalator(int a, int b) {
//				// TODO Auto-generated method stub	
//			}
//		};
		mypredictor mp = (int a,int b) -> System.out.println(a+b);
			mp.Calucalator(10,12);
	}

}
