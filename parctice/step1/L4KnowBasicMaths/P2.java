package parctice.step1.L4KnowBasicMaths;

/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 */
public class P2 {
    public static void main(String[] args) {
//        reverse(321);
        System.out.println(reverse(-321));
    }
    private static int reverse(int x) {
        boolean isNegative = x<0 ? true : false;
        String reveseString ="";
        if(isNegative) x = x * -1;
        char[] charArray = (x + "").toCharArray();
        for (int i= charArray.length-1; i>=0; i--) {
            reveseString =  reveseString + charArray[i];
        }
        return isNegative? -1* Integer.parseInt(reveseString) : Integer.parseInt(reveseString);
    }
}
