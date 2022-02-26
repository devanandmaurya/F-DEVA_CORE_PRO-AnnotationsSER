package com.search;
public class linearsearch_string {
	public static void main(String[] args) {
		String[] a = { "Sumit","Neha","sagar","Amit" };
		String item ="Amit";
		int t=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] .equals(item)) {
			System.out.println("The item is  position " + i + " index : and item is::"+item);
			t=t+1;
			}
		}
	if(t==0) {
		System.out.println("item not found");
	}
	}
}