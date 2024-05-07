package in.ashokit;

public class Example {

	public static  void m1() { 
		int i=1;
		if(i>=7) {
			 int[] a = new int[i];
			Example.m1();
			int j = 10*i;
			System.out.print(j+",");
			i++;
		}	
	}
	public static void main(String[] args) {
		Example.m1();
	}
	
}
