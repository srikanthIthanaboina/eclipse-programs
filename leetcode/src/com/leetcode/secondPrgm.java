package com.leetcode;

public class secondPrgm {
     static int[] L1 = {2,4,3};
     static int[] L2 = {5,6,4};
     public static void main(String[] args) {
    	 for(int i=L1.length;i>=0;i--) {
    		 int L3[] = new int[4];
    		 int j=0;
    		 if(i>0) {
    		 L3[j++] = L1[i-1];
    		 }
    		 int k=0;
    		 System.out.print(L3[k]);
    		 k++;
    	 }
     }
     
}
