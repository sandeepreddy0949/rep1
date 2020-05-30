package arraylistandset;

public class staticarray {
	
	public static void main(String[] args)
	{
		int[] a={1000,2,300,400,5000,60}; //static array
		int big;
		big=a[0];
	System.out.println("lenght is " + a.length);
		
		for(int i=0;i<a.length;i++)
		{
			 
			
			if (big>=a[i])
				
			   continue;
						
				else
				{
				big=a[i];
				}
		}
		
			System.out.println(big);
	
		
		
	}

}
