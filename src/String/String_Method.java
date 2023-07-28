package String;

public class String_Method {
public static void main(String[] args) {
	
	//1. CharAt  methos/functions = it return char value for particular/specified index
		String S1="Sampada";
		String S2=new String("Sampada");
		
		System.out.println(S1.charAt(5));
		//System.out.println(S1.charAt(8));//String index out of bound
	//	System.out.println(S1.charAt(-4));  //String index out of bound
		
		//2. lenght(); = it retuns length/size
		
		System.out.println(S1.length());
		
		// 3. .equals = it check the quLITY Of string with given object 
		//content check only
		
		System.out.println(S1==S2);//false
		System.out.println(S1.equals(S2));  //true
		
		//4. isempty = to check whether the string is empty or not
		String S3 = "Sampada";
		System.out.println(S3.isEmpty());  //false
		String S31="";
		System.out.println("Empty="+S31.isEmpty());//true
		
		//5. replace = only char replace
		System.out.println(S3.replace('a', 'b'));  //Sbmpbdb
		
		String S32="Automation";
		System.out.println("replace="+S32.replace('o','n')); 
		
		//6. ReplaceAll = Replace complete word
		String S4="Java Ruby Python";
		System.out.println(S4.replaceAll("Java","Automation"));  // Automation Ruby Python
		
		//7.Substring = it return substring for given string
		//  0   1 2 3  4 5 6 7 8 9 10 11 12 13 14 15
		 // v   e l o  c i t y   c l a  s   s  e  s
	     String S5="Velocity Classes";
	     System.out.println(S5.substring(4,8));  //City -4,5,6,7
	     System.out.println(S5.substring(2));  //locity Classes
	     System.out.println(S5.substring(9,16));  //classes= 8
	     System.out.println(S5.substring(6,11));  //tycl
	     System.out.println(S5.substring(0,3));
	     
	     //8. Index of char= to find index of character
	    //  0 1 2 3 4 5 6
	     // S a m p a d a
	     
	     String S6 ="Sampada";
	     System.out.println(S6.indexOf('a')); //1
	     System.out.println(S6.indexOf('a',S6.indexOf('a')+1));  //4
	     System.out.println(S6.indexOf('a',S6.indexOf('a',S6.indexOf('a')+1)+1));  //6
	     
	     String S61="Automation";
	     System.out.println("Index of O = "+S61.indexOf('o'));
	     System.out.println("Index of O = "+S61.indexOf('o',S61.indexOf('o')+1));  //8
	     
	     
	     //9 LastIndexOf
	     
	     String S7 = "Python";
	     System.out.println(S7.lastIndexOf('n'));   //5
	     
	     
	     //10. ToLowerCase()

	     String S8="SAMPADA";
	     System.out.println(S8.toLowerCase());  //sampada
	     
	     //11. ToUpperCase
	     
	     String S9="sampada";
	     System.out.println(S9.toUpperCase());  //SAMPADA
	     
	     //12.Trim = Remove starting & ending space
	     
	     String S10="    Ruby Java Python         ";
	   //  System.out.println(S10);
	     System.out.println(S10.trim());
	     
	     //13.Split 
	     
	     String S11="hello welcome java Automation";
	     String S12[]=S11.split(" ");
	     
	     for(int i =0;i<S12.length;i++) {
	    	 System.out.println(S12[i]);
	     }
	     
	     String Date = "5-4-2023";
	     String Date1[]=Date.split("-");
	     for(int j =0;j<Date1.length;j++) {
	    	 System.out.println(Date1[j]);
	     }
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
		
}
	
	
}
