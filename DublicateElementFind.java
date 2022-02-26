package most.frequenct.ask.program;

import java.util.HashSet;
import java.util.Set;

public class DublicateElementFind {
	public static void main(String[] args) {
		int[] arr = { 11, 4, 6, 4, 7, 8, 9, 11, 4, 343, 21, 221 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("dublicate element found as ::->" + arr[i]);
				}
			}
		}
		System.out.println("*****another way****");
		int[] arry = { 11, 4, 6, 4, 7, 8, 9, 11, 4 };
		Set<Integer> dubliSet = new HashSet<>();
		for (Integer numInteger : arry) {
			if (dubliSet.add(numInteger)) {
				System.out.println("dubli element found as:->:" + numInteger);

			}

		}
	}
    }
