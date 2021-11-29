package com.sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollup_Scrolldown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drive\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.album.alexflueras.ro/");

		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		
		WebElement right = driver.findElement(By.xpath("//img[@src='https://www.album.alexflueras.ro/uploads/images/galleries/6/48960019.jpg']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		 js.executeScript("arguments[0].scrollIntoView", right);
		 
		 js.executeScript("", args);

//		Thread.sleep(2000);
//
//		WebElement left = driver.findElement(By.id("a1"));
//
//		js.executeScript("arguments[0].scrollIntoView();", left);

	}

}
