package com.sele;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {
	
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Mohamed Musthak Y\\\\eclipse-workspace\\\\Selenium\\\\drive\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/search?q=t+shirts&sid=clo%2Cash%2Cank%2Cedy&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_1_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_1_na_na_na&as-pos=1&as-type=RECENT&suggestionId=t+shirts%7CMen%27s+T-shirts&requestId=b0384788-8d36-4ffd-90ba-80f34ac55863&as-searchtext=t");
		
		List<Integer> pricelist = new ArrayList<>();
		
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_3I9_wc']/preceding-sibling :: div"));
		
		
		for (WebElement allprice : price) {
			
			String text = allprice.getText().replace("₹", "");
			
			System.out.println(text);
			
		int value = Integer.parseInt(text);
		
		pricelist.add(value);
		
			
		} 
		
		System.out.println("max price " +Collections.max(pricelist));
		
		System.out.println("min price"  +Collections.min(pricelist));
		
	}

}
