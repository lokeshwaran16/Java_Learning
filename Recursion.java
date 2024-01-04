public class Recursion {
    public static void main(String[] args) {
        System.out.println(removeWord("Lokeshapplwaran"));
    }
    static String removeWord(String word){
        if(word.isEmpty()){
            return "";
        }
        if(word.startsWith("app") && !word.startsWith("apple") ){
            return removeWord(word.substring(3));
        }else{
            return word.charAt(0)+removeWord(word.substring(1));
        }
    }
}
//    public static void main(String[] args) {
//
//       removeA("Lokeshwaran","");
//    }
//    static void removeA(String name,String ans){
//       if(name.isEmpty()){
//           System.out.println(ans);
//           return;
//       }
//
//       char ch=name.charAt(0);
//       if(ch=='a'){
//           removeA(name.substring(1),ans);
//       }else{
//           removeA(name.substring(1),ans+ch);
//       }
//    }
//}
