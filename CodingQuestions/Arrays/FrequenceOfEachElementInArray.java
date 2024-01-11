package CodingQuestions.Arrays;

import java.util.ArrayList;

public class FrequenceOfEachElementInArray {
    public static void main(String[] args) {
        int[]arr={2,2,4,5,6,7,4,6,7,7,5,4,2,34,4,5,6,6,7,7,7,8,8,8,67,67,67,67,67,67};
        int i=0;
        ArrayList<Integer> visited=new ArrayList<>();
        visited.add(-1);
        while(i<arr.length){
            int count=0;
            int visit=0;
            for (int j = 0; j < visited.size(); j++) {
                if(arr[i]==visited.get(j)){
                    visit++;
                }
            }
            visited.add(arr[i]);
            if(visit==0){
                for (int k = 0; k < arr.length; k++) {
                    if(arr[i]==arr[k]){
                        count++;
                    }
                }
                System.out.println("The number"+arr[i]+"'s frequency is :"+count);

            }
            i++;

        }
    }
}
