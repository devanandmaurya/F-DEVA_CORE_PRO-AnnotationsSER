package specialprogram;

public class StringInsertionShort {

	public static void main(String[] args) {

		// insertion short is just like play card as a position it is good for small
		// list
		// it provide good position as a sorted list 5 53 6 2 2 1
		// after convert it is 1 2 2 5 6 53 
	String  temp ="" ;
		int j;
		String [] a = { "Ameen brother",  "jitendra", "ram", "soni", "anand","vijay","dev"};
	//	int[] a = { 34, 3, 2, 5, 2, 5, 1, 87, 76 };
		for (int i = 0; i < a.length; i++) {
			temp = a[i];
			j = i;
			while (j > 0 && a[j - 1].compareTo (temp)>0) {
				a[j] = a[j - 1];
				j = j - 1;
			}
			a[j] = temp;
		}
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}
	}
}