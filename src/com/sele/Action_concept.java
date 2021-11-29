package com.sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_concept {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drive\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.flipkart.com/home-bsd-sale-pn-store?param=19867736376343&fm=neo%2Fmerchandising&iid=M_c013bafd-07ee-4a0f-84cd-5d76385260c5_1_792OEL9WB5K2_MC.U6TMALLBLJZY&otracker=hp_rich_navigation_4_1.navigationCard.RICH_NAVIGATION_Home_U6TMALLBLJZY&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_4_L0_view-all&cid=U6TMALLBLJZY");

		driver.manage().window().maximize();

		WebElement mens = driver.findElement(By.xpath("//span[@class='_2I9KP_'][3]"));

		Actions act = new Actions(driver);

		// move to element

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		act.moveToElement(mens).build().perform();
		Thread.sleep(3000);

		WebElement shirts = driver.findElement(By.linkText("Formal Shirts"));

		act.contextClick(mens).build().perform();

		 act.click(shirts).build().perform();

		 Robot r = new Robot();

	}

}
