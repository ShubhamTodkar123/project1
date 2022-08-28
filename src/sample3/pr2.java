package sample3;

public class pr2 
{

	public static void main(String[] args) 
	{
	
		String str ="141";
		String rev ="";   //yan
		            // 4-1 = 3
		
		             //3 2 1  0
		for(int i=str.length()-1;i>=0;i--)
		{
			
			rev=rev+str.charAt(i);//   +y  
			//    =  ya+   n               //y+a=
		}                         //ya+n
		                         //yan+A
		//System.out.println(rev);
		if(rev.equals(str))
		{
			System.out.println(str+" is pallindrome");
		}
		else
		{
			System.out.println(str+" not pallindrome");
		}
		
		
		
	}
	
}
