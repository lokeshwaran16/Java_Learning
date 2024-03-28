package CodingQuestions.Numbers;

public class UniqueNumberOrNot {
    public static void main(String[] args) {
        int num=1111;
        int[]arr=new int[10];
        while(num>0){
            int rem=num%10;
            arr[rem]++;
            num=num/10;
            if(arr[rem]>1){
                System.out.print("Not an Unique Number");
                break;
            } else if (num<1) {
                System.out.println("Its Unique");
            }
        }
        }
    }

