package specialprogram;

public class BobbleShort {
	public static void main(String[] args) {
		int temp;
		int[] a = { 12, 34, 65, 78, 21, 43, 1, 4 };
		{
			System.out.println("the bouble short is ");
			for (int i = 0; i < a.length; i++) {
				int flag = 0;
				for (int j = 0; j < a.length - 1 - i; j++) {
					if (a[j] > a[j + 1]) {
						temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
						flag = 1;
					}
				}

				if (flag == 0) {
					break;
				}
			}
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}

		}
	}
}
