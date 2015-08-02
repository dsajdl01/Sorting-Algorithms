/**
 * SelectionSort class enable to sort array by
 * soring all values that are comparisons so 
 * it don’t mind what is sort as all finish at the same time
 * 
 * One advantage of selection sort is that it requires only n write operations.
 * Selection sort is also pretty good for smaller arrays of maybe 10 to 20 elements.
 * 
 * @author (David Sajdl) 
 * @version (31/07/2015)
 */
public class SelectionSort{
    // main method
    public static void main(String[]args){
        //unsorted array 
        String str[] = {"Z", "K", "I", "M", "T", "Y", "B", "P", "U", "O", "Q", "S", "N", "X", "D", "G", "V", "J", "H", "F", "W", "L", "R", "E", "A", "C"};
        //print out the array's elements
        System.out.println("My unsorted array is: ");
        for(int i = 0; i < str.length; i++){
            System.out.print(str[i] + " ");
        }
        System.out.println("\n");
        // create instant of the class SelectionSort
        SelectionSort ss = new SelectionSort();
        // sort array
        ss.sort(str);
        // ptint out sorted array's elements
        for(int i = 0; i < str.length; i++){
            System.out.print(str[i] + " ");
        }
    }
    
    /**
     * sort method sort array by ascending (alphabetical) order
     * by comparison each element in teh array.
     * 
     * @param a string[] array to be sorted
     */
    public void sort(String[] a){
        int N = a.length;
        for(int i = 0; i < N; i++){
            int min = i;
            for(int j = i + 1; j < N; j++){
                if(less(a[j], a[min])){
                   min = j;  
                }
            }
            exch(a, i, min);
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
