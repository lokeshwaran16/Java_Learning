package CodingQuestions.Arrays;

public class MaximumProductSubarrayInArray {
    public static void main(String[] args) {
        int[] arr = {6, -0, -10, -1,2};
        long max = arr[0];
        long min = arr[0];
        long res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                max = 1;
                min = 1;
                continue;
            }
            long temp1 = arr[i] * max;
            long temp2 = arr[i] * min;
            max = Math.max(temp1, temp2);
            max = Math.max(max, arr[i]);
            min = Math.min(temp1, temp2);
            min = Math.min(min, arr[i]);
            res = Math.max(res, max);
        }
        System.out.println(res);
    }
}
