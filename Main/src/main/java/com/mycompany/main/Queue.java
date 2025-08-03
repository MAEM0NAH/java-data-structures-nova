
package com.mycompany.main;

import com.sun.source.tree.BreakTree;


public class Queue {
    protected int Max;
    protected int Rear,Front;
    protected int ARR[];
     public Queue() {
      Max = 5;
      Rear=Front=Max-1;
      ARR = new int[Max];
    }
     public void MakeEmpty(){
       Front=Rear=Max-1;
    }
 
     public boolean isEmpty() {
       return (Rear==Front);

    }
     public boolean isFull() {
       return ((Rear+1)%Max==Front);
    }
     
     public void enqueue(int NewItem){
         if(isFull()){
         System.out.println("overflow");
         return;
         } 
         Rear = (Rear + 1) % Max;
         ARR[Rear] = NewItem;
         
            
    }
     public int dequeue( ){
         if(isEmpty()){
             System.out.println("underflow");
             return -1;
         }
         
         Front=(Front+1)%Max;
        int Result=ARR[Front];
         return Result;

    }
      public void printQueue() {
          
    int i = (Front + 1) % Max;
    System.out.print("[ ");
    while (i != (Rear + 1) % Max) {
        System.out.print(ARR[i] + " ");
        i = (i + 1) % Max;
    }
    System.out.println("]");
    }
      
}
