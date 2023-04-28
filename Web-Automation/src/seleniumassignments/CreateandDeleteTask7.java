package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateandDeleteTask7 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		Launchbrowser();
		navigate();
		login();
		minimaxflyoutwindow();
		createcustomer();
		createproject();
		creattask();
		deletetask();
		Deleteproject();
		Deletecustomer();
		logout();
		Closeapplication();
	}
    private static void Launchbrowser()
    {
    	try
    	{
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
    private static void login()
    {
    	try
    	{
    		oBrowser.findElement(By.id("username")).sendKeys("admin");
    		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
    		oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
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
    private static void createcustomer()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Demo2");
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("java programming language");
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void createproject()
    {
    	try
    	{
    	oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
    	Thread.sleep(2000);
    	oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
    	Thread.sleep(2000);
    	oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Demo1");
    	Thread.sleep(2000);
    	oBrowser.findElement(By.name("projectDescriptionField")).sendKeys("payment mode");
    	Thread.sleep(2000);
    	oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_commitBtn\"]/div/span")).click();
    	Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void creattask()
    {
    	try
    	{
    	oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")).click();
    	Thread.sleep(2000);
    	oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
    	Thread.sleep(2000);
    	oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")).sendKeys("Demo3");
    	Thread.sleep(2000);
    	oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_commitBtn\"]/div/span")).click();
    	Thread.sleep(5000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void deletetask()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//div[text()='Demo3']")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("taskPanel_deleteConfirm_submitTitle")).click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	
    	{
    		e.printStackTrace();
    	}
    
    }
    private static void Deleteproject()
    {
 	   try
 	   {
 		   oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
 		   Thread.sleep(2000);
 		   oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
 		   Thread.sleep(2000);
 		   oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
 		   Thread.sleep(2000);
 		   oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")).click();
 		   Thread.sleep(2000);
 	   }catch(Exception e)
 	   {
 		   e.printStackTrace();
 	   }
    }
    private static void Deletecustomer()
    {
 	   try
 	   {
 		oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")) .click();
 		Thread.sleep(2000);
 		oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")) .click();
 		Thread.sleep(2000);
 		oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")) .click();
 		Thread.sleep(2000);
 		oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")) .click();
 		Thread.sleep(2000);
 	   }catch(Exception e)
 	   {
 		   e.printStackTrace();
 	   }
    }
    private static void logout()
    {
 	   try
 	   {
 		 oBrowser.findElement(By.id("logoutLink")) .click();
 	   }catch(Exception e)
 	   {
 		  e.printStackTrace();
 	   }
    }
    private static void Closeapplication()
    {
 	   try
 	   {
 		   oBrowser.quit();
 	   }catch(Exception e)
 	   {
 		   e.printStackTrace();
 	   }
    }

}
