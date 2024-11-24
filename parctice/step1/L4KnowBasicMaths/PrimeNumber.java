package parctice.step1.L4KnowBasicMaths;

public class PrimeNumber {
    public static void main(String[] args) {
        getPrimeNumberLessThan(100);
    }
    private static int[] getPrimeNumberLessThan(int number) {
        int[] primeNumbers = new int[0];
        boolean isPrime;
        for (int i =2; i<=number; i++) {
            isPrime = true;
            for (int j=2; j <= i; j++) {
                if (i!=j && i%j==0) {
                    isPrime=false;
                }
            }
            if(isPrime) System.out.println(i);
        }
        return primeNumbers;
    }
}
