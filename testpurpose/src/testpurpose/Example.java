package testpurpose;


public class Example {

	public  int[] m1(int[]a,int i) { 
		
		if(i>7) {
			return a;
	
			}else {
				a[i-1]=10*i;
				i++;
				m1(a,i);
			}
			
		
		return a;
	}
	public static void main(String[] args) {
		Example example = new Example();
		int[] n=new int[7];
		int i=1;
		int[] m1 = example.m1(n,i);
   for(int m2:m1) {
	   
	 System.out.print(m2+",");
 }
	
	}
	
}

