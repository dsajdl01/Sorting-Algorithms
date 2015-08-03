/**
 * Class QuickThreeSort enable yo sort an array.
 * A three partition Quick Sort would pick two values to partition on 
 * and split the array up that way. eg: [3, 5, 2, 7, 6, 4, 2, 8, 8, 9, 0]
 * and the pick value for example 4 and 7: [3, 2, 0, 2, | 4, 6, 5, 7, | 8, 8, 9]
 * 
 * http://stackoverflow.com/questions/941447/quicksort-with-3-way-partition
 * @author (David Sajd) 
 * @version (02/07/2015)
 */
public class QuickThreeSort {
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
        // create instant of the class QuickThreeSort
        QuickThreeSort qts = new QuickThreeSort();
        qts.sort(str);
        //print out sorted array's elements
        System.out.println("Sorted array's elements are: ");
        for(int i = 0; i < str.length; i++){
            System.out.print(str[i] + " ");
        }
    }
    
    /**
     * sort method sents message to sort arrya with 
     * two integers represent zero and the length of the array - 1
     * 
     * @param a string array to be sorted
     */
    public void sort(String[] a){
        sort(a, 0, a.length-1);
    }
    
    /**
     * sort method split array into three partitions and then
     * sort it in ascending (alphabetical) order in recursive sort.
     * 
     * 
     * @param a string array to be sorted
     * @param lo integer the lower index starts with zero
     * @param n integer the length of the array - 1
     */
    public void sort(String[] a, int lo, int n){
        
        if(n <= lo) return;
        
        int li = lo, ni = n, i = lo+1;
        int pivotIndex = lo;
        String pivotValue = a[pivotIndex];
        
        while(i <= ni){
            if(less(a[i],pivotValue)){
                exch(a, i++, li++);
            }
            else if(less(pivotValue, a[i])){
                exch(a,i, ni--);
            }
            else{
                i++;
            }
        }
        
        sort(a,lo,li-1);
        sort(a,ni+1,n);
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
