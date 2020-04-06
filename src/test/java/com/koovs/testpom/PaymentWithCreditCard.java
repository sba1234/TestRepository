package com.koovs.testpom;

import java.util.Set;

import org.testng.annotations.Test;

import com.koovs.generic.BaseClass;
import com.koovs.generic.Excel;
import com.koovs.pom.LoginPage;

public class PaymentWithCreditCard extends BaseClass{
	@Test
	public static void paymentWithCreditCard() throws InterruptedException {
		String un = Excel.getData(xlpath,sheet,1,0);
		String pwd = Excel.getData(xlpath,sheet,1,1);
		String coupon=Excel.getData(xlpath, sheet, 2, 1);
		LoginPage lp=new LoginPage(driver);		
		lp.login();
		lp.email(un);
		lp.pwd(pwd);
		lp.loginButton();
		Thread.sleep(3000);
		lp.menCategory();
		lp.tShirts();
		Thread.sleep(3000);
		lp.product();
		String parent = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for(String win : all)
		{
			driver.switchTo().window(win);
		}
		lp.selectSize();
		lp.addTOBag();
		lp.goToBag();
		lp.couponCode(coupon);
		lp.apply();
		lp.proceed();
		lp.confirm();

}

}
