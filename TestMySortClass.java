package quicksort;

public class TestMySortClass {
	
	public static void main(String[] args) {
		// 
		String str[] = {"A","Z", "K", "I", "M", "T", "Y", "B", "P", "U", "O", "Q", "S", "N", 
				"X", "D", "G", "V", "J", "H", "F", "W", "L", "R", "E", "A", "C", "Z"};
		for(int i = 0; i< str.length; i++){
			System.out.print(str[i] + ", ");
		}
		System.out.println();
		MySort ms = new MySort(str);
		System.out.println(ms);
	}

}
