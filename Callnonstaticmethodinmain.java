package module1projects;

public class Callnonstaticmethodinmain 
{
	public void login()
	{
	System.out.println("Login to Amazon");
	}
	public void logout()
	{
		System.out.println("Logout from Amazon");
	}
	public void searching()
	{
		System.out.println("Searchin the product");
	}
	public static void main(String[] args)
	{
		Callnonstaticmethodinmain a1=new Callnonstaticmethodinmain();//reference variable
		a1.login();
		a1.logout();
		a1.searching();
		
		
	}

}
