package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample_Selenium {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "E:\\Praveen\\Launching_Browsers\\chromedriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://softmindinformatics.com");
		driver.close();
		
	}

}
