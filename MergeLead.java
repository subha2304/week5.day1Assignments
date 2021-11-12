package testNgAssignment;

	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class MergeLead extends BaseClass{
        @Test
		public  void runMerge() throws InterruptedException {
        	
    		driver.findElement(By.linkText("Find Leads")).click();
    		driver.findElement(By.xpath("//span[text()='Phone']")).click();
    		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
    		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
    		driver.findElement(By.linkText("Edit")).click();
    		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
    		driver.findElement(By.name("submitButton")).click();
    		
    }
    }





