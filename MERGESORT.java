/*package specialprogram;

// it is one of the most technique and widely used
// merge sort is that which
// the time complexity compare that selection sort and bubble and insertion sort
// its good for sorting
// like T(n)= [2T(n/2)+n]
// it work divide and conquer rule
// Divide the unsorted list into n sublist each containing 1 element .
// it take adjacent pairs of two singleton lists and merge them to from a list
// of 2 elements /
// n will converted into n/2 list of size
// repeat this process until complete merge process.
// it merge as ascending or decesndig order

// 48 36 13 53 19 94 20

// [48 36 13] [ 52 19 94 20 ]

// [ 48] [36, 13] and [52, 19 ] [94,, 20]
// [48] [36] [13] and [52][19] [94][20]

// now ascending and descending merging start here compare one by one

public class MERGESORT {

	int[] array;
	int[] tempmerge;
	int length;
	private int lowerindex1;

	public static void main(String[] args) {
		int[] input = { 48, 36, 13, 52, 19, 21 };
		MERGESORT ms = new MERGESORT();
		ms.sort(input);
		for (int i : input) {
			System.out.println(i + "");
		}
	}

	public void sort(int input[]) {
		this.array = input;
		this.length = inputa.length;
		this.tempmergar = new int[length];
		devideAr(0, length - 1);
	}

	public void devideAr(int lowerindex, int higherindex) {
		if (lowerindex < higherindex) {

			int middle = lowerindex + (higherindex - lowerindex) / 2;

			devideAr(lowerindex, middle); // it will sort left side of array
			devideAr(middle + 1, higherindex); // it will short right side of array .
			merg(int lowerindex, int middle, int higherindex)
		}
	}

	public void merg(int lowerindex, int middle, int higherindex) {
		for (int i = lowerindex; i < higherindex; i++)
			tempmergar[i] = array[i];
	}

	int i = lowerindex1;
	private int middle;
	int j = middle + 1;
	int k= higherindex ;
	while(i<middle&&j<=higherindex1)
	{
		if (tempmergar[i] <= tempmergar[i]) {
			array[k] = tempmergar[i];
			i++;
		} else {
			array[k] = tempmergar[i];
			j++;
		}
		k++;

	}

	while(i<=middle)
	{
		int[] tempmerge;
		array[k] = tempmerge[i];

	}
}
}
*/