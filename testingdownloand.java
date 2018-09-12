import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.ByFeature;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class testingdownloand {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		Sysout("adding new sysout in feature branch");
		System.setProperty("webdriver.ie.driver","C:\\Users\\sumit\\Downloads\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		//I am removing driver from feature branch
		
		
		//To open URL
				driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
				//Download Text File
				driver.findElement(By.xpath("//*[@id=\"post-body-5864649494765988891\"]/div[1]/form/div[1]/a[4]")).click();
				//To call the AutoIt script
				/*Thread.sleep(20000);
				Runtime.getRuntime().exec("C:\\Users\\sumit\\Desktop\\clivk.exe");*/
				//'close' method is used to close the browser window
				//driver.close();
		
		//Thread.sleep(10000);
		
		/*Actions action = new Actions(driver);
	    
		
		Thread.sleep(10000);
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F);
		
		Thread.sleep(3000);
		// SCROLL DOWN
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		// SCROLL UP
		action.sendKeys(Keys.PAGE_UP).build().perform();
		
		System.out.println(System.getProperty("user.home"));*/
		
		
		
				Thread.sleep(10000);
		
				//String selectAll = Keys.chord(Keys.TAB,Keys.TAB, Keys.ALT, "f");
				String selectAll = Keys.chord(Keys.F10,Keys.ALT, "s");
				driver.findElement(By.linkText("Gooyaabi Templates")).sendKeys(selectAll);
		

	}

}
