package com.SeleniumTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC01_PasswordValidation {

	public static void main(String[] args) throws InterruptedException {
		{
			//For chrome we need to install the chromedriver.exe and give the path as mentioned below
			//System.setProperty("webdriver.chrome.driver",	System.getProperty("user.dir")+"\\src\\chromedriver.exe");
			
			// Initialize browser
			WebDriver driver = new FirefoxDriver();

			// Launch the Application
			driver.get("http://newtours.demoaut.com/");
			// Wait for 5 Sec
			Thread.sleep(5);
			// Maximize the Browser Window
			driver.manage().window().maximize();
			//Verify the Password Word is present on the WebPage
			if (driver.getPageSource().contains("Password") == true) {
				System.out.println("Password field is displayed");
			} else {
				System.out.println("Password field is not displayed");
			}

			// Close the Driver
			driver.quit();
		}

	}
}
