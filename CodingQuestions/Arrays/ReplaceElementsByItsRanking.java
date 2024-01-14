package CodingQuestions.Arrays;
import java.util.Arrays;

import static java.util.Arrays.*;

//N = 6
//arr = [20, 15, 26, 2, 98, 6]
//Output:
//4, 3, 5, 1, 6, 2
//Explanation:
//After sorting, array becomes {2,6,15,20,26,98}
//Rank(2) = 1 (at index 0)
//Rank(6) = 2 (at index 1)
//Rank(15) = 3 (at index 2)
//Rank(20) = 4 (at index 3) and so on
public class ReplaceElementsByItsRanking {
    public static void main(String[] args) {
        int[]arr={20, 15, 26, 2, 98, 6};
        int[]res=replaceElementsByRanking(arr);
        System.out.println(Arrays.toString(res));
    }
    static int[] replaceElementsByRanking(int[]arr){
        int[]clonearr=Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr);
        int[]result=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < clonearr.length; j++) {
                if(arr[i]==clonearr[j]){
                    result[j]=i+1;
                }
            }
        }
        return result;

    }
}
