package STRING;

import java.util.ArrayList;

public class operatorbasic {
    public static void main(String[] args) {
        System.out.println('a'+'b');// character
        System.out.println("a"+"b");//string
        System.out.println(('a'+3));//concatenation
        System.out.println(("a"+3));//integer will be converted to Integer that will call toString()
        System.out.println("apurvi" +new ArrayList<>());
        System.out.println("apurvi"+new Integer(27));
        //operators in java use for primitives and complex object but the only condition is atleast
       // one of the object should be typed string
    }
}
