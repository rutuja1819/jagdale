package vaiables;

//global and local

public class VariableStudy {
	
	String s="Rutuja";   //global variable

	public static void main(String[] args) {
	
		VariableStudy v=new VariableStudy();
		v.test();

	}
	
	public void test()
	{
		String s="VV";
		System.out.println(s);
		
		System.out.println(this.s);
	}
}
