package Recursion.src;

import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        System.out.println(subsequencemakeusingAL("","abc"));
    }
    static ArrayList<String> subsequencemakeusingAL(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left= subsequencemakeusingAL(p+ch,up.substring(1));
        ArrayList<String> right=subsequencemakeusingAL(p,up.substring(1));
left.addAll(right);
return left;
    }
}
