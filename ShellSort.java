package elementarySorts;

/**
 * SellSort class sort an array to ascending (alphabetical) order
 * Sell sorting move entry  position in several time 
 * so it is more efficient that Insertion sorting
 * 
 * @author david
 *
 */

public class ShellSort {

	public static void main(String[] args) {
		// initialize two unsorted array
		String str[] = {"A", "E", "E", "L", "M", "O", "T", "R", "X", "P", "S"};
		String s[] = {"Z", "K", "I", "M", "T", "Y", "B", "P", "U", "O", "Q", "S", "N", "X", "D", "G", "V", "J", "H", "F", "W", "L", "R", "E", "A", "C"};
		//print out first unsorted array
		System.out.println("My unsorted array is: ");
		for(int i = 0; i < str.length; i++){
			System.out.print(str[i] + " ");
		}
		System.out.println();
		// get array to be sorted
		sort(str);
		// print out sorted array
		System.out.println("My array after using sort method: ");
		for(int i = 0; i< str.length; i++){
			System.out.print(str[i] + " ");
		}
		System.out.println();
		//print out second unsorted array
		System.out.println("My unsorted array is: ");
		for(int i = 0; i < s.length; i++){
			System.out.print(s[i] + " ");
		}
		System.out.println();
		//get sorted second array
		sort(s);
		//print out sorted array
		System.out.println("My array after using sort method: ");
		for(int i = 0; i< s.length; i++){
			System.out.print(s[i] + " ");
		}
	}
	/**
	 * sort array in ascending (alphabetical) order
	 * 
	 * @param a string[] array 
	 */
	
	public static void sort(String[] a){
		// get length of the array
		int N = a.length;
		
		// 3x + 1 increments sequence: - 1, 4, 13, 40, 121, 364....
		int h = 1;
		while(h < N/3){
			h = h*3+1;
		}
		
		//insertion sort
		while(h >=1){
			// h sort array
			for(int i = h; i < N; i++){
				for(int j = i; j >= h && less(a[j],a[j-h]); j-=h){
					exch(a,j,j-h);
				}
			}
			//move to next increment
			h = h/3;
		}
	}
	/**
	 * check if first string is a smaller then second one.
	 * 
	 * @param a String to be compare to b
	 * @param b String to be compare to a
	 * @return true if a string is smaller then b string otherwise false
	 */
	
	private static boolean less(String a, String b){
		return a.compareTo(b) < 0;
	}
	/**
	 * it exchanges an element in the array
	 * 
	 * @param a string array 
	 * @param b integer that is index of the array a or the element that would be swap with c
	 * @param c integer that is index of the array a or the element that would be swap with b
	 */
	
	private static void exch(String[] a, int b, int c){
		String swop = a[b];
		a[b] = a[c];
		a[c] = swop;
	}

}
