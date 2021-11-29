package com.sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//
public class Drop_down {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Mohamed Musthak Y\\\\eclipse-workspace\\\\Selenium\\\\drive\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/r.php?locale=en_GB/");

		driver.manage().window().maximize();

		WebElement day = driver.findElement(By.id("day"));

		// select by value

		Select s = new Select(day);
//		
		s.selectByValue("7");

		// select by index
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByIndex(2);

		// select by
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);

		s2.selectByVisibleText("2016");

//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

}
