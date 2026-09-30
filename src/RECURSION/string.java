package RECURSION;

public class string {
    public static void main(String[] args){

        System.out.println(skipapple("bacaaplecdah"));
    }

    static void skip(String p , String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
           skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }
    }
    static String skip( String up){
        if(up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if(ch=='a'){
             return skip(up.substring(1));
        }else{
           return  ch+skip(up.substring(1));
        }
    }
    // this is for words not character
    // not working this part
    static String skipapple( String up){
        if(up.isEmpty()) {
            return "";
        }
        if(up.startsWith("apple")){
            return skipapple(up.substring(5));
        }else{
            return  up.charAt(0) + skipapple(up.substring(1));
        }
    }
}
