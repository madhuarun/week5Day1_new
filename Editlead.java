package Week5Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Editlead extends BaseClass{
	
	@ Test
	public void EditLead() {

	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("mathanggi");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("arun");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("sales");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("this is description");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testleaf@gmail.com");

	WebElement eleDropdown=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select dd=new Select(eleDropdown);
	dd.selectByVisibleText("New York");

	driver.findElement(By.name("submitButton")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_description")).clear();
	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is important document");
	driver.findElement(By.name("submitButton")).click();

	String title=driver.getTitle();
	System.out.println(title);
		

}


}
