package methods;

public class emp_reg {

	public static void main(String[] args) throws InterruptedException {
	
		String res;
		Methods lo=new Methods ();
		res=lo.launch("http://orangehrm.qedgetech.com");
		System.out.println("launch" + res);
		
		res=lo.login("admin", "Qedge123!@#");
		System.out.println("login"+res);
		
		res=lo.empreg("sunnyreddy", "reddy" , "21M131");
		System.out.println("reg"+res);
		res=lo.logout();
		System.out.println("logout"+res);
		
		lo.close();
		
	}

}
