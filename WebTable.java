package com.example.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\OneDrive\\Documents\\workspace-spring-tool-suite-4-4.13.1.RELEASE\\AutomationWithSelenium\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
	    WebElement webTable = driver.findElement(By.id("customers"));
	    List<WebElement> allData = webTable.findElements(By.tagName("tr"));
	    
	   for (int i=0; i<allData.size(); i++) {
		   WebElement element = allData.get(i);
		   String text = element.getText();
		   System.out.println(text);
//           String attribute = element.getAttribute("Value");	
//           System.out.println(attribute);
//           
		
	}
	
	
	
	
	
	
	
	
	
	
	}
	
}