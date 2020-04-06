package com.koovs.testpom;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.koovs.generic.BaseClass;
import com.koovs.generic.Excel;
import com.koovs.pom.LoginPage;

public class Addtobag extends BaseClass{
	@Test
	public static void addtoBag() throws InterruptedException {
		String un = Excel.getData(xlpath,sheet,1,0);
		String pwd = Excel.getData(xlpath,sheet,1,1);
		driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
		LoginPage lp=new LoginPage(driver);		
		lp.login();
		lp.email(un);
		lp.pwd(pwd);
		lp.loginButton();
		Thread.sleep(3000);
		lp.menCategory();
		lp.tShirts();
		Thread.sleep(4000);
		lp.product();
		Set<String> all = driver.getWindowHandles();
		for(String win : all)
		{
			driver.switchTo().window(win);
		}
		lp.selectSize();
		lp.addTOBag();
		lp.goToBag();
}
}
