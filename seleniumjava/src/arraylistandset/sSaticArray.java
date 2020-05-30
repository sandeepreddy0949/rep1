package arraylistandset;

public class sSaticArray {

	public static void main(String[] args) {
		
		int [] a = {10,11,12,13,14};//numbers
		String [] k={"monika","reddy","veerati"};//string
		Object [] o={"monika","reddy",1,2,'i'};//object
		System.out.println(a.length);
		
		   System.out.println("number array");
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		   System.out.println("string array");
	    for (String k1 : k)	
	    {
	    	System.out.println(k1);
	    }
	    System.out.println("object array");
	    for(Object o1 :o)
	    {
	    	System.out.println(o1);
	}
	}
	
	
	

}
