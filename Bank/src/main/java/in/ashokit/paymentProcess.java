package in.ashokit;

public class paymentProcess {
	
	public boolean payment(String cardtype,double billamt) {
		if("creditCard".equals(cardtype)) {
			creditCardPayment ccp = new creditCardPayment();
			return ccp.payBill(billamt);
		}else if("debitCard".equals(cardtype)) {
			debitCard dc = new debitCard();
			return dc.payBill(billamt);
		}else if("zeta".equals(cardtype)) {
			zetaCard zc = new zetaCard();
			return zc.payBill(billamt);
		}else 
			return false;	
	}
}
