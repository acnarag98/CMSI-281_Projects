/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  IntLinkedList.java
 * Purpose    :  Program that demonstrates queues
 * @author    :  Andrew Narag and Trevor Wong
 * Date       :  2018-10-18
 * Description:  This program demonstrates queues
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Revision History
 * ================
 *   Ver      Date     Modified by:  Reason for change or modification
 *  -----  ----------  ------------  ---------------------------------------------------------------------
 *  1.0.0  2018-10-18  Andrew Narag and Trevor Wong  Initial release. Homework assignment.
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s) {               // constructor
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j){         // put item at rear of queue
        if(rear == maxSize-1){           // deal with wraparound
            rear = -1;
        }
        queArray[++rear] = j;           // increment rear and insert
        nItems++;                       // one more item
    }

    public long remove() {              // take item from front of queue
        long temp = queArray[front++];  // get value and incr front
        if(front == maxSize){           // deal with wraparound
            front = 0;
        }
        nItems--;                       // one less item
        return temp;
    }

    public long peekFront() {           // peek at front of queue
        return queArray[front];
    }

    public boolean isEmpty() {          // true if queue is empty
        return (nItems==0);
    }

    public boolean isFull() {           // true if queue is full
        return (nItems==maxSize);
    }

    public int size() {                 // number of items in queue
        return nItems;
    }

    public void display() {
        String output = "";
        for( int i = 0; i < maxSize; i++ ) {
            output += queArray[i] + " ";
        }
        System.out.println(output);
    }
}
