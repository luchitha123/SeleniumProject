package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
@Test
public void seleniumproject() throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
Thread.sleep(100);
WebElement element=driver.findElement(By.name("txtUsername"));
element.sendKeys("Admin");
Thread.sleep(100);
driver.findElement(By.name("txtPassword")).sendKeys("admin123");
Thread.sleep(100);
driver.findElement(By.name("Submit")).click();
}
}