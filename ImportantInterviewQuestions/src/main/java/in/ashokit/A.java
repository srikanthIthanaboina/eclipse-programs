package in.ashokit;

public class A {
	
	static int i = 0;
	
	
	void m1() throws ArrayIndexOutOfBoundsException {
		System.out.println("in m1 A");
		A.i=8;
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		A.i=1;
		
		System.out.println(i);
		A obj = new A();
		obj.i=2;
		System.out.println(i);
		obj.m1();
	}
}
