package com.launchings;

public class TC001 extends BaseTest


{

	public static void main(String[] args) throws Exception {
		
	init();
	launch("chromebrowser");
	navigateURL("amazonurl");
	
	driver.manage().window().maximize();
	
	 String title=driver.getTitle();
	 System.out.println(title);
	 
	 String url=driver.getCurrentUrl();
	 System.out.println(url);
	 
	 
	 
	 windowMMaximize();
	 
	 windowTitle();
	 
	 windowCurrentUrl();
	 
	 
	 deleteCookies();
	 
	 windowBack();
	 
	 windowForward();
	 
	 windowRefresh();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 driver.manage().deleteAllCookies();
	 
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
