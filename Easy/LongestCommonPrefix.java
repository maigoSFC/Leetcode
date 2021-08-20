// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

// use the first string in the array as the base, then use that to compare with the other strings in the array
// with the for each loop. Have to check if if the index is in the length or else out of bound, and if it's the same
// letter or not. if either case fails it will break out of the loop. End value should be the end of the prefix.

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
