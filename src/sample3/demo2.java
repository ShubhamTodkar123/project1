package sample3;

public class demo2
{

	public static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void sub(int c, int d)
	{
		System.out.println(c-d);
	}
	
	
	public void mult(int e, int f)
	{
		System.out.println(e*f);
	}
	
	public void student(String name, String last)
	{
		System.out.println(name + " "+ last);
	}
	
	public static void main(String[] args)
	{
		
		add(10,20);
		sub(100,50);
		demo5.name("PUSHPA");
		
		
		demo2 d2 = new demo2();
		d2.mult(5, 2);
		d2.student("anay" , "Bhusari");
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
