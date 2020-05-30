package arraylistandset;

public class dDynamicarray {

	public static void main(String[] args) {
		
		Object [] a=new Object[5]; //wastage of empty space is more here,insuffientce
		
		a[1]=100;
		a[4]=400;

		
		for(Object k:a)
			
		{
			System.out.println(k);
		}
	}

}
