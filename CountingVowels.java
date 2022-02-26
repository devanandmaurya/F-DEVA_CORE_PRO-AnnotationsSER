package ARRAY.COM;
import java.util.ArrayList;
public class CountingVowels 
{
     ArrayList al;  
// Declare a constructor for creating and assigning values to the ArrayList al.  
    CountingVowels()  
    {  
	  al = new ArrayList();  // Creating ArrayList object.
  // Adding elements in ArrayList.
	 al.add('A'); al.add('E');  
	 al.add('a'); al.add('e');  
	 al.add('I'); al.add('O');  
	 al.add('i'); al.add('o');  
	 al.add('U'); al.add('u');  
    }
// Declare a method that will check whether the character c is a vowel or not.     
    private boolean isVowel(char c)  
    {  
      for(int i = 0; i < al.size(); i++)  
      {  
       // if(c == al.get(i))  
        {  
           return true;  
         }  
       }  
      return false;  
    }  
// Declare a method that will calculate vowels in the given String str.  
    public int countVowels(String str)  
    {  
      int countVowel = 0; // storing total number of vowels.  
      int size = str.length(); // size or length of string.  
      for(int j = 0; j < size; j++)  
      {  
        char c = str.charAt(j);  
        if(isVowel(c))  
        {  
     // If a vowel is found!, increase the count by 1.  
          countVowel = countVowel + 1;  
         }  
       }  
      return countVowel;  
    }    
public static void main(String[] args) 
{
// Create an object of class CountingVowels.  
     CountingVowels cv = new CountingVowels();  
     String s = "Scientech Easy is a great site to learn Java programming.";    
     int noOfVowel = cv.countVowels(s);  
	  
     System.out.println("Given string: " + s);  
     System.out.println("Total number of vowels in the given string: "+ noOfVowel + "\n");    
   
     s = "Every person loves his country";
     System.out.println("Given string: " +s);
     noOfVowel = cv.countVowels(s);
     System.out.println("Total number of vowels in the given string: " +noOfVowel);
  } 
}