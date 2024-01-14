package CodingQuestions.Strings;

public class RemoveBrackets {
    public static void main(String[] args) {
        String name="Lo(keshwar)an";
        System.out.println(removeBrackets(name));
    }
    static String removeBrackets(String name){
        String rName="";
        for (int i =0; i<name.length() ; i++) {
           if(name.charAt(i)!='(' && name.charAt(i)!=')'){
               rName=rName+name.charAt(i);
           }
        }
        return rName;
    }

}
