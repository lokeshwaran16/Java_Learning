package CodingQuestions.Numbers;

public class ReducedSubstractedForm {
    public static void main(String[] args) {
        int num=6928;
        int ans=0;
        while(num>100){
            int i=0;
            int ogans=0;
            while(num>10){
                int rem=num%10;
                num=num/10;
                int rem2=num%10;
                 ans=rem-rem2;
                if(ans<0){
                    ans=ans*-1;
                }
                ans=(int)Math.pow(10,i)*(ans);
                ogans=ogans+ans;
                i++;
            }
            num=ogans;
        }
        System.out.println(num);
    }
}
