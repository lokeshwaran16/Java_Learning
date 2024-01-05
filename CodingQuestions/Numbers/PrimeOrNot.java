package CodingQuestions.Numbers;

import static java.lang.Math.sqrt;

public class PrimeOrNot {
    public static void main(String[] args) {
        int n=1;
        while(n<20) {
            System.out.println(isPrime(n));
            n++;
        }
    }
    static boolean isPrime(int n){
        for (int i = 2; i <= (int)sqrt(n); i++) {
        if(n%i==0) {
            return false;
        }
        }
        return true;
    }
}
