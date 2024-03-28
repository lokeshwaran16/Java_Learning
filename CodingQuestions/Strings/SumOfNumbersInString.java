package CodingQuestions.Strings;
//Input:  1abc23
//Output: 24
//Explanation: 1 + 23 = 24
public class SumOfNumbersInString {
    public static void main(String[] args) {
        String str="Lok10esh10wa10ra10n10";
        int ans=sumOfNumbers(str);
        System.out.println(ans);
    }
    static int sumOfNumbers(String str){
        int sum=0;
        StringBuilder value=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(Character.isDigit(ch)){
                value.append(ch);
            } else {
                if(value.length()>0){
                    sum=sum+Integer.parseInt(value.toString());
                    value.setLength(0);
                }
            }
        }
        if(value.length()>0){
            sum=sum+Integer.parseInt(value.toString());
            value.setLength(0);
        }
        return sum;
    }
}
