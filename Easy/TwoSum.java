// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// put array values as hashmap key and then use hashmap to find the target - value

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int first = 0;
        // int second = 0;
        // for(int i = 0; i<nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             first = i;
        //             second = j;
        //             return new int[]{first, second};
        //         }
        //     }
        // }
        // return new int[]{first, second};
        
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            
            if (h.containsKey(remainder)) {
                return new int[]{h.get(remainder), i};
            } else {
                h.put(nums[i], i);
            }
        }
        
        return new int[]{};
    }
}
