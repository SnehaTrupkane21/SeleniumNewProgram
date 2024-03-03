package SeleniumTestNG;

import org.testng.annotations.Test;

public class PriorityKeyword2 {
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
	
	@Test(priority =-3)
	public void z()
	{
		System.out.println("This is my fourth testcase");
		
	}
	@Test(priority=4000)
	public void ad()
	{
		System.out.println("this is fifth test case");
	}
	
	@Test()
	public void b()
	{
		System.out.println("this is sixth test case");
	}

}
