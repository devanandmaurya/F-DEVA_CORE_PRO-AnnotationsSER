package specialprogram.array;

public class FindMaximumvalueinlist {

	public static void main(String[] args) {

		int a[] = { 4, 102, 6, 8, 9, 12, 40 };

		int max = a[0];
		for (int i = 0; i < a.length; i++) {

			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("max element is " + max);
	}
}
