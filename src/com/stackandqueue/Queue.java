package com.stackandqueue;
/*Using linked list to do queue operations*/

public class Queue {
    public MyNode head;
    public MyNode tail;
    public int size;
    public void enqueue(int data){              //Method to EnQueue or insert an Item in Queue(rear)
        if (head == null){
            tail = new MyNode(data);            //tail will be added new items
            head = tail;                        //previous head will now
        }
        else {
            tail.next = new MyNode(data);
            tail = tail.next;                   //tail will now be the new tail
        }
        size++;
    }
    public int size() {                     //method to check the size of stack
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
