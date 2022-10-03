package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Project2 {
	
	static String url = "http://localhost:4200/signin";
	static WebDriver webdriver = null;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajini\\Documents\\chromedriver_win32\\chromedriver.exe");
		webdriver = new ChromeDriver();
		webdriver.get(url);
		
//		invalidloginCheck("Anthony","ant213");
		validloginCheck("Anthony","ant213");
		
	}
	
	private static void validloginCheck(String username, String password) {
		webdriver.get(url);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		webdriver.findElement(By.id("username")).sendKeys(username);
		webdriver.findElement(By.id("password")).sendKeys(password);
//		webdriver.findElement(By.id("submit")).click();
		System.out.println("valid Login check!!");
		System.out.println("Welcome " + username);
		
	}

	@Test
	private static void invalidloginCheck(String username,String password) {
		webdriver.get(url);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		webdriver.findElement(By.id("username")).sendKeys(username);
		webdriver.findElement(By.id("password")).click();
		webdriver.findElement(By.id("submit")).click();
		System.out.println("Invalid Login check!!");
		System.out.println("Message : " + webdriver.findElement(By.id("message")).getText());
		
	}
	
	

}
