package com.sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohamed Musthak Y\\eclipse-workspace\\Selenium\\drive\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	
	
	 WebDriverWait wait = new WebDriverWait(driver, 20);
	
	 Alert Siplealert = wait.until(ExpectedConditions.alertIsPresent());
	 
	 
	// wait.until(ExpectedConditions.visibilityOf("email"));
	 
	 
	 
//	Wait wait = new FluentWait<T>(driver).withTimeout(30 , TimeUnit.SECONDS).Poll
//	 

	 
	
	
	
	
	}
}
