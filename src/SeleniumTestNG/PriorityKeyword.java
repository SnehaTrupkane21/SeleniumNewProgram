package SeleniumTestNG;

import org.testng.annotations.Test;

public class PriorityKeyword {
	@Test(priority=3)
	public void Home()
	{
		System.out.println("This is my first testcase");
		
	}

	@Test(priority=2)
	public void Login()
	{
		System.out.println("This is my second testcase");
		
	}
	@Test(priority=1)
	public void Logout()
	{
		
		System.out.println("This is my third testcase");
		
	}
	
	@Test()
	public void z()
	{
		System.out.println("This is my fourth testcase");
		
	}
}
