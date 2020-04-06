package com.koovs.generic;

import org.openqa.selenium.chrome.ChromeOptions;

public interface AutoConstant 
{
String chrome_key="webdriver.chrome.driver";
String chrome_value="./driver/chromedriver.exe";
String firefox_key="webdriver.gecko.driver";
String firefox_value="./drivers/geckodriver.exe";
long ITO=10;
String Screenshot="./screenshot";
String url="https://www.koovs.com/";
String xlpath=".\\src\\test\\resources\\data\\koovs.xlsx";
String sheet="Sheet1";
String configpath="config.properties";
ChromeOptions co = new ChromeOptions();


}