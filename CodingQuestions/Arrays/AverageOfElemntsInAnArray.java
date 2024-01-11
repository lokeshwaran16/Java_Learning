package CodingQuestions.Arrays;
//Input : arr[] = {5, 3, 6, 7, 5, 3}
//Output : 4.83333
public class AverageOfElemntsInAnArray {
    public static void main(String[] args) {
        int arr[] = {5, 3, 6, 7, 5, 3};
        int i=0;
        int sum=0;
        while(i<arr.length){
            sum=sum+arr[i];
            i++;
        }
        double Average=(double)sum/ arr.length;
        System.out.printf("%.5f%%\n", Average);
    }
}
