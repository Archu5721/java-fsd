package com.webapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebApp {
	
	public static void main(String[] args) {
		
		WebDriver webdriver = null;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajini\\Documents\\chromedriver_win32\\chromedriver.exe");
		webdriver = new ChromeDriver();
		webdriver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//email
		WebElement email = webdriver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:email\\:\\:content"));
		email.sendKeys("anthony@gmail.com");
				
		WebElement password = webdriver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:password\\:\\:content"));
		password.sendKeys("Abcd@32145");
		
		WebElement retype_password= webdriver.findElement(By.name("sView1:r1:0:retypePassword"));
		retype_password.sendKeys("Abcd@32145");
		
		WebElement first_name= webdriver.findElement(By.id("sView1:r1:0:firstName::content"));
		first_name.sendKeys("Anthony");
		
		WebElement last_name= webdriver.findElement(By.id("sView1:r1:0:lastName::content"));
		last_name.sendKeys("Bridgerton");
		
		WebElement job_title= webdriver.findElement(By.id("sView1:r1:0:jobTitle::content"));
		job_title.sendKeys("SoftwareEngineer");
				
		WebElement work_phone = webdriver.findElement(By.id("sView1:r1:0:workPhone::content"));
		work_phone.sendKeys("9854321009");
		
		WebElement company_name= webdriver.findElement(By.id("sView1:r1:0:companyName::content"));
		company_name.sendKeys("XYZ");
		
		WebElement address1= webdriver.findElement(By.id("sView1:r1:0:address1::content"));
		address1.sendKeys("No:5c");
				
		WebElement address2= webdriver.findElement(By.id("sView1:r1:0:address2::content"));
		address2.sendKeys("Xyz Street");
		
		WebElement city= webdriver.findElement(By.id("sView1:r1:0:city::content"));
		city.sendKeys("Villupuram");
		
		WebElement state= webdriver.findElement(By.id("sView1:r1:0:state::content"));
		state.sendKeys("Tamil nadu");
		
		WebElement zip_code= webdriver.findElement(By.id("sView1:r1:0:postalCode::content"));
		zip_code.sendKeys("606 110");
				
		WebElement element = webdriver.findElement(By.className("xfp"));
		Actions actions = new Actions(webdriver);
		actions.moveToElement(element).click().build().perform();
		webdriver.navigate().forward();
		
	}
	

}
