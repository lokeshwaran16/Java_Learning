package CodingQuestions.Arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromUnSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 9, 3, 4, 5, 5, 6, 7, 8, 9};
        Arrays.sort(arr);
        int n = arr.length;
        n = removeDuplicateElements(arr, n);
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int removeDuplicateElements(int[]arr,int n){
        int[]temp=new int[n];
        int j=0;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]!=arr[i+1]){
                temp[j]=arr[i];
                j++;
            }
        }
        temp[j]=arr[n-1];
        for(int i=0;i<=j;i++){
            arr[i]=temp[i];
        }
        return j;
    }
}
