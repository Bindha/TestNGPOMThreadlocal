package wrapper;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenshotUtil {
	
	public static void takeScreenshot(WebDriver driver,String sFileName) throws Exception {
		File oDist = new File("C:\\Users\\Bindha\\Desktop\\eclipse\\TestNG_POM\\snap"+sFileName+".png");
		TakesScreenshot shot = (TakesScreenshot)driver;
		File oScr = shot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(oScr,oDist);
	}
	
	public static void takeScreenshotOfWebelement(WebElement oElement,String sFileName) throws Exception {
		File oDist = new File("C:\\Users\\Bindha\\Desktop\\eclipse\\TestNG_POM\\snap"+sFileName+".png");
		File oScr = oElement.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(oScr,oDist);
	}
	
	public static void takeScreenshotAsByte(WebDriver driver,String sFileName) throws Exception {
		File oDist = new File("C:\\Users\\Bindha\\Desktop\\eclipse\\TestNG_POM\\snap"+sFileName+".png");
		TakesScreenshot shot = (TakesScreenshot)driver;
		byte[] screenshotAsByte = shot.getScreenshotAs(OutputType.BYTES);
		File oScr = OutputType.FILE.convertFromPngBytes(screenshotAsByte);
		FileUtils.copyFile(oScr,oDist);
	}
	
	public static void takeScreenshotAsBase64(WebDriver driver,String sFileName) throws Exception {
		File oDist = new File("C:\\Users\\Bindha\\Desktop\\eclipse\\TestNG_POM\\snap"+sFileName+".png");
		TakesScreenshot shot = (TakesScreenshot)driver;
		String screenshotAs = shot.getScreenshotAs(OutputType.BASE64);
		File oScr = OutputType.FILE.convertFromBase64Png(screenshotAs);
		FileUtils.copyFile(oScr,oDist);
	}
	
	public static String takeScreenshotToDynamicPath(WebDriver driver,String sFileName) throws Exception {
		String filePath = System.getProperty("user.dir")+"./snap/"+
							sFileName+System.currentTimeMillis()+".png";
		File oDist = new File(filePath);
		TakesScreenshot shot = (TakesScreenshot)driver;
		File oScr = shot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(oScr,oDist);
		return filePath;
	}

}
