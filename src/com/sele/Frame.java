package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")  +"\\drive\\chromedriver.exe"  );
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		WebElement sinlglef = driver.findElement(By.id("singleframe"));
		
		driver.switchTo().frame(sinlglef);
		
		Thread.sleep(2000);
		
		WebElement single  = driver.findElement(By.xpath("//input[@type='text'][1]"));
		
		single.sendKeys("single frame");
		
		
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		WebElement btn = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		
		btn.click();
		
		
		WebElement OF = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		
		driver.switchTo().frame(OF);
		
		
		WebElement IF = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		
		driver.switchTo().frame(IF);
		
		
		WebElement btn2 = driver.findElement(By.xpath("//input[@type='text'][1]"));
		
		btn2.sendKeys("multiple frame");
		
		
		
	}
	

}
