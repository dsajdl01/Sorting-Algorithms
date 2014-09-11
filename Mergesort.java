package mergesort;

/**
 * Mergesort class sort an array into alphabetical order by dividing array into two half
 * in recursive way. After that each half is split into sub-parts until its kept one element.
 * Then sup-parts are merge and sorted.
 * Mergesort use N lg n compares but it use extra space as array aux[] needs for last merge. 
 * 
 * 
 * @author David Sajdl
 *
 */

public class Mergesort {
	
	/**
	 * it sort array recursively by dividing array into sub-parts 
	 * 
	 * @param a string[] is unsorted array 
	 * @param aux string[] is copied array
	 * @param lo integer that is first element or index zero
	 * @param hi integer that is last element or n-1
	 */
	public static void sort(String[] a, String[] aux, int lo, int hi){
		if(hi <= lo) return;
		//to divide array length into two half
		int mid = lo + (hi - lo)/2;
		//splitting first half of the array until it contain only one element e.g:if is hi = 10 then mid = 5, 2, 1
		sort(aux, a, lo, mid);
		//splitting second half of the array until it contain only one element 
		sort(aux, a, mid+1, hi);
		//merging each sup-parts 
		merge(a, aux,lo, mid, hi);
	}
	/**
	 * it compare or merge elements in the array
	 * the lowest element is swap or is kept at the lowest index  
	 * 
	 * @param a String array origin array to be sorted
	 * @param aux String array auxiliary
	 * @param lo integer as lowest index: zero
	 * @param mid integer as middle if the array is length 12 then mid is 6 then 3 then 1 
	 * @param hi integer as the highest index in the array n-1
	 */
	private static void merge(String[] a, String[] aux, int lo, int mid, int hi){
		int i = lo, j = mid + 1;
		// go through array
		for(int k = lo; k <= hi; k++){
			if(i > mid) aux[k] = a[j++];
			else if (j > hi) aux[k] = a[i++];
			else if (less(a[j],a[i])) aux[k] = a[j++];
			else aux[k] = a[i++];
		}
	}
	
	/**
	 * check if a first string is a smaller then second one.
	 * 
	 * @param a string
	 * @param b string
	 * @return true if the a string is smaller than b string otherwise false
	 */
	private static boolean less(String a, String b){
		return a.compareTo(b) < 0;
	}
	
	public static void main(String[]args){
		//initialaze unsorted array
		String str[] = {"Z", "K", "I", "M", "T", "Y", "B", "P", "U", "O", "Q", "S", "N", 
				"X", "D", "G", "V", "J", "H", "F", "W", "L", "R", "E", "A", "C"};
		//create new array called aux[] with length of that will be sorted
		String[] aux = new String[str.length];
		//print out unsorted array and copy all elements into aux[] array
		System.out.println("My array is: ");
		for(int i = 0; i < str.length; i++){
			aux[i] = str[i];
			System.out.print(str[i] + " ");
		}
		System.out.println();
		//get array to be sorted
		sort(str,aux,0,str.length-1);
		//print out sorted array
		System.out.println("\nSorted Array:");
		for(int i = 0; i < str.length; i++){
			System.out.print(aux[i] + " ");
		}
	}
}
