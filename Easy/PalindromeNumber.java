// Given an integer x, return true if x is palindrome integer.

// An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

// get the second half of the integer in reverse, by the reverse integer method ( % & * 10 + pop) then compare the leftover integer with
// the one you reversed. have to make /10 case as well.

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
//         int reverse = 0;
//         int counter = x;
//         while (counter != 0) {
//             int pop = counter % 10;
//             counter /= 10;
//             reverse = reverse * 10 + pop;
//         }
        
//         return reverse == x;
        
        int reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        
        return reverse == x || reverse / 10 == x;
    }
}
