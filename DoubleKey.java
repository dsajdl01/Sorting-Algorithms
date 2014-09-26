package quicksort;

import java.util.Random;
/**
 * 
 * 
 * @author david
 *
 */

public class DoubleKey {
	/**
	 * The main method where array is inisiliazed in ascending order and print out
	 * Then array is shuffled and print out in random order.
	 * Afterward the array is sorted and print out in ascending order.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// inisiliaze array and print it out
		int str[] = {1,2,3,4,5,6,7,7,7,7,8,8,9,10,11,12,13,14,15,15,16,17,18,18,19,20,20,21,22,22,22,22,23};
		System.out.println("My array is: ");
		for(int i = 0; i < str.length; i++){
			System.out.print(str[i] + " ");
		}
		System.out.println();
		DoubleKey dk = new DoubleKey();
		//shuffle the array and print it out
		dk.shuffle(str);
		System.out.println("Array after shuffling:");
		for(int i = 0; i < str.length; i++){
			System.out.print(str[i] + " ");
		}
		System.out.println();
		//sort the array and print it out
		dk.sort(str, 0, str.length - 1);
		System.out.println("Array after sorting with double key:");
		for(int i = 0; i < str.length; i++){
			System.out.print(str[i] + " ");
		}
		System.out.println();

	}
	
	public void sort(int[] a, int lo, int hi){
		if(hi <= lo) return;
		int lt = lo, gt = hi;
		int v = a[lo];
		int i = lo;
		while(i <= gt){
			int cmp = compareTo(a[i],v);
			if(cmp < 0) exch(a, lt++, i++);
			else if (cmp > 0) exch(a, i, gt--);
			else i++;
		}
		sort(a, lo, lt - 1);
		sort(a, gt +1, hi);
	}
	private int compareTo(int a, int b){
		if(a < b) return 1;
		else if (a > b) return -1;
		else return 0;
	}
	
	private void exch(int[] a, int b, int c){
		int swop = a[b];
		a[b] = a[c];
		a[c] = swop;
	}
	
	public void shuffle(int[] a){
		int N = a.length;
		for(int i = 0; i< N; i++){
			int r = uniform(i +1);
			exch(a,i, r);
		}
	}
	
	private int uniform(int N) {
		 Random rand = new Random();
		 if (N <= 0) throw new IllegalArgumentException("Parameter N must be positive");
		 int randomNum = rand.nextInt(N);
       return randomNum;
   }
	
}
