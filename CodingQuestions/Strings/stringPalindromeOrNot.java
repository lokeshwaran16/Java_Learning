package CodingQuestions.Strings;

public class stringPalindromeOrNot {
    public static void main(String[] args) {
        String name="LokikoL";
        int start=0;
        int end=name.length()-1;
        boolean pali=false;
        while(start<end){
            if(name.charAt(start)==name.charAt(end)){
                pali=true;
            }else{
                pali=false;
                break;
            }
            start++;
            end--;
        }
        System.out.println(pali);
    }
}
