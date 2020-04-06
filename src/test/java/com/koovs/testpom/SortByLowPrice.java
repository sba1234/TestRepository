package com.koovs.testpom;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.koovs.generic.BaseClass;
import com.koovs.generic.Excel;
import com.koovs.pom.LoginPage;

public class SortByLowPrice extends BaseClass {
	@Test
	public static void sortByLowPrice() throws InterruptedException {
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
		Thread.sleep(3000);
		lp.sort();
		lp.price();
		lp.selecttshirt();
		lp.selectSize();
		lp.addTOBag();
		lp.goToBag();
		lp.proceed();
		lp.confirm();
}
}
