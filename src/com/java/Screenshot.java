package com.java;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mohamed Musthak Y\\eclipse-workspace\\Selenium\\drive\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");

		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement User = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));

		User.sendKeys("abc@gmail.com");

		WebElement pass = driver.findElement(By.xpath("//input[@aria-label='Password']"));

		pass.sendKeys("123456");

		WebElement btn = driver.findElement(By.xpath("//div[text()='Log In']"));

		btn.click();

		TakesScreenshot is = (TakesScreenshot) driver;
		

		File scr = is.getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\Mohamed Musthak Y\\eclipse-workspace\\Selenium\\Screenshot\\pic1.png");

		FileUtils.copyFile(scr, dest);

	}

}
