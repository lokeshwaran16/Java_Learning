package CodingQuestions.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddingElementArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int newNumber=in.nextInt();
        int[]arr={3,4,5,6,6,4,3,1};
        int[] newarr=addElement(arr,newNumber);
        System.out.print(Arrays.toString(newarr));
    }
    static int[] addElement(int[]arr,int nN){
        int []newarr=new int[arr.length+1];
        for (int i = 0; i < newarr.length-1; i++) {
            newarr[i]=arr[i];
        }
        newarr[newarr.length-1]=nN;
        return newarr;
    }

}
