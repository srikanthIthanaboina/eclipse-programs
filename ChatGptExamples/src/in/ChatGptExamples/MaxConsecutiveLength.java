package in.ChatGptExamples;

import java.util.Arrays;

public class MaxConsecutiveLength {
    public static void main(String[] args) {
        int[] nums = {1, 0, 3, 5, 2, 8, 7, 6};
        
        int maxLength = findMaxConsecutiveLength(nums);
        
        System.out.println("Maximum consecutive length: " + maxLength);
    }

    private static int findMaxConsecutiveLength(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxLength = 1;
        int left = 0;
        
        // Assume the array is sorted, if not, you may need to sort it first.
        Arrays.sort(nums);

        for (int right = 1; right < nums.length; right++) {
            if (nums[right] == nums[right - 1] + 1) {
                // If the current element is part of a consecutive sequence
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                // Start a new potential consecutive sequence
                left = right;
            }
        }

        return maxLength;
    }
}

