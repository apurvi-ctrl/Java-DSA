package BITMANIPULATION;

public class poweroftwo {
    public static void main(String[] args) {
        int n = 4; //fix for 0 its true
        boolean ans =(n & (n-1))==0;
        System.out.println(ans);
    }
}
