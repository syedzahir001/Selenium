package com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absalute_xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohamed Musthak Y\\eclipse-workspace\\Selenium\\drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/s?k=mobile&i=fashion&ref=nb_sb_noss_2");
		
		driver.manage().window().maximize();
		
		WebElement amz = driver.findElement(By.xpath("//div[@id='a-page']/div/div/div/div/span/div[2]//div[2]/div/span/div/div/div[2]/div/div/div/span/a/div/img"));
		
		amz.click();
		
		
		
	}
	
	

}
