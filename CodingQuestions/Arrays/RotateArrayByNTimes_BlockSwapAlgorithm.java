package CodingQuestions.Arrays;
import java.util.Arrays;
import java.util.Scanner;
//int arr[] = {6, 8, 7, 9, 0, 5, 1, 3, 2, 4}, s = 10, d = 5
//
//Output: result[] = {5, 1, 2, 3, 4, 6, 8, 7, 9, 0}
public class RotateArrayByNTimes_BlockSwapAlgorithm {
    public static void main(String[] args) {
        int arr[] = {6, 8, 7, 9, 0, 5, 1, 3, 2, 4};
        int n=12;
        rotate(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int []arr,int n){
        n=n% arr.length;
        System.out.println(n);
        reverse(arr,0,n-1);
        reverse(arr,n,arr.length-1);
        reverse(arr,0, arr.length-1);
    }
    static void reverse(int[]arr,int start,int end){
       while(start<end){
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
    }
}
