package com.koovs.generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;





public class Excel {
	
	
	public static String getData(String path,String sheet, int row,int col)
	{
		String value="";
		FileInputStream fis;
		try {
			fis = new FileInputStream(path);
			Workbook w = WorkbookFactory.create(fis);
			value=w.getSheet(sheet).getRow(row).getCell(col).toString();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return value;
	}
	

}
