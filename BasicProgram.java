/*package ARRAY.COM;

public class BasicProgram {
public static void main(String[] args) {
	//int []b= new int [-3];
	 * //Exception in thread "main" java.lang.NegativeArraySizeException
	///System.out.println(bv);
	int []bv= new int [0];//
	System.out.println(bv);
	System.out.println(" COMPILE THE FINE IN CASE ZERO read all this comment");
}

@Override
public String toString() {
	return "BasicProgram []";
}
}

int empid=101;
int empid=102;
int empid=1013;
int empid=1014;
int empid=1015;
int empid=1016;
.
.
.
.
.thousands employee then data store and take
 memory that why we array


ARRAY IS A COLLECTION OF HOMOGENIOUS DATA TYPE.
WE CAN ACESS  THE VALUE OF ARRAY BY INDEX POSSITION.
ARRAY INDEX VALUE START FROM 0 POSITIONS.
VALUE STORE AS SIZE -1;
// IN JAVA ARRAY IS AN OBJECT
ITS SUPER CLASS IS PREDEFIND AS  OBJECT CLASS
  ARRAY MEMORY OCCUPY IN HEAP MEMORY area,ME HE DATA 
STORE HOTA HAI that is all object store in heap area.

//THE ARRAY ADVANTAGE IS TO STORE SAME TYPE DATA.
//IT IS FAST CAMPARE TO PRIMITIVE DATA TYPE. BECUSAE
 *  PRIMITIVE ME INTERNAL CONVERSION HOTA HAI WITH WRAPPER 
 *  CLASS SE.

//DISADVANTAGE IS WE CAN NOT INCREASE ITS SIZE 
 * AND MEMORY MAY BE BEST 
// WE CAN STORE ONLY SIMILAR DATA TYPE,
AS 
int emp_ID[]=new int[1000];  //array deceleration

String empname[]=new String [122] ;

//we can store object directly into array,
//if we remove any element from array then
 *  we have to transerve the array. ig shift the array 


          ==================
        		  ONE Darray
        		  >>>>>>>>>>>>>>>
        		  
        		  type of array ..>> 
        		  
        		  single d array 
        		  
        		under this single row or single column  
        		
        		multiple dimes>> under this multiple row and column hota hai,
        		
       Declaration of an array-->>>
       
       int a ; String b;
       
       int a[];
       int []a;
       int a [];
       int[]a;
       String b[];
       String []b;???????????? 
        >>>>>>>>>more used  String is type and b is array name
          ig b is one d array of string types
    		   String [2]a; WRONG HAI
       String[]b;
       String [] a;
       
       AT THE TIME OF ARRAY DECRATION WE CAN NOT INITLIZED
        ARRAY SIZE but at the creation time array 
        size must be decide,
       NOTE---
       int []a,b;
       int []a,b;
       int a [], b; >>>>>>>wrong hai yaha b jo ek simple
        varible so kar rha ahi. beause [], ke bad varible mana jata hai but int a,b [] right h
       
       
       _____+++++++++++++++++
       AARAY DECLERATION>>>>>>>>>. int []a; 
       arrary declration >>>>>>> a= new int [3];
       
       Array decration and creation in single line 
        int [] a= new [5];
       
       
       // ARRAY SIZE MAY BE ZERO ITS COMPILE AND RUN BUT
        *  ARRAY MAY NOT BE NEGATIVE SIZE
       
       int []a= new int [o];
       int []b= new int[-3]; java .lang negative array size exp.
       
       A
        
        
        ++++++++++ INITILIZATION 
        INT []A= NEW INT [3];// here create an array with size
          index 0,1,2 and all index initialized  with zero values
        A[0]=10;//as soon as when we initlized value then 
        its place zero will be changes 10 ,
        A[1]=32;..> change 0 to 32
        A[2]=43;> change 0 to 43
        A[3]=32;>>>>>  ARRAY INDEX OUT OF BOUND EXPTION
         DUE TO INDEX SIZE IS ZERO TO 2 (N-1)
        
        
        WE CAN USE DECLERAION INITIALIZTION  CREATION AS A SINGLE LINE 
        
        int []a= {12,32,54}; >>> here size not
         required provide size here by default value 
         does not initilize from zero 
        eg it size is 3;
        
        int [] a= new int [] {23,34,544,55} ; also RIGHT 
        
        
        ++++++++++++++RETRIVE ARRAY VALUESS
        
        int []a={12,32,43,4}
        for (int i=0; i<a.length;i++)
        {
        System.out.println(a[i]);
        }
       

        ################2D Arry
        
        int []a,b; here a and b both are one d array;
        int a[],b; here a is 1 d array and b is varible.as int type
        
        int [][] a ;>>>>>>>>>> 2d declere
        ++++++++++++++
        
        int [][]a,b;  here a and b both are 2d array;
        int [] a []b; a is 2d array and b is one d array;
        int[] a[],b[]; a is 2d and b also
        
        int [][]a,b[]; here a is 2d and b is 3d aaray hai
        int [][]a,[]b; compile time eerore
        
        
        ++++++creation ++++++
        
        int [][]a= new int[2][3]; here 2 rows and 3
         colmons  0,0, /0,1,/0,2 and 1,0,/1,1/,1,2  are index position.
        
        
        NOTE IF NO OF ROWS AND COLUMNS ARE SAME THEN IT CALLEDS MATRIX ARRAY
        AS LIKE int[][] a= new int[2][2];
        
        
        
        ZACKED ARRAY--> IF NO OF COLUMN ARE NOT SAME THEN IT CALLED JACKED ARRAY.
        UNDER THIS NO OF ROWS ARE DECLERED TIME INITILIZED AND COLUMN IS NOT INITLIZED AS 
        int [][] a= new int [2] [];
        a[0]= new int [3];
         int [1]= new int [2];
         
         +++++++++++++
         INILTIZATION 2D ARRAY>>>>>>>>>>
         int [][]a; (Declare)
         a = new int [2][3];
         
         a[0][0]=10;
         a[1][1]=20;
         
         a[1][2]=43;


in single line a\write 


int [] [] a= {{10,21,32},{43,54,566}}; 
 >>>>>>>2d array declaration creation initialization for matrix array
         
         
         
         FOR ZACKED ARRAY>>>>>>>>>>>>>>>>>>>>
         
         INT [][]a;
		 a= new [2][];
		
		
		a[0] = new int [28];
		a[1]= new int [4];
		
         
for initializations  as >>>>>>>
a[0][0]=32;
a[1][2]=343;
		
		int [][]a= {{12,32,332},{23,43,4,3,53,5,3}}; 
		?>>>>> this is jacked array
				
         
        
        */


/*
int [][]a= {{12,43,5,3},{32,65,75,65}, {12,2,12}};      
System.out .println(a); // it print [[ I @ that is print 2 d array addredss
System.out .println(a[0]);  //it print [[I @  thate is print index position 

System.out .println(a[0][0]); // print 12 index value


*/
