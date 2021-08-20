// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String base = strs[0];
        int length = base.length();
        int end = 0;
        
        for (int i = 0; i < length; i++) {
            boolean b = false;
            for (String s : strs) {
                if (s.length() == i || s.charAt(i) != base.charAt(i)) {
                    b = true;
                    break;
                }
            }
            
            if (b) {
                break;
            }
            end++;
        }
        
        return base.substring(0, end);
    }
}
