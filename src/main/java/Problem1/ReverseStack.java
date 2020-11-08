package Problem1;

import java.util.Stack;

public class ReverseStack {
    Stack<Integer> newStack = new Stack<>();
    public static void reverseStack(Stack<Integer> stack) {
        Stack<Integer> newStack = new Stack<>();
        // homework
        if (stack.size() > 0) {
            int x = stack.peek();
            stack.pop();
            newStack.push(x);
            reverseStack(stack);
        }
    }

}