    package ARRAY.COM;

    public class Retrivearrayvalues {
	public static void main(String[] args) {

		// ++++++++++++++RETRIVE ARRAY VALUESS by two ways by for loop and for each loop

		int[] a = { 12, 32, 43, 4 };
		// for (int i=0; i<a.length;i++)
		for (int i : a) {
		System.out.print("\t:"+i);
     
		// System.out.print(a[ i ]);
		}
	}
}

/// by for each loop
// for(datatype valuename : array /collection)
// for each loop me System.out.print(a[ i ]); yah wrong hoga AARAY INDEX OUT OF
// BOND AAYEGA es case me ye for loop sahi hoga // for (int i=0; i<a.length;i++)

// for (int i :a) {System.out.println(i); 
    //RIGHT HOGA BECUASE VALUENAME PRINT
// KARTE HAI.
  