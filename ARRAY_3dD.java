package ARRAY.COM;

public class ARRAY_3dD {
	public static void main(String[] args) {
		
		int[][][] a = 
			{{ { 12, 32, 4, 3 }, { 43, 76, 67 }, { 76, 87, 7, 6 } } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++)

				System.out.print(" " + a[i][j][k]);
 
				System.out.println();
			}
			System.out.println(">>>>>>>");
			System.out.println(a[0][0].length);
			System.out.println(a[0][1].hashCode());

			System.out.println(a[0][1].length);

			System.out.println(a[0][2].length);

			// System.out.println(a[1][1].length);

		}
	}
}
/*
 * declration >> int [][][]a;
 * 
 * creation >> a=new omt [2][][]; a [0]= new int [2][]; a [0][0]= new int [3]; a
 * [0][1]= new int [2]; a[1]=new =int [2][]; a[1][0]=new int [2]; int [1][1]=new
 * int [3]; these are three d array ;
 * 
 * Declaration and creation in single line as
 * 
 * int [][] []a= new int [2][3][2];//creation,deceleration
 * 
 * a[0][0][0][0]=49; a[0][1][1]=54;
 * 
 * 
 * a[0][0]=12; it is wrong for three d
 * 
 * 
 * for single line >>>>>>>>>>>>>
 * 
 * int [][][] a= {{{12,32,4,3},{43,76,67},{76,87,7,6}}};
 */