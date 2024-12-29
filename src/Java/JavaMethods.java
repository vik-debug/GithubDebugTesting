package Java;

public class JavaMethods {

	public static void main(String[] args) {

		JavaMethods d=new JavaMethods();
		String name=d.getData();
		System.out.println(name);
		JavaMethod2 d1=new JavaMethod2();
		d1.getUserData();
	}

	public String getData() {
		System.out.println("hello world");
		return "biki plz";
	}
}
