/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  OddEvenSort.java
 * Purpose    :  Program to sort an array using odd even brick sorting
 * @author    :  Trevor Wong and Andrew Narag
 * Date       :  2018-11-06
 * Description:  This program creates an array which can be sorted in order of lowest to highest
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Revision History
 * ================
 *   Ver      Date     Modified by:                     Reason for change or modification
 *  -----  ----------  ----------------------------  ---------------------------------------------------
 *  1.0.0  2018-11-06  Trevor Wong and Andrew Narag  Initial release. Homework assignment.
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

class OddEvenSort {
    private int[] a; // ref to array a
    private int nElems; // number of data items
    public OddEvenSort(int max) { // constructor
        a = new int[max]; // create the array
        nElems = 0; // no items yet
    }

    public void insert(int value) {// put element into array
        a[nElems] = value; // insert it
        nElems++; // increment size
    }

    public void display() {// displays array contents
        for(int j=0; j<nElems; j++) // for each element,
        System.out.print(a[j] + " "); // display it
        System.out.println("");
    }

    public void oddEvenSort() {
        boolean isSorted = false; // Initially array is unsorted
        while (!isSorted) {
            isSorted = true;
            int temp = 0;
            // Perform Bubble sort on odd indexed element
            for (int i = 1; i <= nElems - 2; i = i+2) {
                if (a[i] > a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    isSorted = false;
                }
            }
            // Perform Bubble sort on even indexed element
            for (int i = 0; i <= nElems - 2; i = i+2) {
                if (a[i] > a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    private void swap(int one, int two){
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
