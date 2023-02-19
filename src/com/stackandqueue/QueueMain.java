package com.stackandqueue;
/*Using linked list to do dequeue operations*/
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
        System.out.println("After enqueue, the queue length is: " +queue.size());
        System.out.println();

        System.out.println("An item is dequeued from the top");
        queue.deQueue();                              //it removes the front item from the queue
        queue.display();
        System.out.println();

        queue.deQueue();                             //it removes the front item from the queue
        queue.display();
        System.out.println();

        queue.deQueue();                             //it removes the front item from the queue until none left
        queue.display();
        System.out.println();
        System.out.println("After dequeue, the queue length will now be: " +queue.size());
    }
}
