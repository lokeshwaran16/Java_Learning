package CodingQuestions.Strings;

public class RemoveCharactersFromStringExceptAlphabets {
    public static void main(String[] args) {
        String name="L*&^OKES(*^^^HWARA(**%$$#^*N";
        System.out.print(removeSymbols(name));
    }
    static String removeSymbols(String name){
        String rSName="";
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)>='a' && name.charAt(i)<='z' || name.charAt(i)>='A' && name.charAt(i)<='Z'){
                rSName=rSName+name.charAt(i);
            }
        }
        return rSName;
    }
}
