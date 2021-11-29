package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drive\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/droppable");

		driver.manage().window().maximize();

		WebElement Drag = driver.findElement(By.id("draggable"));
		WebElement Drop = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);

		act.dragAndDrop(Drag, Drop).build().perform();

	}

}
