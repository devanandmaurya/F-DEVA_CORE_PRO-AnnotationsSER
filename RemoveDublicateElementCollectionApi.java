package most.frequenct.ask.program;

import java.util.HashSet;
import java.util.Set;

public class RemoveDublicateElementCollectionApi {
	public static void main(String[] args) {
		int[] a1 = { -101, 54, 11, 4, 6, 1, 2, 1, 4, 7, 8, 9, 11, 4, 3, 21, 221 };
		Integer[] a2 = removeDublicateUsingSe(a1);
		System.out.println("orginal array :::");
		for (int element : a1) {
			System.out.print(" " + element);
		}
		System.out.println("after remove dublicate element remove array::");
		for (int element : a2) {
			System.out.print(" " + element);
		}
	}

	// METHOD TO REMOVE DUBLICATE ELEMENT FROM AN ARRAY
	public static Integer[] removeDublicateUsingSe(int[] input) {
		Set<Integer> set = new HashSet<>();
		for (int element : input) {
			set.add(element);
		}
		Integer[] a2 = set.toArray(new Integer[set.size()]);
		return a2;
	}
}
