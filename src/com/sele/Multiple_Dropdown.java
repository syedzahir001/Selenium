package com.sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Dropdown {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohamed Musthak Y\\eclipse-workspace\\Selenium\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		
		
		
		
		

}
}