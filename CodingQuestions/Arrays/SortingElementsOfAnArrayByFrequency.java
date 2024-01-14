package CodingQuestions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

//Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
//Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6}
public class SortingElementsOfAnArrayByFrequency {
    public static void main(String[] args) {
        int[]arr={2, 5, 2, 8, 5, 6, 8, 8};
        ArrayList<Integer> res =sortByFrequentcy(arr);
        System.out.println(res);
    }
    static ArrayList<Integer>sortByFrequentcy(int []arr){
        int []dupe=new int[arr.length];
        int[]count=new int[arr.length];
        ArrayList<Integer> res=new ArrayList<>();
        int da=0;
        for (int i = 0; i < arr.length; i++) {
            int counting=0;
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < dupe.length; k++) {
                    if (arr[i] != dupe[k]) {
                        if(arr[i]==arr[j]){
                            counting++;
                        }
                    }
                }
            }
            if(counting>1){
                dupe[da]=arr[i];
                count[da]=counting;
                da++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(dupe[i]>0){
                int value=count[i];
                if(value==0){
                    res.add(dupe[i]);
                }
                while(value>0){
                    res.add(dupe[i]);
                    value--;
                }
        }
        }
        return res;
    }
}
