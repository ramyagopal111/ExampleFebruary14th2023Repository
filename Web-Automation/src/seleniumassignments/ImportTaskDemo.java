package seleniumassignments;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImportTaskDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		Launchbrowser();
		navigate();
		Login();
		minimaxflyoutwindow();
		importTasks();
	}

	private static void Launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void Login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	 private static void minimaxflyoutwindow()
	    {
	    	try
	    	{
	    		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
	    	}catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    }
	
	private static void importTasks()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div/div[2]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("/html/body/div[13]/div[2]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("dropzoneClickableArea")).click();
    		Thread.sleep(2000);
    		String filepath="D:\\Sample.csv";
    		CopyFilePath(filepath);
    		Thread.sleep(2000);
    		Robot robot=new Robot();
    		robot.keyPress(KeyEvent.VK_CONTROL);
    		robot.keyPress(KeyEvent.VK_V);
    		robot.keyRelease(KeyEvent.VK_CONTROL);
    		robot.keyRelease(KeyEvent.VK_V);
    		Thread.sleep(2000);
    		robot.keyPress(KeyEvent.VK_ENTER);
    		robot.keyRelease(KeyEvent.VK_ENTER);
    		Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void CopyFilePath(String path) {
		StringSelection obj=new StringSelection("D:\\Sample.csv");
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		Clipboard clipboard=toolkit.getSystemClipboard();
		clipboard.setContents(obj, null);
		
	}
	
}
