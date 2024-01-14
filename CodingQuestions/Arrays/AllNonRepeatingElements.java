package CodingQuestions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class AllNonRepeatingElements {
    public static void main(String[] args) {
        int[]arr={1,8,10,1,2,2,3,3,4,5,6,7,8,9,9};
        ArrayList<Integer>ansArray=nonRepeatingElements(arr);
        System.out.println(ansArray);
    }
    static ArrayList<Integer> nonRepeatingElements(int[]arr){
        ArrayList<Integer> newarr1=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j] && i!=j){
                    count++;
                }
            }
            if(count==0){
                newarr1.add(arr[i]);
            }
        }
        return newarr1;
    }
}
