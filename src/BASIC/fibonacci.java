package BASIC;

import java.sql.SQLOutput;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if ( n <= 1) {
            System.out.println(n);
            return;
        }
        int a = 0;
        int b=1;

        for(int i=2;i<=n;i++){
           int c = a+b;
           a=b;
           b=c;
        }
        System.out.println(b);
    }
}
