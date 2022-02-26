package ARRAY.COM;

public class FourwayArrayPrint {

	public static void main(String[] args) {
		System.out.println("first way. as normal for loop..");
		int[] a = { 10, 32, 43 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("second way is that is for each loop :");

		for (int j : a) { // for each loop

			System.out.println(j);
		}

		System.out.println("using while loop");
		int i = 0;
		while (i < a.length) // by while loops
		{
			System.out.println(a[i]);
			i++;
		}

		System.out.println("by using do while loop");
		int j = 0;
		do {

			System.out.println(a[j]);
			j++;
		} while (j < a.length);

	}
}
