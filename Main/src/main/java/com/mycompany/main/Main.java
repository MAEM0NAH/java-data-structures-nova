
package com.mycompany.main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      Queue Q=new Queue ();
        for (int i = 0; i < Q.Max-1; i++) {
            System.out.println("inter the iteam ["+i+"]");
             Q.enqueue(in.nextInt()); 
        }
        System.out.println("Queue contents:");
        Q.printQueue();
    
        System.out.println("Dequeued item: " + Q.dequeue());
         
        System.out.println("Queue after dequeue:");
        Q.printQueue();
    }
}
