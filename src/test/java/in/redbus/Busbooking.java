package in.redbus;

import java.time.Duration;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Busbooking {
	public static WebDriver driver;
	@BeforeClass
	public static void method1(){
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("disable-notifications");
		options.addArguments("disable-popups");
		options.addArguments("start-maximized");
		driver = new EdgeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	@Test
	public void method2() {
	driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Surat");
	driver.findElement(By.xpath("//text[text()='Surat']")).click();
	}
	@Test
	public void method3() {
	driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
	driver.findElement(By.xpath("//text[text()='Bangalore']")).click();
		}
	@Test
	public void method4() {
	driver.findElement(By.xpath("//span[text()='3' and contains(@class,'fgdqFw')]")).click();
		}
	@Ignore
	@Test
	public void method5() {
		driver.quit();
	}
	@Test
	public void method6() {
	driver.findElement(By.xpath("//button[@id='search_button']")).click();
	}
	@Test
	public void method7() {
		List<WebElement> ab=driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));
		List<WebElement>cd=driver.findElements(By.xpath("//div[@class='dp-time f-19 d-color f-bold']"));
		List<WebElement>ef=driver.findElements(By.xpath("//div[@class='bp-time f-19 d-color disp-Inline']"));
		List<WebElement> gh=driver.findElements(By.xpath("//span[@class='f-19 f-bold']"));
		
		
	System.out.println("Available Buses:");
	//System.out.print(" ");
		for(WebElement wh:ab) {
			System.out.print(wh.getText()+" ");	
		}
		System.out.println(" ");
		System.out.println("pickup Time:");
		for(WebElement wh:cd) {
			System.out.print(wh.getText()+" ");
		}
		System.out.println(" ");
		System.out.println("Droping Time:");
		for(WebElement wh:ef) {
			System.out.print(wh.getText()+" ");
		}
		System.out.println(" ");
		System.out.println("Bus Ticket price:");
		for(WebElement wh:gh) {
			System.out.print(wh.getText()+" ");
		}
		
		
		
	}
		
		

	@AfterClass
	public static void method8() {
		driver.close();
	}
	
	
	
	
	
	
}
