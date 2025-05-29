package com.base.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionExpercise {
	WebDriver dr;
	
	@Test
	public void rightclick() {
		dr=new ChromeDriver();
		dr.get("https://osaconsultingtech.com/index.html");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement e1=dr.findElement(By.xpath("//input[@placeholder='Search']"));
		Actions act=new Actions(dr);
		act.contextClick(e1).perform();
		dr.quit();
		//
	}

}
