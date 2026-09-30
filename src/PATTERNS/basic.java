package PATTERNS;

public class basic {
    public static void main(String[] args) {
       // pattern1(4);
        //pattern2(5);
        //pattern3(5);
       // pattern4(5);
       // pattern5(6);
        pattern6(5);
    }
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col =1; col <=n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern4(int n) {
        for (int row = 1; row < 2*n; row++) {
            int total = row>n?2*n-row-1:row;
            for(int col=1;col<=total;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n) {
        for (int row = 1; row < 2*n; row++) {
            int total = row>n?2*n-row:row;
            int spaces = n - total;
            for(int s = 0; s<spaces;s++){
                System.out.print(" ");
            }
            for(int col=1;col<total;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n) {
        for (int row = 1; row < 2*n; row++) {
            int total = row>n?2*n-row-1:row;
            for(int col=1;col<=total;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}

