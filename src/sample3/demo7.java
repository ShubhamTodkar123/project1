package sample3;

public class demo7 
{


		
		static int a=10;
		static int b=20;
		
		int e =200;
		int f =2;
		
		public static void add()
		{
		
		System.out.println(a+b);
		
		}
		
		public void div()
		{
			System.out.println(e/f);
		}
		public static void main(String[] args) 
		{
			add();
			demo5.sub();
			System.out.println(b);
			
			demo7 ee7 = new demo7();
			ee7.div();
			System.out.println(ee7.e);
		}
		
		
	
	
	
}
