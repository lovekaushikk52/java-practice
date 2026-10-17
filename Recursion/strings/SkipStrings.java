package Recursion.strings;

public class SkipStrings {

    public static void main(String[] args) {
        skip("baccabb", "");
        System.out.println(skip2("bccgbaaaj"));
        System.out.println(skipApple("bccgbapplejapplecaa"));
    }

    static void skip(String org,String ans){
        if(org.isEmpty()){
            System.out.println(ans);
            return ;
        }

        char ch=org.charAt(0);

        if(ch=='a'){
            skip(org.substring(1), ans);
        }
        else{
            skip(org.substring(1), ans+ch);
        }
    }

    static String skip2(String org){
        if(org.isEmpty()){
            return "";
        }

        char ch=org.charAt(0);

        if(ch=='a'){
            return skip2(org.substring(1));
        }
        else{
            return ch+skip2(org.substring(1));
        }
    }

    static String skipApple(String org){
        if(org.isEmpty()){
            return "";
        }

        //skipping 5 coz apple have 5 letters
        if(org.startsWith("apple")){
            return skipApple(org.substring(5));
        }
        else{
            return org.charAt(0)+skipApple(org.substring(1));
        }
    }
    
}
