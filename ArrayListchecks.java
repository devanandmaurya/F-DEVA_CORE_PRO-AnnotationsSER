package ARRAY.COM;

public class ArrayListchecks {
public static void main(String[] args) {
	
	int a[]=new int[3];
//	int []b= new int [-3]; //Exception in thread "main" java.lang.NegativeArraySizeExep
	//it is unchecked exception at run time exception
	a[0]=1;
	a[1]=2;
	a[2]=5;
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println(); //for new line v check
		System.out.print("The value is:: "+a[i]);
		System.out.println();
	}
	
	
}
}


