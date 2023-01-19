package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screen_shot {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
    System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver =new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		takeScreenshot("Google");
	}
		
		public static void takeScreenshot(String filename) throws IOException {
			
			File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("C:\\Users\\qazis\\eclipse-workspace\\Tdit\\src\\main\\java\\ScreenShot"+filename+".jpg"));
		

	}

}
