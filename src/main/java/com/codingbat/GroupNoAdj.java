package com.codingbat;

public class GroupNoAdj {

    public boolean groupNoAdj(int start, int[] nums, int target) {
        return target == 0 || start < nums.length &&
               (
                       groupNoAdj(start + 2, nums, target - nums[start]) ||
                       groupNoAdj(start + 1, nums, target)
               );
    }
}
