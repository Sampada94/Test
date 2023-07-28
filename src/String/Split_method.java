package String;

public class Split_method {

	public static void main(String[] args) {
	 String S1= "Automation/java/Python/Manual";
	 String S2[] =S1.split("/");
	 
	 for(int i=0;i<S2.length;i++) {
		 System.out.println(S2[i]);
	 }
	 //it cone the specified string
	 String S3 = "Java";
	 String S4="Ruby";
	 int a= 10;
	 int b = 20;
	 
	 System.out.println(S3+S4);  //javaRuby
	 System.out.println(a+b);  //30
	 System.out.println(S3+S4+a+b);  //javaRuby1020 javaRuby+10
	 
	 System.out.println(a+b+S3+S4);  //30JavaRuby  //10+20+
	 
		//indexof char
	 String S5 = "Velocity class";
		System.out.println(S5.indexOf('c'));  //1st occurance
		
		System.out.println(S5.indexOf('c',S5.indexOf('c')+1));  //2nd occurance
		
		//substring
		System.out.println(S5.substring(4,8));
		
		//replace
		System.out.println(S5.replace('c', 'w'));
		
		
		
		String S7="Sampada";
		String S8="sampada";  //scp
		String S9 = new String("Sampada");  //heap
		
		
		System.out.println(S7.equals(S8)); //false
		
		System.out.println(S7==S9); //false
		
		System.out.println(S7.equals(S9)); //true
	 }


	
	
	
}
