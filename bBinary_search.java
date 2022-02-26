package com.search;
public class bBinary_search {
	public static void main(String[] args) {
		int a[] = { 13, 3, 5, 7, 8, 9, 12 };
		// Sorteled element ka he binary search kar sakte hai
		int src = 3;
		int li = 0;
		int hi = a.length - 1;
		int mi = (li + hi) / 2;
		while (li <= hi) {
			if (a[mi] == src) {
				System.out.println("Element is at " + mi + " Index possition ");
				break;
			} 
			else if (a[mi] < src) {
				li = mi + 1;
                }
			else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
			if (li > hi) {
				System.out.println("Element is not found");
				}
		}
	}
}