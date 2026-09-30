package RECURSION;

public class sumofdigits {
    public static void main(String[] args) {
        //int ans = sum(1234);
        //System.out.println(ans);
       // System.out.println(prod(1234));
        fun(5);
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return sum(n / 10) + (n % 10);
    }


    static int prod(int n) {
        if (n%10 == n) {
            return n;
        }
        return prod(n / 10) * (n % 10);
    }
    static void fun(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        fun(--n);// if we use n-- the stack overflow
    }
}
