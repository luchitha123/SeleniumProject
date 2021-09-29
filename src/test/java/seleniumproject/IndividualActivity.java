package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.NoAlertPresentException;

public class IndividualActivity {
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {
	//to do automate
	System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\luchithak\\\\\\\\eclipse-workspace-selenium\\\\\\\\SeleniumProject\\\\\\\\drivers\\\\\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();

	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("checkout")).click();
	driver.findElement(By.id("first-name")).sendKeys("Luchitha");
	driver.findElement(By.id("last-name")).sendKeys("Reddy");
	driver.findElement(By.id("postal-code")).sendKeys("601201");
	Thread.sleep(2000);
	
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("finish")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("back-to-products")).click();
	driver.findElement(By.id("react-burger-menu-btn")).click();
	Thread.sleep(7000);

	driver.findElement(By.id("logout_sidebar_link")).click();

}
}
