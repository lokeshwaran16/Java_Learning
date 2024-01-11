package CodingQuestions.Arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class SumOfElementsOfTheArray {
    public static void main(String[] args) {

        int[] arr = { 65, 65};
        System.out.println(calculateArrayOfSum(arr));
    }
    static int calculateArrayOfSum(int[]arr){
        int sum=0;
        for(int element:arr){
            sum=sum+element;
        }
        return sum;
    }
}