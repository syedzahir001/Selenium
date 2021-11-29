package com.sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drive\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		
		WebElement btn = driver.findElement(By.id("doubleClickBtn"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(btn).build().perform();

}
}