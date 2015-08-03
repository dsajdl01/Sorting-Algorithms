
/**
 * Class HeapSort enable to sort array that works by first organizing the data
 * to be sorted into a special type of binary tree called a heap. 
 * The heap itself has, by definition, the largest value at the top of the tree, 
 * so the heap sort algorithm must also reverse the order. 
 * It does this with the following steps:  
 *              1.Remove the topmost item (the largest) and replace it with the 
 *                  rightmost leaf. The topmost item is stored in an array.  
 *              2.Re-establish the heap.  
 *              3.Repeat steps 1 and 2 until there are no more items left in the heap.  
 * 
 * 
 * @author (David Sajdl) 
 * @version (01/08/2015)
 */
public class HeapSort{
    // main method
    public static void main(String[]args){
        
        //unsorted array 
        String str[] = {"Z", "K", "I", "M", "T", "Y", "B", "P", "U", "O", "Q", "S", "N", "X", "D", "G", "V", "J", "H", "F", "W", "L", "R", "E", "A", "C"};
        //print out the array's elements
        System.out.println("My unsorted array's elements are: ");
        for(int i = 0; i < str.length; i++){
            System.out.print(str[i] + " ");
        }
        System.out.println("\n");
        // create instant of the class HeapSort
        HeapSort hs = new HeapSort();
        hs.sort(str);
        // print out sorting array
        System.out.println("My sorted array's elements are: ");
        for(int i = 0; i < str.length; i++){
            System.out.print(str[i] + " ");
        }
    }
    /**
     * sort method sort array be ascending (alphabetical) order
     * by 
     * 
     * @param a string[] array to be sorted
     */
    public void sort(String[] a){
        // The first loop, the Θ(n) "heapify" phase, puts the array into heap order. 
        int n = a.length-1;
        for(int i = n/2; 0 <= i; i--){
            sink(a,i,n);
        }
        // The second loop, the O(n·lg(n)) "sortdown" phase, repeatedly 
        // extracts the maximum and restores heap order. 
        for(int j = 1; j <= n; j++){
            exch(a,0,n-j+1);
            sink(a,0,n-j);
        }
    }
    /**
     * sink method is written recursively for clarity. 
     * The code requires Θ(lg(n)) space for the recursive call stack. 
     * However, the tail recursion in sink() is easily converted to iteration, 
     * which yields the O(1) space bound.
     * 
     * @param a string[] array to be sorted
     * @param i integer the low of the array, start with zero
     * @param n integer the high of the array, start with array length
     */
    public void sink(String[] a, int i, int n){
        int mc = 0;
        int lc = 2*i;
        if(lc > n) return;
        int rc = lc + 1;
        
        if(rc > n){
            mc = lc;
        }else{
            if(a[lc].compareTo(a[rc]) > 0){
                mc = lc;
            }else{
                mc = rc;
            }
        }
        
        if(a[i].compareTo(a[mc]) >=0) return;
        exch(a,i,mc);
        sink(a,mc,n);
    }
    
    /**
     * method that exchange element in the array 
     * 
     * @param a string array 
     * @param b integer that is a index of the element that would be swap with c
     * @param c integer that is a index of the element that would be swap with b
     * 
     */
    private void exch(String[] a, int b, int c){
        String swap = a[b];
        a[b] = a[c];
        a[c] = swap;
    }
}
