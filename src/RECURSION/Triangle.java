package RECURSION;

public class Triangle {
    public static void main(String[] args) {
    pattern2(4,0);
    pattern(4,0);
    }
    static void pattern(int row,int column){
        if(row==0){
            return;
        }
        if(row>column){
            System.out.print("*");
            pattern(row,column+1);
        }
        else{
            System.out.println();
            pattern(row-1,0);
        }
    }
    static void pattern2(int row,int column){
        if(row==0){
            return;
        }
        if(row>column){
            pattern(row,column+1);
            System.out.println("*");
        }
        else{
            pattern(row-1,0);
            System.out.println();
        }
    }
}
