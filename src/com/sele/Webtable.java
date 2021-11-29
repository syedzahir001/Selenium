package com.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Mohamed Musthak Y\\\\eclipse-workspace\\\\Selenium\\\\drive\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://cosmocode.io/automation-practice-webtable/");

		List<WebElement> Table = driver.findElements(By.xpath("//table/tbody/tr/td"));

		for (WebElement alldata : Table) {
			String text = alldata.getText();

			System.out.println(text);

		}

		System.out.println("************Row data********************");

		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));

		for (WebElement rowdata : row) {
			String text = rowdata.getText();
			System.out.println(text);

		}

		System.out.println("*****Coloumn data*********");

		List<WebElement> findElements = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));

		for (WebElement coldata : findElements) {

			String text = coldata.getText();
			System.out.println(text);
		}

		System.out.println("*****pat data *********");

		List<WebElement> patdata = driver.findElements(By.xpath("//table/tbody/tr[5]/td[3]"));

		for (WebElement coldata : patdata) {

			String text = coldata.getText();
			System.out.println(text);
		}
		
	}

}
