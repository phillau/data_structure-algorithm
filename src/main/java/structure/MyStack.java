package structure;

import com.sun.org.apache.bcel.internal.generic.NEW;

//简单栈结构
public class MyStack {
    public static void main(String[] args) {
//        MyStack myStack = new MyStack();
//        myStack.push("1");
//        myStack.push("2");
//        myStack.push("3");
//        myStack.push("4");
//        myStack.push("5");
//        while (!myStack.isEmpty()){
//            System.out.println(myStack.pop());
//        }

        String s = "abcdefghijk";
        MyStack myStack = new MyStack();
        for (int i = 0; i < s.length() ; i++) {
            myStack.push(s.charAt(i));
        }
        while (!myStack.isEmpty()){
            System.out.print(myStack.pop());
        }
    }

    private char[] arr;
    private int maxSize = 100;
    private int top;

    public MyStack() {
        arr = new char[maxSize];
        top = -1;
    }

    public void push(char element) {
        arr[++top] = element;
    }

    public char pop() {
        return arr[top--];
    }

    public char peek() {
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}

