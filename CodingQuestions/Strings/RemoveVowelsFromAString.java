package CodingQuestions.Strings;

public class RemoveVowelsFromAString {
    public static void main(String[] args) {
        String names = "Lokeshwaran DeepanKumar Nithish";
        String result=removeVowels(names);
        System.out.println(result);
//        int i = 0;
//        while (i < names.length()) {
//            if (names.charAt(i) != 'a' && names.charAt(i) != 'e' && names.charAt(i) != 'i' && names.charAt(i) != 'o' && names.charAt(i) != 'u' && names.charAt(i) != 'A' && names.charAt(i) != 'E'  && names.charAt(i) != 'I' && names.charAt(i) != 'O' && names.charAt(i) != 'U') {
//                System.out.print(names.charAt(i));
//            }
//            i++;
//        }
    }
    static String removeVowels(String names){
        return names.replaceAll("[aeiouAEIOU]","");
    }
}
