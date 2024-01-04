package CodingQuestions.Numbers;

public class Palindrome {
    public static void main(String[]args){
        int num=11021;
        String number=String.valueOf(num);
        System.out.println(number);
        int start=0;
        int end=number.length()-1;
        boolean pali=false;
        while(start<end){
            if(number.charAt(start)==number.charAt(end)){
                pali=true;
            }else{
                pali=false;
            }
            start++;
            end--;
        }
        if(pali){
            System.out.println("Its an palindrome :"+number);
        }else{
            System.out.println("Its not an palindrome :"+number);
        }
    }
}
