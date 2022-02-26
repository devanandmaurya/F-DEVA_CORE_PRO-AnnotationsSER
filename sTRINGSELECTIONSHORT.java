package specialprogram;

public class sTRINGSELECTIONSHORT {
	public static void main(String[] args) {

		// selection short is searching and sorting ka combine hota hai
		// it first check list no. and interchange position .
		// again check the list no , and interchange position .
		// this is faster than bubble short.

		int min;
		String temp = "";

		String [] a = { "ram", "soni", "anand","vijay","dev"};
		for (int i = 0; i < a.length; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].compareTo ( a[min])<0) {
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}
	}
}
