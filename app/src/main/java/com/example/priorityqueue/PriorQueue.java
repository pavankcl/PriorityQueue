package com.example.priorityqueue;

import android.util.Log;

public class PriorQueue {
    private static String p ="Queue";

   Node node = new Node();
    static class Node {
        int data;
        int priority;
        Node next;
    }
    Node front = null;


    void  pop(){  //to pop the highest priority element
        Node del = new Node();
        if(front == null)
           Log.i(p,"empty");
        else
        {
            del = front;
            //Log.d(p,"Deleted item"+del.data);
            front = front.next;

        }
    }

     void push( int priority, int d){
         Node tmp = new Node();
         Node q = new Node();


         tmp.data = d;
         tmp.priority = priority;
         /*Queue is empty or item to be added has priority more than first item*/
         if( front == null || priority < front.priority )
         {
             tmp.next = front;
             front = tmp;
         }
         else
         {
             q = front;
             while( q.next != null && q.next.priority <= priority )
                 q=q.next;
             tmp.next = q.next;
             q.next = tmp;
         }

    }

    Node list(){  //print the list
        Node ptr;
        ptr = front;
        if(front == null)
           Log.d(p,"queue is empty");
        else
        {

            while(ptr != null)
            {
                Log.d(p,"list"+ptr.data);
                ptr = ptr.next;
            }
        }
        return ptr;
    }

}