package Java;

public class JavaBrushupArray {

	public static void main(String[] args) {

		//array one way 
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		//array 2nd way
		int[] arr2= {1,2,3,4,5,23,46};
		System.out.println(arr2[3]);
		System.out.println(arr[2]);
		
		//how to print all value by using for loop
		            //i<5
		for(int i=0;i<5;i++) { 
			System.out.print(arr[i]);
		}
		
		for(int j=0;j<arr2.length;j++) {
			System.out.println(arr2[j]);
		}
		
		//how to print string array
		String [] name= {"nikhil","darshan","shubham","bicky"};
		
		//for each loop
		for(String each:name) {
			
			System.out.println(each);

		}
	}

}
