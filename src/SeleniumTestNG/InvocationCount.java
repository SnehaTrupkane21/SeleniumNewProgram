package SeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCount {
	WebDriver driver;
	
@Test(invocationCount=3)
public void chromeopen()
{
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https:www.facebook.com");
}
@Test()
public void login()
{
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sjgfjsf@gmail.com");
	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Sneha@21");
	
	
}
@Test(invocationCount=3)
public void loginbutton()
{

	driver.findElement(By.xpath("//*[@name='login']")).click();
}

}
