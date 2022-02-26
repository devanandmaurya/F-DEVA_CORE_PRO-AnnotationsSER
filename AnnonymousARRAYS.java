package ARRAY.COM;

public class AnnonymousARRAYS {

	public static void main(String[] args) {

		// THE ARRAY WHIC HHAVE NO NAME IS CALLED ANNONYMOUS ARRAY

		// int [] a = new int [] {12,43,44};
		// the annnoymous is >> new int [] {12,43,65,76};
		// new int [] {43,76,76};
		// it can be single or multidimenseionan;
		// it can be used as an argument in a method ,
		// it can be used one time only

		AnnonymousARRAYS.sum(new int[] { 12, 87, 87 });
	}

	static void sum(int n[]) {
		int total = 0;
		for (int i : n) {
			total = total + i;

		}
		System.out.println("The sume is :" + total);
	}

}
