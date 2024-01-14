package CodingQuestions.Arrays;

public class SymmetricPairsInArray {
    public static void main(String[] args) {
        int[][]arr={{1,2},{2,1},{3,4},{4,3},{10,4}};
        findingSymetricPair(arr);
    }
    static void findingSymetricPair(int[][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0]){
                    System.out.println("{"+arr[i][0]+","+arr[i][1]+"}");
                }
            }
        }
    }
}
