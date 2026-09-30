package STRING;

public class s {
    public static void main(String[] args)  {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    static boolean isPalindrome(String s){
        s = s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]", "");
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }

}
