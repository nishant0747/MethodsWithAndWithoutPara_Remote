package methodwithandwithoutparameter;

public class sample2 
{
	public void admin( String username, String password)
	{
		
		System.out.println("Lognin using Username and password");
		System.out.println(username);
		System.out.println(password);
		
		
	}
	public static void guest() 
	{
		System.out.println("login as guest");
		String un = "abc";
		String pwd = "xyz";	
				
 
		System.out.println("username = "+un);
		System.out.println("password = "+pwd);
			
	}

}
