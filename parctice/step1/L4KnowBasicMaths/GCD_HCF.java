package parctice.step1.L4KnowBasicMaths;

import java.util.ArrayList;
import java.util.List;

/*
Given two integers a and b, Your task is to return a list containing their LCM and GCD.

Examples:

Input: a = 5 , b = 10
Output: [10, 5]
Explanation: LCM of 5 and 10 is 10, while their GCD is 5.
Input: a = 14 , b = 8
Output: [56, 2]
Explanation: LCM of 14 and 8 is 56, while their GCD is 2.
Input: a = 1 , b = 1
Output: [1, 1]
Explanation: LCM of 1 and 1 is 1, while their GCD is 1.
 */
public class GCD_HCF {
    public static void main(String[] args) {

//        int input1= 6;
//        int input2 = 18;
//        int input1= 5;
//        int input2 = 10;
        int input1= 14;
        int input2 = 8;

        //prime Numbers
        ArrayList<Integer> primeNumberLessThanFor1stInput = getPrimeNumberLessThan(input1);
        ArrayList<Integer> primeNumberLessThanFor2ndInput = getPrimeNumberLessThan(input2);

        // LCM of Numbers
        ArrayList<Integer> lcmOf1stNumber = lcmOfGivenNo(input1, primeNumberLessThanFor1stInput);
        ArrayList<Integer> lcmOf2ndNumber = lcmOfGivenNo(input2, primeNumberLessThanFor2ndInput);

        System.out.println(lcmOf1stNumber);
        System.out.println(lcmOf2ndNumber);
        System.out.println("GCD from Two Array List: "+gcdFromTwoArrayList(lcmOf1stNumber,lcmOf2ndNumber));
        System.out.println("LCM : "+lcmFromTwoMultipleArrayList(lcmOf1stNumber,lcmOf2ndNumber));

        int[] ints = {1, 2};
        int[] abcd= new int[]{2,3};
    }

    private static ArrayList<Integer> getPrimeNumberLessThan(int number) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        boolean isPrime;
        for (int i =2; i<=number; i++) {
            isPrime = true;
            for (int j=2; j <= i; j++) {
                if (i!=j && i%j==0) {
                    isPrime=false;
                }
            }
            if(isPrime) primeNumbers.add(i);
        }
        return primeNumbers;
    }
    private static ArrayList<Integer> lcmOfGivenNo(final int number, List<Integer> primeNumbers) {
        ArrayList<Integer> lcm = new ArrayList<>();
        primeNumbers.stream()
                .forEach(primeNumber -> {
                    int remander = 0;
                    int t = number;
                    while (remander == 0) {
                        remander = t % primeNumber;
                        if (remander == 0) {
                            lcm.add(primeNumber);
                            t = t / primeNumber;
                        }
                    }
                });
        return lcm;
    }
    private static int gcdFromTwoArrayList(ArrayList<Integer> al1,ArrayList<Integer> al2) {
        int gcd = 1;
        for (int i=al1.size()-1;i>=0; i--) {
            if(al2.contains(al1.get(i)))
            {
                gcd=al1.get(i);
                return gcd;
            }
        }
        return gcd;
    }

    private static int lcmFromTwoMultipleArrayList(ArrayList<Integer> al1, ArrayList<Integer> al2) {
        int lcm=1;
        for (int i=0; i<=al1.size()-1;i++) {
            if(al2.contains(al1.get(i))) {
                al2.remove(Integer.valueOf(al1.get(i)));
            }
            lcm=lcm*al1.get(i);
        }
        for (int i =0; i<=al2.size()-1; i++){
            lcm = lcm*al2.get(i);
        }
        return lcm;
    }
}
