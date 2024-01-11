package CodingQuestions.Arrays;
//Example of an odd length array
//        Input: arr = [9,4,6,3,8]
//
//        Output: 6
//
//        Explanation
//        Sort the given numbers [3,4,6,8,9].
//        The middle value is 6, which is the median.
//        Example of an even length array
//        Input: arr = [7,4,6,9,3,8]
//
//        Output: 6
//
//        Explanation
//        Sort the given numbers [3,4,6,7,8,9].
//        Here, the middle elements are 6 and 7.
//6+7/2=6.5==6

import java.util.Arrays;

public class MedianOfTheArray {
    public static void main(String[] args) {
        int[]arr={3,4,6,7,8,9};
        Arrays.sort(arr);
        int ans=0;
        if(arr.length%2==0){
           ans=(arr[arr.length/2]+arr[(arr.length/2)-1])/2;
        }else{
            ans=arr[(arr.length/2)];
        }
        System.out.println(ans);
    }
}
