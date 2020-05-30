package methods;

public class Testsuit {

	public static void main(String[] args) throws InterruptedException {
			
		Methods lo=new Methods();
		String res;
		res=lo.launch("http://orangehrm.qedgetech.com");
		System.out.println("launch" + res);
		
		res=lo.login("admin", "Qedge123!@#");
		System.out.println("login"+res);
		
		res=lo.empreg("hymavathi", "reddy" , "21M189j");
		System.out.println("reg"+res);
		
		res= lo.userreg( "hymavathi reddy", "thirupa", "MONikareddy@123","MONikareddy@123");
		System.out.println("userregi"+res);
		
		res=lo.logout();
		System.out.println("logout"+res);
		
		lo.close();
		
		res=lo.login("thirupa", "MONikareddy@123");
		System.out.println("login"+res);

	}

}
