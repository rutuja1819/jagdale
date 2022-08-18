package constructorStudy;

public class CS {
	
	int a;
	int b;
	int c;

	public CS()   //zero para. constructor
	{
		a=10;
		b=20;
		c=30;
	}
	
	public CS(int a1)  //single para/
	{
		a=a1;
	}
	
	public CS(int a1,int b1)  //two para.
	{
		a=a1;
		b=b1;
	}
	
	public CS(int a1,int b1, int c1)   //three para.
	{
		a=a1;
		b=b1;
		c=c1;
	}

	public static void main(String[] args) {
		
		CS c=new CS();
		c.add();
		
		CS c1=new CS(100);
		c1.add();
		
		CS c2=new CS(500,100);
		c2.add();
		
		CS c3=new CS(100,100,100);
		c3.add();
    
	}
	
	public void add()
	{
		int sum=a+b+c;
		System.out.println(sum);
	}

}
