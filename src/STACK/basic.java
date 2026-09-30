package STACK;
import java.util.Stack;

public class basic {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(27);
        stack.push(25);
        stack.push(20);
        stack.push(12);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
