package com.Basic;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.id("username"));
		un.sendKeys("naveenasathish");
		WebElement ps = driver.findElement(By.id("password"));
		ps.sendKeys("nainish");
		WebElement log = driver.findElement(By.name("login"));
		log.click();
		WebElement place = driver.findElement(By.name("location"));
		Select s1 =new Select(place);
		s1.selectByValue("Paris");
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s2 = new Select(hotel);
		s2.selectByValue("Hotel Sunshine");
		WebElement room = driver.findElement(By.name("room_type"));
		Select s3= new Select(room);
		s3.selectByValue("Deluxe");
		WebElement nroom = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(nroom);
		s4.selectByValue("2");
		WebElement adroom  = driver.findElement(By.name("adult_room"));
	    Select s5= new Select(adroom);
	    s5.selectByValue("1");
	    WebElement childroom = driver.findElement(By.name("child_room"));
	    Select s6= new Select(childroom);
        s6.selectByValue("1");
        WebElement finish = driver.findElement(By.id("Submit"));
        finish.click();
        WebElement tick = driver.findElement(By.name("radiobutton_0"));
        tick.click();
        WebElement con = driver.findElement(By.id("continue"));
        con.click();
        WebElement fname = driver.findElement(By.xpath("//input[@name='first_name']"));
        fname.sendKeys("naveena");
        WebElement lastname = driver.findElement(By.name("last_name"));
        lastname.sendKeys("sathish");
        WebElement adress = driver.findElement(By.name("address"));
        adress.sendKeys("1/2 1st street kannagar trichy");
        WebElement credit = driver.findElement(By.xpath("(//input[@class='reg_input'])[3]"));
        credit.sendKeys("1234567891234567");
        WebElement cctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
        Select s7 =new Select(cctype);
        s7.selectByValue("MAST");
        WebElement cmonth = driver.findElement(By.name("cc_exp_month"));
        Select s8 = new Select(cmonth);
        s8.selectByValue("3");
        WebElement cyear = driver.findElement(By.id("cc_exp_year"));
        Select s9= new Select(cyear);
        s9.selectByValue("2022");
        WebElement cvv = driver.findElement(By.name("cc_cvv"));
        cvv.sendKeys("122");
        Thread.sleep(2000);
        WebElement book = driver.findElement(By.id("book_now"));
        book.click();
        Thread.sleep(3000);
	
		   JavascriptExecutor sc =(JavascriptExecutor)driver;
            sc.executeScript("window.scrollBy(0, 4000)");  
			 Thread.sleep(3000);
			 TakesScreenshot ts = (TakesScreenshot)driver; 
		    File source =ts.getScreenshotAs(OutputType.FILE);
		    File destination = new File( "C:\\Users\\acer\\eclipse-workspace\\Selenium_Concepts\\snaps//miniproject2.png"); 
		    FileHandler.copy(source, destination);
		 
	}

}
