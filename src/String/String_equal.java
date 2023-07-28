package String;

public class String_equal {

	public static void main(String[] args) {
		
		String S1=new String("Java"); // heap memory
		String S2=new String("Java");  // heap memory
		
		String S3 ="Java";//scp
		String S4="JAva";  //scp
		
		System.out.println(S1==S2); //false = Always compare ref comparison/address comparison
		System.out.println(S1.equals(S2)); //true = content comparison
		
		System.out.println(S3==S4);//false
		System.out.println(S3.equals(S4)); //False
		System.out.println(S1.equals(S3));  //true =only content
	}
}
