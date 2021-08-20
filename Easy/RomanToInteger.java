// Convert Roman numbers to Integer format

// Defined what each roman numerical in the string is worth in integer value, store the values in an array. Check whether the following index 
// is larger, if so then subtract, otherwise add.
class Solution {
    public int romanToInt(String s) {
        // int counter = recursion(0, 0, s);
        // return counter;
        
        int a = s.length();
        int[] roman = new int[a];
        
        for (int i = 0; i < a; i++) {
            switch (s.charAt(i)) {
                case 'I' :
                    roman[i] = 1;
                    break;
                case 'V' :
                    roman[i] = 5;
                    break;
                case 'X' :
                    roman[i] = 10;
                    break;
                case 'L' :
                    roman[i] = 50;
                    break;
                case 'C' :
                    roman[i] = 100;
                    break;
                case 'D' :
                    roman[i] = 500;
                    break;
                case 'M' :
                    roman[i] = 1000;
                    break;
            }
        }
        
        int total = 0;
        int n = 0;
        while (n < s.length() - 1) {
            if (roman[n] < roman[n + 1]) {
                total -= roman[n];
            } else {
                total += roman[n];
            }
            n++;
        }
        
        return total + roman[s.length() - 1];
    }
    
//     public int recursion(int counter, int index, String s) {
//         if (index != s.length()) {
//             if(s.charAt(index) == 'M') {
//                 counter += 1000;
//                 index++;
//                 counter = recursion(counter, index, s);
//             } else if(s.charAt(index) == 'D') {
//                 counter += 500;
//                 index++;
//                 counter = recursion(counter, index, s);
//             } else if(s.charAt(index) == 'C') {
//                 if (index + 1 != s.length()) {
//                     if(s.charAt(index + 1) == 'D') {
//                         index++;
//                         counter += 400;
//                     } else if (s.charAt(index + 1) == 'M') {
//                         index++;
//                         counter += 900;
//                     } else {
//                         counter += 100;
//                     }
//                 } else {
//                     counter += 100;
//                 }

//                 index++;
//                 counter = recursion(counter, index, s);
//             } else if(s.charAt(index) == 'L') {
//                 counter += 50;
//                 index++;
//                 counter = recursion(counter, index, s);
//             } else if(s.charAt(index) == 'X') {
//                 if (index + 1 != s.length()) {
//                     if(s.charAt(index + 1) == 'L') {
//                         index++;
//                         counter += 40;
//                     } else if (s.charAt(index + 1) == 'C') {
//                         index++;
//                         counter += 90;
//                     } else {
//                         counter += 10;
//                     }
//                 } else {
//                     counter += 10;
//                 }
//                 index++;
//                 counter = recursion(counter, index, s);
//             } else if(s.charAt(index) == 'V') {
//                 counter += 5;
//                 index++;
//                 counter = recursion(counter, index, s);
//             } else if(s.charAt(index) == 'I') {
//                 if (index + 1 != s.length()) {
//                     if(s.charAt(index + 1) == 'V') {
//                         index++;
//                         counter += 4;
//                     } else if (s.charAt(index + 1) == 'X') {
//                         index++;
//                         counter += 9;
//                     } else {
//                         counter += 1;
//                     }
//                 } else {
//                     counter += 1;
//                 }
//                 index++;
//                 counter = recursion(counter, index, s);
//             }
//         }
//         return counter;    
//     }
}
