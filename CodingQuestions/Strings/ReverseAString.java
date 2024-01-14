package CodingQuestions.Strings;

public class ReverseAString {
    public static void main(String[] args) {
        String name="Lokeshwaran";
        System.out.println(reverseString(name));
    }
    static String reverseString(String name){
        String rName="";
        for (int i =name.length()-1; i >=0 ; i--) {
            rName=rName+name.charAt(i);
        }
        return rName;
    }
}
