package in.ashokit.main;

import in.ashokit.paymentProcess;

public class mainProgram{
	
	public static void main(String[] args){
	paymentProcess pp = new paymentProcess();
	boolean dopayment = pp.payment("creditCard",2838.44);
	if(dopayment) {
		System.out.println("payment succesfull");
	}else
		System.out.println("payment not succesfull");
	}
}
