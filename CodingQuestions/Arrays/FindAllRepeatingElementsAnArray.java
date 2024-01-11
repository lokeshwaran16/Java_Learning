package CodingQuestions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

//Input: n=7 , array[]={1, 2, 3, 6, 3, 6, 1}
//Output: 1, 3, 6
public class FindAllRepeatingElementsAnArray {
    public static void main(String[] args) {
        int[]Numbers={1,0,2, 3, 6,0, 3, 6,0, 1};
        ArrayList<Integer> ReapetedNumbers=new ArrayList<>();
        reapeatedElements(Numbers,ReapetedNumbers);
        System.out.println(ReapetedNumbers);

    }
    static void reapeatedElements(int[]arr,ArrayList<Integer>Numbers){
        int[]newarr=new int[arr.length];
        int k=0;
        int count0=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0&&count0==0){
                Numbers.add(arr[i]);
                count0++;
            }
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j] && i!=j){
                    int check=0;
                    int count=0;
                    while(check< arr.length){
                        if(newarr[check]==arr[i]){
                           count++;
                        }
                        check++;
                    }
                    if(count==0){
                        newarr[k]=arr[i];
                        k++;
                        Numbers.add(arr[i]);
                    }
                }
            }
        }

    }
}
