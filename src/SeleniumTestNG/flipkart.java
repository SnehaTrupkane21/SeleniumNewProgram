package SeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class flipkart {
WebDriver driver;
@Test(priority=1)
public void browserlaunch()
{

	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com");

}
@Test(priority=2)
public void searchproduct()
{
driver.findElement(By.name("q")).sendKeys("samsaung a54");
driver.findElement(By.cssSelector("button[type='submit']")).click();
}
@Test(priority=3)
public void clickOnproduct()
{
	
driver.findElement(By.xpath("//*[text()='SAMSUNG Galaxy A54 5G (Awesome White, 256 GB)']")).click();
}
}
