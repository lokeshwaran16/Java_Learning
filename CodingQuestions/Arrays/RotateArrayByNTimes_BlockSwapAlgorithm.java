package CodingQuestions.Arrays;
import java.util.Arrays;
import java.util.Scanner;
//int arr[] = {6, 8, 7, 9, 0, 5, 1, 3, 2, 4}, s = 10, d = 5
//
//Output: result[] = {5, 1, 2, 3, 4, 6, 8, 7, 9, 0}
public class RotateArrayByNTimes_BlockSwapAlgorithm {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]={6, 8, 7, 9, 0, 5, 1, 3, 2, 4};
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the No.Of time rotate of an Array :");
        int rotate=in.nextInt();
        int[]ans=rotateArray(arr,rotate);
        System.out.println(Arrays.toString(ans));


    }
    static int[] rotateArray(int[]arr,int n){
        int[]result=new int[arr.length];
        int i=0;
        while(i<arr.length){
            if(i-n<0){
                result[arr.length-(n-i)]=arr[i];
            }else{
                result[i-n]=arr[i];
            }
            i++;
        }
        return result;
    }
}
