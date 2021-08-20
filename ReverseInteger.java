// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

class Solution {
    public int reverse(int x) {
        long ans = 0;
        while(x != 0) {
            int pop = x % 10;
            x /= 10;
            ans = ans * 10 + pop;
        }
        
        if (ans > Math.pow(-2,31) && ans < Math.pow(2,31)-1) {
            return (int) ans;
        }
        
        return 0;
    }
}
