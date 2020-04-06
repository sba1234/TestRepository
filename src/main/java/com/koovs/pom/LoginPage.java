package com.koovs.pom;



import java.util.List;import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.koovs.generic.BaseClass;
import com.koovs.generic.Excel;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement login;
	
	@FindBy(xpath="//input[@id='login-email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='login-pswd']")
	private WebElement pwd;
	
	@FindBy(xpath="//button[text()='LOG IN']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[text()='MEN']")
	private WebElement mencat;
	
	@FindBy(xpath="//a[text()='T-Shirts & Polo Shirts']")
	private WebElement tshirts;
	
	@FindBy(xpath="//source[@alt='K ACTIVE KOOVS Spliced Text Print Airtex T-Shirt']/following-sibling::img")
	private WebElement product;
	
	@FindBy(xpath="//a[text()='S']")
	private WebElement size;
	
	@FindBy(xpath="//div[@class='add-to-bag-btn']")
	private WebElement addtobag;
	
	@FindBy(xpath="//div[@class='go-to-bag-btn']")
	private WebElement gotobag;
	
	@FindBy(xpath="//input[@placeholder='Please enter here']")
	private WebElement couponcode;
	
	@FindBy(xpath="//div[text()='APPLY']")
	private WebElement apply;
	
	@FindBy(xpath="//div[text()='PROCEED TO CHECKOUT']")
	private WebElement proceed;
	
	@FindBy(xpath="//div[text()='CONFIRM & PAY']")
	private WebElement confirm;
	
	@FindBy(xpath="//img[@alt='K ACTIVE KOOVS Spliced Text Print Airtex T-Shirt']/ancestor::li[@class='imageView']//div[@class='wishlistIcon']")
	private WebElement wishlist;
	
	@FindBy(xpath="//div[text()='CASH ON DELIVERY']")
	private WebElement cashondelivery;
	
	@FindBy(xpath="//img[@alt='Sort arrow']")
	private WebElement sort;
	
	@FindBy(xpath="//li[text()='Price Low to High']")
	private WebElement price;
	
	@FindBy(xpath="//img[@alt='KOOVS Basic Scoop Neck T-Shirt']")
	private WebElement selecttshirt;
public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	public void login()
	{
		login.click();
	}
	public void email(String text)
	{
		email.sendKeys(text);
	}
	public void pwd(String text)
	{
		pwd.sendKeys(text);
	}
	public void loginButton()
	{
		loginButton.click();
	}
	public void menCategory()
	{
		Actions a=new Actions(driver);
		a.moveToElement(mencat).build().perform();
	}
	public void tShirts()
	{
		tshirts.click();
	}
	public void product()
	{
		product.click();
	}
	public void selectSize()
	{
		size.click();
	}
	public void addTOBag()
	{
		addtobag.click();
	}
	public void goToBag()
	{
		gotobag.click();
	}
	public void couponCode(String text)
	{
		couponcode.sendKeys(text);
	}
	public void apply()
	{
		apply.click();
	}
	public void proceed()
	{
		proceed.click();
	}
	public void confirm()
	{
		confirm.click();
	}
	public void wishlist()
	{
		wishlist.click();
	}
	public void cashOnDelivery()
	{
		cashondelivery.click();
	}
	public void sort()
	{
		Actions a=new Actions(driver);
		a.moveToElement(sort);
	}
	public void price()
	{
		price.click();
	}
	public void selecttshirt()
	{
		selecttshirt.click();
	}
}


