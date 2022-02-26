package specialprogram.array;

import java.util.Iterator;
import java.util.Scanner;

public class secondLargestelementinlist {

//	public secondLargestelementinlist() {
//		System.out.println("to find second largest number in a list");
//		
//	}
	public static void main(String[] args) {

		int n, max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements ::");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++)

			{
				if (arr[i] > arr[j]) {
					max = arr[i];
					arr[i] = arr[j];
					arr[j] = max;
		//	sc.close();
				}

			}
		}
		System.out.println("Array element AFTER SORTINGsecond larjest number of arrray is ::" + arr[n - 2]);

		for (int p = 0; p < n; p++)
			System.out.print(" " + arr[p]);
		System.out.println();
		System.out.println("second larjest number of arrray is ::" + arr[n - 2]);

	}
}
