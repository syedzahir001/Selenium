package com.sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipledropdown {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drive\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement sel = driver.findElement(By.xpath("//option[@value='msmanual']"));
		
		Select s = new Select(sel);
		
		boolean multiple = s.isMultiple();
		
		
		System.out.println(multiple);
		
		
		
		
		
	}
	

}
