package String;

public class String_memory_Storage1 {
public static void main(String[] args) {
	
	//by using String Literal
	//syntax = String Refvariablename = "name";
	
	String S1="Sampada";   // stored in SCP-string constant pool
	String S2 ="Ghadashi";  // stored in SCP
	String S7="Sampada";
	
	//by using new keyword
	//syntax = String Refvariablename = new String("Name");
	
	String S3=new String("Sampada");   //heap memory
	String S4=new String("Ghadashi");   //heap memory
	String S5=new String("Automation");  //heap memory
	String S6=new String("Automation");
	String S8 = new String("Sampada");
	
	
	System.out.println(S1==S2); //false
	System.out.println(S1==S3);  //False = S1 in scp & S3 in heap memory
	System.out.println(S3==S4);//False
	System.out.println(S4==S5);  //False
	
	System.out.println(S5 == S6);  //False   // referal operator
	
	System.out.println(S1 == S7);  // True = SCP memory 
	
	System.out.println(S8==S3); ////False =in heap memory
	

}

}
