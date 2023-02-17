package Assignment1;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
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
		 driver.findElement(By.linkText("Email")).click();
		 driver.findElement(By.name("emailAddress")).sendKeys("jack.son@gmail.com");
		 WebElement lead = driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]//a)[4]"));
	String first = lead.getText();
	System.out.println(first);
	lead.click();
	Thread.sleep(3000);
	driver.findElement(By.className("subMenuButton")).click();
	System.out.println("the title "+driver.getTitle());
	driver.findElement(By.className("smallSubmit")).click();
	WebElement second = driver.findElement(By.xpath("(//a[text()='jack.son@gmail.com'])"));
	String text = second.getText();
	if(first==text)
	{
		
		System.out.println("Duplicate name is not same as Captured name");
	}
	else
	{
		
		System.out.println("Duplicate name is   same as Captured name");
	}
	//driver.close();
	}
}
