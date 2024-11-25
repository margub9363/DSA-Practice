package parctice.step1.L4KnowBasicMaths;
/*
Input:153
Output: Yes
153 is an Armstrong number.
1*1*1 + 5*5*5 + 3*3*3 = 153


Input: 120
Output: No
120 is not a Armstrong number.
1*1*1 + 2*2*2 + 0*0*0 = 9


Input: 1253
Output: No
1253 is not a Armstrong Number
1*1*1*1 + 2*2*2*2 + 5*5*5*5 + 3*3*3*3 = 723


Input: 1634
Output: Yes
1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634
 */
public class ArmStrongNumber {
    public static void main(String[] args) {
//        int input=723;
        int input=1634;
        char[] charArray = (input + "").toCharArray();
        int sum=0;

        for (int i=0; i<charArray.length; i++){
//            sum = sum + Integer.parseInt(charArray[i]+"")*Integer.parseInt(charArray[i]+"")*Integer.parseInt(charArray[i]+"");
            sum += (int) Math.pow(Integer.parseInt(charArray[i]+""),charArray.length);
        }
        if(input == sum){
            System.out.println("Its an arm stromg Number");
        }
        else System.out.println("Not an armstrong Number");
    }
}
