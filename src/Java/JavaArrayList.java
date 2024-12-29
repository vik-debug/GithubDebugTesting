package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrayList {

	public static void main(String[] args) {

		//simple array 
		String [] arr= {"nikhil","darshan","shubham","bicky"};
		
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("rahul");
		a.add("shetty");
		a.add("randcha");
		a.remove(2);
		a.add("winner winner chicken dinner");
		System.out.println(a.get(2));
		
		//array list we can't use length we use size();
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("*****");
		//enhance for loop
		for(String name:a) {
			
			System.out.println(name);
		}
		boolean verify = a.contains("shetty");
		System.out.println(verify);
		
		//convert array to arraylist and utilised in program
		List<String> arrConvertToArrayList = Arrays.asList(arr);
		System.out.println(arrConvertToArrayList.contains("bicky"));
		System.out.println(arrConvertToArrayList); 
	}
	

}
