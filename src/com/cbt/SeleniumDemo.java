package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
		"C:/Users/Owner/Documents/selenium dependencies/drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cybertekschool.com");
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://amazon.com");
		
		/* System.setProperty("webdriver.gecko.driver",
		"C:/Users/Owner/Documents/selenium dependencies/drivers/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://cybertekschool.com");
		*/
	}

}
