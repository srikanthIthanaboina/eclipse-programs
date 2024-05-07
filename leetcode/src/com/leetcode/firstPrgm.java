package com.leetcode;
import java.util.HashMap;
import java.util.Map;
public class firstPrgm {
    static int[] nums = {3,3}; 
    public static int[] twosum(int[] nums,int target) {
    	int n=nums.length;
    	Map<Integer,Integer> map =new HashMap<>();
    	int[] result = new int[2];
    	for(int i=0;i<n;i++) {
    		if(map.containsKey(target-nums[i])) {
    			result[1]=i;
    			result[0]=map.get(target-nums[i]);
    			return result;
    		}
    		map.put(nums[i], i);
    	}
    	return result;
    }
    public static void main(String[] args) {
//    	for(int i=0;i<nums.length;i++) {
//    		if(i<nums.length-1) {
//    		if(nums[i]+nums[i+1]==6) {
//    			System.out.print("["+i+","+(i+1)+"]");
//    		}
    	 int target = 9;
    	    int[] a = {1,3,11,1,8};
    	    int[] b = firstPrgm.twosum(a,target);
    	    for(int i=0;i<b.length;i++) {
    	    System.out.print(b[i]);
    	    }
    		} 
    public static int[] twosum1(int[] num,int target) {
    	int n= num.length;
    	for(int i =0;i<n-1;i++) {
    		for(int j=i+1;j<n;j++) {
    			if(num[i]+num[j]==target) {
    				return new int[]{i,j};
    			}
    		}
    	}return new int[]{};    	
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
            	System.out.println(numMap.get(complement));
                return new int[]{i, numMap.get(complement)};
                
            }
        }
        System.out.println(numMap.get(0));

        return new int[]{}; // No solution found
    }
}
