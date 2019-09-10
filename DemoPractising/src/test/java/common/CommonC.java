package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonC {
	
	public WebDriver driver;  //here public access modifier we can access it from 
	public WebDriver getdriver() { // webdriver is selenium interface / interface is abstarct method incomplete method 
		                          //interface is contain abstarct method no body 
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Ali-c\\eclipse-workspace\\DemoPractising\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");  //entering url
		driver.manage().window().maximize();  // we use this tree line to overcome synchronization problem 
		//what is synchronization it means between application and our code time matching 
		//when script running faster than our website 
		//we use implicit wait in my base class for whole framework 
		//but we use explicit wait for specific webelement
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		return driver;
		
		
		//this comment to check if it works on github
		//github is amazing )))
		
		
		
		
			
	}
		
	
	

}
