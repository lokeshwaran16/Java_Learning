package CodingQuestions.Strings;

public class RemoveSpacesFromString {
    public static void main(String[] args) {
        String name="L ok esh wa ra n";
        System.out.print(removeSpaces(name));
    }
    static String removeSpaces(String name){
        String rSName="";
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)!=' '){
                rSName=rSName+name.charAt(i);
            }
        }
        return rSName;
    }
}
