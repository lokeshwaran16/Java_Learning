package CodingQuestions.Numbers;

public class palindromeNumbersInRange {
    public static void main(String[] args) {
    int range=100;
    int i=1;
    while(i<=range){
        int num=i;
        String number=String.valueOf(num);
        int start=0;
        int end=number.length()-1;
        boolean pali=false;
        while(start<=end){
            if(number.charAt(start)==number.charAt(end)){
                pali=true;
            }else{
                pali=false;
                break;
            }
            start++;
            end--;
        }
        if(pali){
            System.out.println("Its an palindrome :"+number);
        }
        i++;
    }
    }
}