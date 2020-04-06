package com.koovs.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass implements AutoConstant{
public static Properties con;
public static FileInputStream fis;
public static WebDriver driver;
static String browser_name="";

static
{

	try {
		fis=new FileInputStream(configpath);
		Properties con=new Properties();
		con.load(fis);
		browser_name=con.getProperty("browser");
		if(browser_name.contains("chrome"))
		{
			System.setProperty(chrome_key, chrome_value);
		}
		else
		{
		System.setProperty(firefox_key, firefox_value);
		}

	} catch (Exception e) 
	{
		e.printStackTrace();
	}
}
	@BeforeMethod()
	public static void bMethod()
	{
		if(browser_name.contains("chrome"))
		{
			co.addArguments("--disable-notifications");
			driver = new ChromeDriver(co);
		}
		else
		{
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.get(url);
	}
	@AfterMethod()
	public static void aMethod(ITestResult result) {
		int status = result.getStatus();  
		String testcase = result.getName();
		if(status==1)
		{
			Reporter.log(testcase+" is pass",true);
		}
		else
		{
			Reporter.log(testcase+" is fail",true);
		}
		//driver.close();
	}

}




