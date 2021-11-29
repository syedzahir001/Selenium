package com.sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drive\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement btn = driver.findElement(By.id("alertButton"));

		btn.click();

		org.openqa.selenium.Alert simple = driver.switchTo().alert();

		Thread.sleep(3000);

		simple.accept();

		WebElement btn2 = driver.findElement(By.id("confirmButton"));

		btn2.click();

		org.openqa.selenium.Alert confirm = driver.switchTo().alert();

		Thread.sleep(3000);

		confirm.dismiss();

		WebElement btn3 = driver.findElement(By.id("promtButton"));

		btn3.click();

		org.openqa.selenium.Alert prom = driver.switchTo().alert();

		Thread.sleep(3000);

		String text = prom.getText();

		System.out.println(text);

		prom.sendKeys("Hello");

		prom.accept();

		WebElement btn4 = driver.findElement(By.id("timerAlertButton"));

		btn4.click();

		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.alertIsPresent());

		simple.accept();

	}
}
