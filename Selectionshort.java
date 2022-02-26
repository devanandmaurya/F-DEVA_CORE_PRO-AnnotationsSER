package specialprogram;

public class Selectionshort {
	public static void main(String[] args) {

		// selection short is searching and sorting ka combine hota hai
		// it first check list no. and interchange position .
		// again check the list no , and interchange position .
		// this is faster than bubble short.

		int min;
		int temp = 0;

		int[] a = { 12, 43, 43, 4, 5 };
		for (int i = 0; i < a.length; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
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
