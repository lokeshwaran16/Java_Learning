package CodingQuestions.Strings;

import java.util.Scanner;
import java.util.ArrayList;

public class FrequencyOfCharactersInString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String sent=in.nextLine();
        String lowc=sent.toLowerCase();
        System.out.println(lowc);
        char []letter=lowc.toCharArray();
        ArrayList<Character> letters=new ArrayList<Character>();
        letters.add('1');

        for (int i = 0; i <= sent.length(); i++) {
            int count=0;
            boolean tf=true;
                    if(letters.contains(letter[i])){
                        tf=false;
                    }
                if(tf){
                    letters.add(letter[i]);
                    for (int j = 0; j < sent.length(); j++) {
                        if(sent.charAt(j)==sent.charAt(i)){
                            count++;
                        }
                    }
                    System.out.println(sent.charAt(i)+"-"+count);
                }
        }

    }
}
