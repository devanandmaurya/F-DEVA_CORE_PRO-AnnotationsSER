package specialprogram.array;

public class Minumumelementfindinlist {

	public static void main(String[] args) {

/*		int a[] = { 54, 987, 87, 14, 102, 6, 8, 9, 12, 40 };

		int min = a[0];
		for (int i = 0; i < a.length; i++) {

			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("The min  element is " + min);
	}
}
*/
		
		int a[] = { 54, 987, 87, 14, 102, 6, 8, 9, 12, 40 };

		int max = a[0];
		for (int i = 0; i < a.length; i++) {

			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("The max  element is " + max);
	}
}
