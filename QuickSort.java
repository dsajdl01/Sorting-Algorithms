
/**
 * Class QuickSort enable to sort array .
 * Quicksort (sometimes called partition-exchange sort) is an efficient sorting algorithm, 
 * serving as a systematic method for placing the elements of an array in order. 
 * When implemented well, it can be about two or three times faster 
 * than its main competitors, merge sort and heapsort.[3]
 * 
 * You shouldn't center only on worst case and only on time complexity. 
 * It's more about average than worst, and it's about time and space.
 * Quicksort:   has average time complexity of Θ(n log n);
 *              can be implemented with space complexity of Θ(log n)
 * @author (David Sajdl) 
 * @version (01/08/2015)
 */
public class QuickSort{
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
        // create instant of the class QuickSort
        QuickSort qs = new QuickSort();
        qs.sort(str);
        // print out sorting array
        System.out.println("My sorted array's elements are: ");
        for(int i = 0; i < str.length; i++){
            System.out.print(str[i] + " ");
        }
    }
    
    /**
     * sort method sents message to sort method that has a different signiture
     * 
     * @param a string[] array to be sorted
     */
    public void sort(String[] a){
        int n = a.length;
        if(a == null || n == 0) return;
        sort(a,0,n-1);
    }
    
    /**
     * 
     * 
     * @param a string[] array to be sorted
     * @param lo integer keep the lower index starts with 0
     * @param hi integer keep the higher index starts with array length -1
     */
    public void sort(String[] a, int lo, int hi){
        
        if(hi <= lo) return;
        int j = partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }
    
     /**
     * 
     * 
     * @param a string[] array to be sorted
     * @param lo integer keep the lower index starts with 0
     * @param hi integer keep the higher index starts with array length -1
     */
    public int partition(String[] a, int lo, int hi){
        int i = lo, j = hi+1;
        
        while(true){
            //find item on the left to swop
            while(less(a[++i],a[lo])){
                if(i == hi) break;
            }
            // find item on the right to swop
            while(less(a[lo],a[--j])){
                if(j == lo) break;
            }
            //check if pointers cress
            if(i >=j) break;
            // swap
            exch(a,i,j);
        }
        // swap with partitioning item
        exch(a,lo,j);
        // return index of item now know to be in place
        return j;
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
