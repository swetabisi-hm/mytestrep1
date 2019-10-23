package Bookingsystem.Bookingsystem;

import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class BookingflowTc {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sweta.Bisi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String baseURL = "https://www.londontheatredirect.com/musical/1017/mamma-mia-tickets.aspx";

		driver.get(baseURL);

		String expectedTitle = "Mamma Mia! Tickets - Musical Tickets | London Theatre Direct";
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.findElement(By.id("ctl00_MainContent_BookingBoxControl_BookButtonHL")).click();

		WebElement monthYearWE = driver.findElement(By.xpath(PageObjectRepo.monthYearLink));
		
		monthYearWE.click();
		
		WebElement dateTimeWE = driver.findElement(By.xpath(PageObjectRepo.dateTimeLink));
		
		dateTimeWE.click();
		
		Thread.sleep(10000);
		
		WebElement seatWE = driver.findElement(By.xpath(PageObjectRepo.seatLink));
//		seatWE.click();
//		
		Actions builder = new Actions(driver);  
		
//		Thread.sleep(3000);

		WebElement element = driver.findElement(By.xpath("xpath of canvas"));

	    Actions builder = new Actions(driver);
	    Action drawAction = builder.moveToElement(element,135,15) //start points x axis and y axis. 
	              .click()
	              .moveByOffset(200, 60) // 2nd points (x1,y1)
	              .click()
	              .moveByOffset(100, 70)// 3rd points (x2,y2)
	              .doubleClick()
	              .build();
	    
	    WebElement adbask=driver.findElement(By.xpath(PageObjectRepo.addToBasket));
	    adbask.click();
	    
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("scroll(0,500);");
//to scroll down till payment innfo
	    
	    

		
		
		

	}

	// TODO Check its working

}
