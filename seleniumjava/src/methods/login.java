package methods;

public class login {

	public static void main(String[] args) throws InterruptedException {
		
		String res;
		Methods lo=new Methods ();
		res=lo.launch("http://orangehrm.qedgetech.com");
		System.out.println("launch" + res);
		
		res=lo.login("admin", "Qedge123!@#");
		System.out.println("login"+res);
		
		res=lo.logout();
		System.out.println("logout"+res);
		
		lo.close();
		

	
	}

}
