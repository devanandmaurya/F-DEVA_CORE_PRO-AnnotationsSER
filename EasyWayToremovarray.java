package most.frequenct.ask.program;

import java.util.Arrays;

public class EasyWayToremovarray {  
	public static void main(String[] args) {
		int[] a1 = { 1, 54, 11, 54, 6, 1, 2, 1, 4, 7, 8, 9, 11, 4, 3, 21, 21, 9 };
		System.out.println("original array element is ::");
		for (int element1 : a1) {
			System.out.print(" "+element1);
		}
		int a2[] = Arrays
				.stream(a1).distinct().toArray();
		System.out.println("After Remove dublicate elements list is:");
		System.out.println();
		for (int element2 : a2) {
			System.out.print(" "+element2);

		}
	}
}
