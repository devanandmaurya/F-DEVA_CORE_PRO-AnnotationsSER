/*package specialprogram;

public class quickshort {
	public static void main(String[] args) {

		int[] a = { 12, 32, 4, 5, 6, 7, 6, 98, 7 };
		int len = a.length;

		quickshort q = new quickshort();
		q.quik(a, 0, len - 1);
		// q.partion(a);
		q.printArray(a);

	}

	void partion(int a[], int low, int high) {
		int pivot = a[(low + high) / 2];
		while (low <= high) {
			while (a[low] < pivot) {
				low++;
			}
			while (a[high] > pivot) {
				high--;
			}
			if (low <= high) {
				int temp = a[low];
				a[low] = a[high];
				a[high] = temp;
				low++;
				high--;

			}
		
		return low;

	void quik(int[] a, int low, int high);

	{
		int pi =partion(a, low, high);
	if(low<pi-1)
	{
		quik(a,low, pi-1)
	}
if(pi<high)
{
	quik(a, pi, high);
}

void printArray (int []a)
{
	for (int i  :a)
}
	}
}
*/