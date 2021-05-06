import jdk.nashorn.internal.IntDeque;

import java.util.Stack;

public class stack
{


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();

        stack.push(5);
        stack.push(6);
        stack.push(7);

        int number = stack.pop();
        System.out.println("Removed Element: " + number);

        System.out.println("Stack: " + stack);

    }


}

