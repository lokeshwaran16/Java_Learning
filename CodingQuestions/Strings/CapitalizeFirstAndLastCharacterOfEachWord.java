package CodingQuestions.Strings;
//Input: Geeks for geeks
//Output: GeekS FoR GeekS
public class CapitalizeFirstAndLastCharacterOfEachWord {
    public static void main(String[] args) {
        String sentence="Geeks for geeks";
        String ans=sentenceCapitalize(sentence);
        System.out.println(ans);
    }
    static String sentenceCapitalize(String sent){
        String newSentence="";
        String []str=sent.split(" ");
    for (int i = 0; i <str.length ; i++) {
        String word=str[i];
        if (i != str.length - 1) {
            String firstChar = word.substring(0, 1).toUpperCase();
            String resChar = word.substring(1, word.length() - 1);
            String lastChar = word.substring(word.length() - 1, word.length()).toUpperCase();
            newSentence = newSentence + firstChar + resChar + lastChar + " ";
        } else if (i == str.length - 1) {
            String firstChar = word.substring(0, 1).toUpperCase();
            String resChar = word.substring(1, word.length() - 1);
            String lastChar = word.substring(word.length() - 1, word.length()).toUpperCase();
            newSentence = newSentence + firstChar + resChar + lastChar;
        }
    }

        return newSentence;
    }
}
