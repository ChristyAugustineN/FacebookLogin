package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {
	@Parameters({"username","password"})
	@Test
	public void tc0(String s1,String s2) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-new\\FacebookLogin\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys(s1);
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(s2);
		
	}
	

}
