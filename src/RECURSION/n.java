package RECURSION;

public class n {
    public static void main(String[] args){
      // fun(5);
       funr(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        fun(n-1);
        System.out.println(n);
    }

static void funr(int n){
    if(n==0){
        return;
    }

    System.out.println(n);
    funr(n-1);
}
}