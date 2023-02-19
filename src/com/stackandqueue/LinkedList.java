package com.stackandqueue;
import java.util.EmptyStackException;
/*creating a stack of 56->30->70*/

public class LinkedList {
    private MyNode head;
    private int size;
    public void push(int data){                       //method creation
        MyNode tempNode = new MyNode(data);
        tempNode.next = head;                        //the previous head will be stored in tempNode
        head = tempNode;                             //the head will now point to the tempNode
        size++;
    }
    public boolean isEmpty(){                       //check for empty stack
        return size == 0;
    }
    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();         //method in stack class to show that the stack is empty
        }
        return head.data;                            //the top element will be displayed but not removed
    }
    public int pop(){                             //pop method
        if(isEmpty()){                            //check if the stack is empty
            throw new EmptyStackException();
        }
        int finalResult = head.data;              //the top element will be removed in pop method
        head = head.next;                         //after pop, the next node will be the head
        size--;                                   //the size will also decrease
        return finalResult;
    }
    public int size(){                             //checking the size of stack
        return size;
    }
    public void display(){                          //display method
        MyNode currentNode = head;
        System.out.print("The stack is : ");
        while (currentNode != null){
            System.out.printf("%s ", currentNode.data);
            currentNode= currentNode.next;
        }
    }
}
