/**
 * Class QuickSort enable to sort array by comparisons each element. 
 * It has many of the same properties as insertion sort
 * 
 * As far as being the fastest on an extremely small and/or nearly sorted set of data, 
 * while that can cover up the weakness of bubble sort (to at least some degree), 
 * an insertion sort will essentially always be better for either/both of those.
 * 
 * @author David Sajdl 
 * @version (31/07/2015)
 */
public class BubbleSort {
    // main method
    public static void main(String[]args){
    
        //unsorted array 
        String str[] = {"Z", "K", "I", "M", "T", "Y", "B", "P", "U", "O", "Q", "S", "N", "X", "D", "G", "V", "J", "H", "F", "W", "L", "R", "E", "A", "C"};
        //print out the array's elements
        System.out.println("My unsorted array element's are: ");
        for(int i = 0; i < str.length; i++){
            System.out.print(str[i] + " ");
        }
        // create instant of the class SelectionSort 
        BubbleSort bs = new BubbleSort();
        bs.sort(str);
        // printing out sorted array's elements
        System.out.println("\n\nSorted array's elements are:");
        for(int i = 0; i < str.length; i++){
            System.out.print(str[i] + " ");
        }
    
    }
    /**
     * sort method enable to sort array be ascending (alphabetical) order
     * by comparisons each element in the array
     * 
     * @param a string[] array to be sorted
     */
    public void sort(String[] a){
        int N = a.length;
        
        for(int i = 0; i < N; i++){
            boolean swapped = false;
            for(int j = N -1; i < j; j--){
                if(less(a[j], a[j-1])){
                    exch(a, j, j-1);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
    
    /**
     * check if first string is a smaller then second one.
     * 
     * @param a string
     * @param b string
     * @return true if the a string is smaller than b string otherwise false
     */
    private  boolean less(String a, String b){
        return a.compareTo(b) < 0;
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
