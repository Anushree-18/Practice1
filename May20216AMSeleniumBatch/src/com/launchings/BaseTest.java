package com.launchings;


import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class BaseTest {
	
	public static  WebDriver driver;
	public  static String projectPath= System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainProp;
	public static Properties childProp;
	
	public static void init() throws Exception
	{
	  fis=new FileInputStream(projectPath+"//data.properties");
	  p=new Properties();
	  p.load(fis);
	  
	  fis=new FileInputStream(projectPath+"//environment.properties");
	  mainProp=new Properties();
	  mainProp.load(fis);
	  String e=mainProp.getProperty("env");
	  System.out.println(e);
	  
	  fis=new FileInputStream(projectPath+"//"+e+".properties");
      childProp = new Properties();
	  childProp.load(fis);
	  String value=childProp.getProperty("amazonurl");
	  System.out.println(value);
	}
	
	public static void launch(String browser)
	{
		if (p.getProperty(browser).equals("chrome"))
			
		{
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\anush\\OneDrive\\Desktop\\May2021 drivers\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver.exe");
			driver=new ChromeDriver();
			
			
		}

		else if(p.getProperty(browser).equals("firefox")) {
			
			
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\anush\\OneDrive\\Desktop\\May2021 drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", projectPath+"//drivers//geckodriver.exe");
			ProfilesIni p= ProfilesIni();
			FirefoxProfile profile =p.getProfile("mayffprofile");
			
			FirefoxProfile profile =p.getProfile("mayffprofil
			
			driver=new FirefoxDriver();
			
		}
		
		else if(p.getProperty(browser).equals("edge")) {
			//System.setProperty("webdriver.edge.driver","C:\\Users\\anush\\OneDrive\\Desktop\\May2021 drivers\\edgedriver_win64\\msedgedriver.exe");
			
			System.setProperty("webdriver.edge.driver", projectPath+"//drivers//edgedriver.exe");
		    driver=new EdgeDriver();
			
		}
	}
	
	private static ProfilesIni ProfilesIni() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void navigateURL (String url)
	{
		
		driver.get(p.getProperty(url));
	}
	
	private static void windowRefresh() {
		// TODO Auto-generated method stub
		
	}

	private static void windowForward() {
		// TODO Auto-generated method stub
		
	}

	private static void windowBack() {
		// TODO Auto-generated method stub
		
	}

	private static void deleteCookies() {
		// TODO Auto-generated method stub
		
	}

	private static void windowCurrentUrl() {
		// TODO Auto-generated method stub
		
	}

	private static void windowTitle() {
		// TODO Auto-generated method stub
		
	}

	private static void windowMMaximize() {
		// TODO Auto-generated method stub
		
	}

}

	
	
}
