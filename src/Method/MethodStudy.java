package Method;

public class MethodStudy {

	public static void main(String[] args) {
	
     test();  //calling static method from same class
     
     MethodStudy m=new MethodStudy();
     m.test1();

	}

	public static void test()  //static method
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	
	public void test1()   //non static
	{
		int a=300;
	int b=20;
	int sub=a-b;
	System.out.println(sub);
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

