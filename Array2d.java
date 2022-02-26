package ARRAY.COM;

public class Array2d {
public static void main(String[] args) {
	


int [][]a= {{12,43,5,3},{32,65,75,65}, {12,2,12}};  

for (int i=0;i<a.length;i++) 
	///note it is never write <=
	//as for(int i=0;i<=a.length;i++) 
	//then array index out of bonds 
{
	for(int j=0; j<a[i].length;j++)
		System.out.print(" "+a[i][j]);
	System.out.println();
}

System.out.println(">>>>>>>>>>>>>>DEV>>>>>>>>++++++++++");
System.out .print(a); // it print [[ I @ that is print 2 d array address
System.out .println(a[0]);  //it print [[I @  that is print index position 

System.out .println(a[0][0]); //print 12 index value
System.out.println(a.length);
System.out.println(a[0].length);
//System.out.println(a[0][1].length); // error shows

System.out.println(a[2].length);
System.out.println(a[0][3]);
System.out.println(a[0].length);
}
}
