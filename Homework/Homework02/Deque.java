/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  Deque.java
 * Purpose    :  Program that demonstrates deques
 * @author    :  Andrew Narag and Trevor Wong
 * Date       :  2018-10-18
 * Description:  This program demonstrates deques
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

class Deque {
    private int maxSize;
    private long[] dequeArray;
    private int left;
    private int right;
    private int nItems;

    public Deque(int s) {               // constructor
        maxSize = s;
        dequeArray = new long[maxSize];
        left = 0;
        right = maxSize-1;
        nItems = 0;
    }

    public void insertRight(long j) {         // put item at right of deque
        if (right == 0) {          // deal with wraparound
            right = maxSize-1;
        }
        dequeArray[right] = j;           // increment right and insert
        nItems++;                  // one more item
        right--;
    }

    public void insertLeft(long j) {         // put item at left of deque
        if (left == maxSize-1) {          // deal with wraparound
            left = 0;
        }
        dequeArray[left] = j;           // insert
        nItems++;
        left++;                  // one more item
    }

    public long removeLeft() {              // take item from left of deque
        if (left == 0) {           // deal with wraparound
            left = maxSize-1;
        }
        long temp = dequeArray[left];
        nItems--;                       // one less item
        left--;
        return temp;
    }

    public long removeRight() {              // take item from right of deque
        if (right == maxSize-1) {           // deal with wraparound
            right = 0;
        }
        long temp = dequeArray[right--];
        nItems--;                       // one less item
        right++;
        return temp;
    }

    public long peekLeft() {           // peek at left of deque
        return dequeArray[left];
    }

    public boolean isEmpty() {          // true if deque is empty
        return (nItems==0);
    }

    public boolean isFull() {           // true if deque is full
        return (nItems==maxSize);
    }

    public int size() {                 // number of items in deque
        return nItems;
    }

    public void display() {
        String output = "";
        for( int i = 0; i < maxSize; i++ ) {
            output += dequeArray[i] + " ";
        }
        System.out.println(output);
    }
}
