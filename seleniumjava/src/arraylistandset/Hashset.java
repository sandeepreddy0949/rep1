package arraylistandset;

import java.util.HashSet;
import java.util.Iterator;


public class Hashset {

	public static void main(String[] args) {
		
	 HashSet<Object> ob=new HashSet<Object>();
	 
	 ob.add("monika");
	 ob.add("veer");
	 ob.add("reddy");
	 Iterator<Object> s=ob.iterator();
	 
	 while (s.hasNext())
	 {
		 Object x=s.next();
		 System.out.println(x);
	 }
	 
	 
	 
	}

}
