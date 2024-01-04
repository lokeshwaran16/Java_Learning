package CodingQuestions.Arrays;

public class LargestNumberInAnArray {
    public static void main(String[]args){
        int[]arr={25,4,76,1,4,7,2};
        int ans=largest(arr);
        System.out.println(ans);
    }
    static int largest(int[]arr){
        int large=arr[0];
        for(int i=0;i<arr.length;i++){
            if(large<arr[i]){
                large=arr[i];
            }
        }
        return large;
    }
}
