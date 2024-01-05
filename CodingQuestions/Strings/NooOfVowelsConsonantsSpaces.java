package CodingQuestions.Strings;

public class NooOfVowelsConsonantsSpaces {
    public static void main(String[] args) {
        String sentence="Words have weight. However, their weight lies not in their physicality";
        int place=0;
        int vowels=0;
        int space=0;
        int consonants=0;
        while(place<sentence.length()-1){
            if(sentence.charAt(place)>='a'&&sentence.charAt(place)<='z') {
                if (sentence.charAt(place) == 'a' || sentence.charAt(place) == 'e' || sentence.charAt(place) == 'i' || sentence.charAt(place) == 'o' || sentence.charAt(place) == 'u' || sentence.charAt(place) == 'A' || sentence.charAt(place) == 'E' || sentence.charAt(place) == 'E' || sentence.charAt(place) == 'I' || sentence.charAt(place) == 'O' || sentence.charAt(place) == 'U') {
                    vowels++;
                }else {
                    consonants++;
                }
            }else if (sentence.charAt(place) == ' ') {
                space++;
            }
            place++;
        }
        System.out.println("vowels     :"+vowels);
        System.out.println("space      :"+space);
        System.out.println("consonants :"+consonants);
    }
}
