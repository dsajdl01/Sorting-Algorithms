package elementarySorts;

import analysisOfAlgorithm.StopWatch;

/**
 * The Insertion Sort class sort an array to Ascending order
 * insertion sort sort an array in quadratic time even if the all elements are sorted
 * and move element in one position at time.
 *  
 * @author David Sajdl
 *
 */


public class InsertionSort {

	/**
	 * main method where is initialize array in unsorted order and print out
	 * the array is sent to be sorted and print out
	 * it also measure time how long the program takes to process the insertion sorting
	 *  
	 */
	public static void main(String[] args) {
		//unsorted array 
		String str[] = {"Z", "K", "I", "M", "T", "Y", "B", "P", "U", "O", "Q", "S", "N", "X", "D", "G", "V", "J", "H", "F", "W", "L", "R", "E", "A", "C"};
		//print out the array's elements
		System.out.println("My unsorted array is: ");
		for(int i = 0; i < str.length; i++){
			System.out.print(str[i] + " ");
		}
		System.out.println("\n");
		// create new object stopwatch
		StopWatch stpWatch = new StopWatch();
		// start to measure time by calling start() method
		stpWatch.start();
		//sort array
		sort(str);
		//print array
		System.out.println("My array after using sort method: ");
		for(int i = 0; i< str.length; i++){
			System.out.print(str[i] + " ");
		}
		System.out.println();
		//stop to measure time by calling 
		stpWatch.stop();
		//print time of processing to sort the array 
		System.out.println("Time of the process: " + stpWatch.getElapsedTime());

	}
	/**
	 *  method that sort the array
	 * 
	 * @param a array string 
	 */
	public static void sort(String[] a){
		// get length of the array
		int N = a.length;
		//go through array elements  
		for(int i = 0; i < N; i++){
			for(int j = i; j > 0; j--){
				//check if the current element (with index j) in the array is a smaller then element in front of
				if(less(a[j], a[j-1])){
					//if not swap the elements  
					exch(a, j, j-1);
				}
				else{
					break;
				}
			}
		}
	}
	/**
	 * check if first string is a smaller then second one.
	 * 
	 * @param a string
	 * @param b string
	 * @return true if the a string is smaller than b string otherwise false
	 */
	private static boolean less(String a, String b){
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
	private static void exch(String[] a, int b, int c){
		String swop = a[b];
		a[b] = a[c];
		a[c] = swop;
	}
}
