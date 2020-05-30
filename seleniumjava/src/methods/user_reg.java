package methods;

public class user_reg {

	public static void main(String[] args) throws InterruptedException {
		String res;
		Methods lo=new Methods ();
		res=lo.launch("http://orangehrm.qedgetech.com");
		System.out.println("launch" + res);
		
		res=lo.login("admin", "Qedge123!@#");
		System.out.println("login"+res);
		
		res= lo.userreg( "Monika V", "thirupathi111245", "MONikareddy@123","MONikareddy@123");
		System.out.println("userregi"+res);
		

	}

}
