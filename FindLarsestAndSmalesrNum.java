package most.frequenct.ask.program;

public class FindLarsestAndSmalesrNum {
	public static void main(String[] args) {
		int[] arr = {-101 ,876654,11, 4, 6,1,2,1, 4, 7, 8, 9, 11, 4, 343, 21, 221 };
		int maxnum = arr[0];
		int minnum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (maxnum < arr[i]) {
				maxnum = arr[i];
			}

			else if (minnum > arr[i]) {
				minnum = arr[i];

			}

		}
System.out.println("the largest num is:"+maxnum+",The smalest number is:"+minnum);
	}
}
