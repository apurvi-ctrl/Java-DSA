package STRING;

public class palindrome {
    public static void main(String[] args) {
       String str = "apurvi";
       String str1 = "abccba";
       String str2 = "";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
    }
    static boolean isPalindrome(String str) {
        if(str == null||str.length()==0 ){
            return true;
        }
        str = str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            char start = str.charAt(i);
            char end =str.charAt(str.length()-i-1);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
