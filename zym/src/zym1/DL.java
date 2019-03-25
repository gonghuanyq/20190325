package zym1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DL {
	static WebDriver driver;
	static String url;
	@BeforeClass
	public void one(){
		System.setProperty("webdriver.chrome.driver", "./tors/chromedriver.exe");
		driver = new ChromeDriver();
		url="http://localhost:8080/examsys/login.thtml";
		driver.get(url);
	}
	@Test
	public void kaos() throws InterruptedException{
		driver.findElement(By.name("username")).sendKeys("hujianming");
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");
		WebElement select = driver.findElement(By.name("usertype"));
		Select s=new Select(select);
		s.selectByIndex(2);
		Thread.sleep(8000);
		driver.findElement(By.className("tm_btn")).click();
	}
	@AfterClass
	public void close() throws InterruptedException{
		Thread.sleep(2000);
		driver.close();
	}
}
