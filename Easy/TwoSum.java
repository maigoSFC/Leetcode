// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// nested for loops that traverse thru the array finding the sum that is equal to the target.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int first = 0;
        int second = 0;
        for(int i = 0; i<nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    first = i;
                    second = j;
                    return new int[]{first, second};
                }
            }
        }
        return new int[]{first, second};
    }
}
