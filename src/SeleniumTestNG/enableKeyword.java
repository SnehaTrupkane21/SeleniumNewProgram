package SeleniumTestNG;

import org.testng.annotations.Test;

public class enableKeyword {

	@Test(enabled=false)
	public void login()
	{
	System.out.println("this is disbled");	
		
	}
	@Test(enabled =true)
	public void home()
	{
		
		System.out.println("this is eanbled");
		
	}
	@Test(priority=-2)
	public void logout()
	{
		System.out.println("this is logout");
		
	}
	
	
}
