package CodingQuestions.Arrays;

public class SmallestNumberInArray {
    public static void main(String[]args){
        int[]arr={25,4,76,1,4,7,2};
        int ans=smallest(arr);
        System.out.println(ans);
    }
    static int smallest(int[]arr){
        int small=arr[1]+1;
        for(int i=0;i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        return small;
    }
}
