package com.stackandqueue;
/*creating a stack of 56->30->70*/

public class StackMain {
    public static void main(String[] args) {
        LinkedList stack = new LinkedList();               //creating new object of class LinkedList
        stack.push(70);                               //pushing elements one by one
        stack.push(30);
        stack.push(56);
        stack.display();
        System.out.println();
        System.out.println("The initial size of stack is " + stack.size());         //initial size is 3

        System.out.println("\nPeek : " + stack.peek());               //peek returns the top element from stack without removing
        System.out.println("Pop 1 : " + stack.pop());                                  //removes top item from the stack
        System.out.println("After pop, the first element of the stack will be removed");
        stack.display();
        System.out.println("\nAfter first pop ,the size of stack is " + stack.size());     //after doing pop(), now the size will be 2
        System.out.println();

        System.out.println("Pop 2 : " + stack.pop());
        stack.display();
        System.out.println("\nAfter second pop ,the size of stack is " + stack.size());
        System.out.println();

        System.out.println("Pop 3 : " + stack.pop());
        System.out.println("After third pop ,the size of stack is " + stack.size());
    }
}