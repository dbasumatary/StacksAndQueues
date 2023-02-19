package com.stackandqueue;
/*Using linked list to do queue operations*/
public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(56);                     //add new item to the rear using enqueue
        queue.display();
        System.out.println();
        queue.enqueue(30);                     //add new item to the rear using enqueue
        queue.display();
        System.out.println();
        queue.enqueue(70);                     //add new item to the rear using enqueue
        queue.display();
        System.out.println();
    }
}
