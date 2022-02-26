package ARRAY.COM;

public class Findarrayminno {
	public static void main(String args[]) {

		int a[]= {1,1,2, 7,3,5,6,7};
		  System.out.println("Elements are by bute force methode::"); 
		  
		  int j=0;
		  do {
			System.out.println(a[j]);
			j++;
		} while (j<a.length);

	int aj[]= {11,1,2, 7,3,5,6,7};
	System.out.println("The element is " );
	for (int i = 0; i < aj.length; i++) {
		for (int k = i+1; k < aj.length; k++) {
			if(a[i]==a[k] && i!=j)
			{
				System.out.println(aj[k]);
			}
		
		
	}
}
}
}