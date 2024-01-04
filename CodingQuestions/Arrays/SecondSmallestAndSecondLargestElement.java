package CodingQuestions.Arrays;

public class SecondSmallestAndSecondLargestElement {
    public static void main(String[]args){
        int []arr={5976,346,94,57,69,74,5,1,79,76,54};
        arrangeInOrder(arr);
        System.out.println("The Second Smallest Element Is "+arr[1]);
        System.out.println("The Second Largest Element Is "+arr[arr.length-2]);
    }
    static void arrangeInOrder(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    swap(i,j,arr);
                }
            }
        }
    }

    static void swap(int i,int j,int[]arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
