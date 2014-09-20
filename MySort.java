package quicksort;

import java.util.Arrays;

/**
 * MySort class sort an array in alphabetical order.
 * 
 * 
 * @author David Sajdl
 *
 */

public class MySort {
	
	// instance variable
	private String[] sortedArr;
	
	/**
	 * constructor where instance variable in inisilazed
	 * 
	 * @param a array string that is array to be sorted
	 */
	public MySort(String[] a){
		sortedArr = new String[a.length];
		sortedArr = sort(a);
	}
	
	/**
	 * it sort array in alphabetical order
	 * 
	 * @param a string array that would be sorted
	 * @return array string in alphabetical order
	 */
	public String[] sort(String[] a){
		
		for(int i = 0; i < a.length -1; i++){
			int j = i + 1;
			int z = i;
			do{
				if(checkLessValues(a[z],a[j])){
					swapValues(a,z,j);
					j--;
					z--;
				}
				else{
					z = -1;
				}
				
			}while(z >= 0);
		}
		return a;
	
	}
	/**
	 * private method that support sort method.
	 * it check if first value(string) is greater then second value
	 * 
	 * @param a string that contain elements of the array.
	 * @param b string that contain elements of the array
	 * @return true if the a string is greater than b string otherwise false 
	 */
	private static boolean checkLessValues(String a, String b){
		return a.compareTo(b) > 0;
	}
	/**
	 * private method that support sort method
	 * it swap elements in the array
	 * 
	 * @param a string array where elements would be swapped 
	 * @param b integer is an index of the array. Elements of the index (b) would be swapped with parameter c
	 * @param c integer is  an index of the array, Elements of the index (c) will be swapped with parameter a
	 */
	private static void swapValues(String[] a, int b, int c){
		String swop = a[b];
		a[b] = a[c];
		a[c] = swop;
	}
	/**
	 * 
	 * @return
	 */
	public String[] getSortedArray(){
		return sortedArr;
	}
	
	/**
	 * 
	 */
	@Override
	public String toString(){
		return Arrays.toString(sortedArr);
	}

}
