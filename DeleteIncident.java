package testNgAssignment;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteIncident extends BaseClassIncident {
    @Test
	public  void runDelete() {
		driver.findElement(By.xpath("(//div[text()=\"Incidents\"])[2]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='gsft_main']")));
		driver.findElement(By.xpath("(//tbody//td//a[@class='linked formlink'])[1]")).click();
		WebElement findElement2 = driver.findElement(By.xpath("//input[@name='incident.number']"));
		String attribute = findElement2.getAttribute("value");
		
		
		driver.findElement(By.xpath("(//button[text()=\"Delete\"])[1]")).click();
		driver.findElement(By.xpath("(//button[text()=\"Delete\"])[3]")).click();
		
		WebElement findElement3 = driver.findElement(By.xpath("(//tbody//td//a[@class='linked formlink'])[1]"));
		String text = findElement3.getText();
		
		if(!text.equalsIgnoreCase(attribute)) {
			System.out.println("the account is deleted");
		}
		
		
		
		
	}

}
