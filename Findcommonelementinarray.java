package most.frequenct.ask.program;

public class Findcommonelementinarray {
	public static void main(String[] args) {
		int[] arr1 = { -101, 54, 11, 4, 6, 1, 2, 1, 4, 7, 8, 9, 11, 4, 3, 21, 221 };
		int[] arr2 = { -101, 11, 4, 7, 8, 9, 11, 4, 3, 21, 22 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(" " +arr1[i]);
					break;

				}

			}
		}
	}
}
