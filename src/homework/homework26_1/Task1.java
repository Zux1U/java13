package homework.homework26_1;

import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1); stack.push(2); stack.push(3);
        stack.push(4); stack.push(5); stack.push(6);
        stack.push(7); stack.push(8); stack.push(9);
        stack.push(10); stack.push(11); stack.push(12);
        System.out.println(stack);
        reverseStack(stack);
        System.out.println(stack);

    }

    public static void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int data  = stack.peek();
        stack.pop();
        reverseStack(stack);
        insertBottom(stack, data);
    }

    public static void insertBottom(Stack<Integer> stack, int value){
        if(stack.isEmpty()){
            stack.push(value);
        }
        else {
            int prevData = stack.peek();
            stack.pop();
            insertBottom(stack, value);
            stack.push(prevData);
        }
    }
}
