package Assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
	 driver.findElement(By.className("decorativeSubmit")).click();
	 driver.findElement(By.linkText("CRM/SFA")).click();
	 driver.findElement(By.linkText("Leads")).click();
	 driver.findElement(By.linkText("Find Leads")).click();
	 driver.findElement(By.name("firstName")).sendKeys("Arun");
	 driver.findElement(By.linkText("Find Leads")).click();
	 driver.findElement(By.linkText("10058")).click();
	 String title = driver.getTitle();
	 System.out.println(title);
	 driver.findElement(By.className("subMenuButton")).click();
	 driver.findElement(By.className("inputBox")).sendKeys("CTS");
	 driver.findElement(By.name("submitButton")).click();
if(driver.getTitle().contains("Arun"))
		{
	System.out.println("the name is not changed");
	
		}
else
{
	
	System.out.println("the name is changed");
}
//driver.close();
}

}
