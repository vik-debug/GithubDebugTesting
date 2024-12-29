package Java;

public class JavaString {

	public static void main(String[] args) {

		//string literal //string is object used to represent set of charector
		//String s="bicky plz";
		String s1="bicky plz bhai";
		String s2="hello";
		
		//new
		String s3=new String("welcome");
		String s4=new String("welcome");
		
		//String[] splitingString = s1.split("plz");
		String[] splitingString = s1.split(" ");
		System.out.println(splitingString[0]);
		System.out.println(splitingString[1]);
		System.out.println(splitingString[2]);
		
//		for(int i=0;i<s1.length();i++) {
//			System.out.println(s1.charAt(i));
//		}
		
		//reverse string
		for (int i=s1.length()-1;i>=0;i--) {
			System.out.println(s1.charAt(i));
		}
	}
	

}
