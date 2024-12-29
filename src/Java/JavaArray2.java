package Java;

public class JavaArray2 {

	public static void main(String[] args) {

		int [] arr= {1,2,3,4,5,6,7,8,9,10,11};
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
				//break;
			}else {
				System.out.println("its not multiple of 2: "+arr[i]);
			}
		}
	}

}
