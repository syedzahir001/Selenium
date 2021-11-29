package com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohamed Musthak Y\\eclipse-workspace\\Selenium\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		
		WebElement User = driver.findElement(By.xpath("//input[@type='text']"));
		
		User.sendKeys("abc@gmail.com");
		
		
		WebElement bt = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		bt.click();
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
