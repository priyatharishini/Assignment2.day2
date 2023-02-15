package Assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		 driver.findElement(By.linkText("Phone")).click();
		 driver.findElement(By.name("phoneNumber")).sendKeys("9990230139");
		 driver.findElement(By.className("x-btn-text")).click();
		 WebElement leadID1 = driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]//a)[1]"));
		 
	        String firstId = leadID1.getText();
	        
	        System.out.println(firstId);
	        Thread.sleep(3000);
	        leadID1.click();
	        
	        
	       driver.findElement(By.linkText("Delete")).click();
	        
	        driver.findElement(By.linkText("Find Leads")).click();
	        
	        driver.findElement(By.name("id")).sendKeys(firstId);
	        driver.findElement(By.linkText("Find Leads")).click();
	       System.out.println("the title is " + driver.getTitle());
	        if(driver.getTitle().contains(firstId))
	        {
	        	System.out.println("Record is displayed in the lead list");
	        }
	        else
	        {
	        	System.out.println("No Record is displayed in the lead list");
	        }
	        
	        driver.close();
	}

}
