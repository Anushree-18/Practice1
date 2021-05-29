package com.launchings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserLaunch {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anush\\OneDrive\\Desktop\\May2021 drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("c");
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\anush\\OneDrive\\Desktop\\May2021 drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.bestbuy.com");
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\anush\\OneDrive\\Desktop\\May2021 drivers\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver1=new EdgeDriver();
		driver1.get("https://www.walmart.com");
	}

}
