package com.codingbat;

public class MaxSpan {

    public int maxSpan(int[] nums){
        if (nums.length > 0) {
            int maxSpan = 1;
            for (int i = 0; i < nums.length; i++)
                for (int j = nums.length - 1; j > i; j--)
                    if (nums[j] == nums[i]) {
                        int count = (j - i) + 1;
                        if (count > maxSpan) maxSpan = count;
                        break;
                    }
            return maxSpan;
        } else
            return 0;
    }
}
