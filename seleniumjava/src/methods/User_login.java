package methods;

public class User_login {

	public static void main(String[] args) throws InterruptedException {
		String res;
		Methods lo=new Methods ();
		res=lo.launch("http://orangehrm.qedgetech.com");
		System.out.println("launch" + res);
		
		res=lo.login("thirupathi1245", "MONikareddy@123");
		System.out.println("login"+res);
		
		Thread.sleep(2000);
		res=lo.logout();
		System.out.println("logout"+res);
		
		lo.close();

	}

}
