// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// using a set to determine whether there is already a duplicate or not

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!h.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
