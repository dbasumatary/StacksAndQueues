package com.stackandqueue;
/*creating a stack of 56->30->70*/

public class LinkedList {
    private MyNode head;
    public void push(int data){                       //method creation
        MyNode tempNode = new MyNode(data);
        tempNode.next = head;                        //the previous head will be stored in tempNode
        head = tempNode;                             //the head will now point to the tempNode
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
