package SeleniumTestNG;

import org.testng.annotations.Test;

public class TestNgKeywards {

	@Test(priority=1,invocationCount=3,enabled=false)
	public void login()
	{
		System.out.println("this is first testcase");
	}
	@Test(priority=-3,invocationCount=3,enabled=true)
	public void logout()
	{
		System.out.println("this is second testcase");
	}
}
