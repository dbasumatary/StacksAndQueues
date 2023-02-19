package com.stackandqueue;
/*creating a stack of 56->30->70*/

public class StackMain {
    public static void main(String[] args) {
        LinkedList stack = new LinkedList();               //creating new object of class LinkedList
        stack.push(70);                               //pushing elements one by one
        stack.push(30);
        stack.push(56);
        stack.display();
    }
}