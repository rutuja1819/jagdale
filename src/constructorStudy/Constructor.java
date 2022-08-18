package constructorStudy;

public class Constructor {

	int a;
	int b;
	String name;
	char c;
	
	public Constructor(int a1,int b1)
	{
		a=a1;
		b=b1;
		
	}
	
	public Constructor(String s1)
	{
		name=s1;
	}
	
	public Constructor(String s1, char c1, int a1)
	{
		name=s1;
		c=c1;
		a=a1;
	}
	public static void main(String[] args) {
		
		Constructor c=new Constructor(10,30);
				c.add();
				
		Constructor c1=new Constructor("Rutuja");
		c1.test();
		
		Constructor c2=new Constructor("Rutu",'J',100);
		c2.test1();
				
	}

	public void add()
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	public void test()
	{
		System.out.println(name);
	}
	
	public void test1()
	{
		System.out.println(name+" "+c+" "+a);
	}
	
}


