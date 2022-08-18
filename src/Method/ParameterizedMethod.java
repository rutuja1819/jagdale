package Method;

public class ParameterizedMethod {

	public static void main(String[] args) {
		
		ParameterizedMethod p=new ParameterizedMethod();
		p.add(10,30);
		System.out.println("========================");
		
		sub(100,50,25);
		

	}

	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
		
	}
	
	public static void sub(int m,int n,int c)
	{
		int sub=m-n-c;
		System.out.println(sub);
	}
}
