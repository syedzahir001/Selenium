package com.sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini_Project {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drive\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//		WebElement frame = driver.findElement(By.xpath("//div[@class='right-block']"));
//		
//		driver.switchTo().frame(frame);

		Thread.sleep(2000);

		WebElement Add = driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));

		Add.click();

		Thread.sleep(2000);

		WebElement proceed = driver.findElement(
				By.xpath("//div[@id='page']/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));

		proceed.click();

		WebElement btn = driver.findElement(By.xpath("//div[@id='page']/div[2]/div/div[3]/div/p[2]/a[1]/span"));

		btn.click();

		WebElement email = driver.findElement(By.id("//input[@id='email']"));

		email.sendKeys("nileg46187@latovic.com");

		WebElement psd = driver.findElement(By.id("//input[@id='passwd']"));

		psd.sendKeys("nileg46187");

		WebElement btn1 = driver.findElement(By.xpath("//div[@id='page']/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span"));

		btn1.click();

		WebElement btn2 = driver.findElement(By.xpath("//div[@id='page']/div[2]/div/div[3]/div/form/p/button/span"));

		btn2.click();
		
		WebElement checkb = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkb.click();
		
		
		WebElement btn3 = driver.findElement(By.xpath("//div[@id='page']/div[2]/div/div[3]/div/div/form/p/button/span"));

		btn3.click();
		
		
		
		
		
		

		// div[@id='page']/div/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]/span
		// html/body/div[1]/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span
		// span[contains(text(),'Proceed to checkout')]

	}

}
