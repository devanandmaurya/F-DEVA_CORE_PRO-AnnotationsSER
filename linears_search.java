package com.search;
import java.util.ArrayList;
public class linears_search {
//find dublicate element from array lis
	public static void main(String[] args) {
		int[] a = {12, 54, 7, 68, 7, 8, 8, 76 };
		int item = 7;
		int t = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == item) {
				System.out.println("The item is  position: " + i + " index");
				t = t + 1;
			}
           }
		if (t == 0) {
			System.out.println("item not found");
		}
	}
}