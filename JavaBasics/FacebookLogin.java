package com.base.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FacebookLogin {
	WebDriver dr;
	@BeforeTest
	@Parameters("Browser")
	public void setUp(String browser) {
		
		if(browser.equals("chrome")) {
			dr=new ChromeDriver();
		
		}
		if(browser.equals("firefox")) {
			dr=new FirefoxDriver();
			
		}
		if(browser.equals("Edge")) {
			dr=new EdgeDriver();
			
		}

		
		
	}
	@Test
	public void LogIn(){
		
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement Email=dr.findElement(By.id("email"));
		Email.sendKeys("test1234@gmail.com");
		WebElement Pass=dr.findElement(By.name("pass"));
		Pass.sendKeys("1234$We");
		WebElement LogInButton=dr.findElement(By.xpath("//button[@type='submit']"));
		LogInButton.click();
		
	}
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		dr.quit();
	}

}
