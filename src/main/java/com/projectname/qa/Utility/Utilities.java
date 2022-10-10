package com.projectname.qa.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.projectname.qa.Base.TestBase;

public class Utilities extends TestBase{

	public static FileInputStream file;

	// <=========================ScreenShot==========================>
	
	public static void getscreenshot(WebDriver driver, String testname) throws IOException {
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		String filename = testname+"_"+d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		File Destination = new File("C:\\Users\\HP\\eclipse-workspace\\com.projectname.qa\\Screenshot"+filename);
		FileUtils.copyFile(source, Destination);
		
	}
	
	// <===========================Excel Handle=====================================================>
	
	public static String ReaddatafromExcel( int r, int c) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\com.projectname.qa\\src\\main\\java\\com\\projectname\\qa\\TestData\\New Microsoft Excel Worksheet.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Login_Credential").getRow(r).getCell(c).getStringCellValue();
		return value;
	}
	
	//<============================== JavaScriptExecuter==============================================>
	//1. Drawing the border around the element
	
		public static void BorderbyJS(WebDriver driver, WebElement element) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			
			js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
		
		
		//2. Capture the title of the webpage.
		
		public static String titlebyJS(WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			String Title = js.executeScript("return document.title").toString();
			return Title;
			
		}
		
		//3. Click on Some Element.
		
		public static void clickbyJS(WebDriver driver, WebElement element) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].ckick();", element);
		}
		
		//4. Generate an Alert.
		
		public static void alertbyJS(WebDriver driver, String Message) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("alert('"+Message+" ')");
		}
		
		// 5. Refreshing the webpage.
		
		public static void refreshbyJS(WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("history.go(0)");
			
		}
		
		
		//6. Scrolling of the webpage.
		
		public static void scrolldownbyJS(WebDriver driver, int x ,int y) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("scroll("+x+","+y+")");
		}
		
		//Scroll up
		
		public static void scrollupbyJS(WebDriver driver, int x ,int y) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("scroll("+x+","+y+")");
		}
		
		// Scroll into view
		
		public static void scrollIntoviewbyJS(WebDriver driver, WebElement element) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
}
