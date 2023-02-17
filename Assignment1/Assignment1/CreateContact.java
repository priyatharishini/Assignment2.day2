package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Contacts")).click();
		 driver.findElement(By.linkText("Create Contact")).click();
		 driver.findElement(By.id("firstNameField")).sendKeys("Ravi");
		 driver.findElement(By.id("lastNameField")).sendKeys("C");
		 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Kumar");
		 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("S");
		 driver.findElement(By.className("inputBox")).sendKeys("EEE");
		 driver.findElement(By.id("createContactForm_description")).sendKeys("GOOD TRAINER");
		 driver.findElement(By.className("inputBox")).sendKeys("kumar11@gmail.com");
		 WebElement ww = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	Select d2=new Select(ww);
	d2.selectByVisibleText("New York");
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.name("description")).clear();
	driver.findElement(By.name("importantNote")).sendKeys("please maintain it");
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	System.out.println("the title "+driver.getTitle());
	}

}
