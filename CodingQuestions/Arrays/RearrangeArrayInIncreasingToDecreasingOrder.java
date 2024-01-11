package CodingQuestions.Arrays;

import java.util.Arrays;

//Example 1:
//        Input: 8 7 1 6 5 9
//        Output: 1 5 6 9 8 7
//        Explanation: First three elements are in the ascending order and next three elements are in the descending order.
//
//        Example 2:
//        Input: 4 2 8 6 15 5 9 20
//        Output: 2 4 5 6 20 15 9 8
public class RearrangeArrayInIncreasingToDecreasingOrder {
    public static void main(String[] args) {
        int[]arr={2,4,1,45,78,23,55,3,98};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int j= arr.length-1;
        for (int i = arr.length/2; i <(arr.length/2)+(arr.length/4) ; i++) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
