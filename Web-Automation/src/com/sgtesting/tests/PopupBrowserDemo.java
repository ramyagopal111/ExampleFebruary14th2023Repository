package com.sgtesting.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupBrowserDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		popupbrowser();

	}
	
	private static void launchbrowser()
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
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void popupbrowser()
	{
		try
		{
			System.out.println("Before click on link,number of popups:"+getpopupscount());
			oBrowser.findElement(By.linkText("actiTIME Inc.")).click();
			System.out.println("After click on link,number of popups:"+getpopupscount());
			Thread.sleep(2000);
			if(getpopupscount()>0)
			{
				handlepopups();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static int getpopupscount() {
		int count=0;
		count=oBrowser.getWindowHandles().size()-1;
		return count;
	}
	
	private static void handlepopups()
	{
		try
		{
			String parentBrowser=oBrowser.getWindowHandle();
			System.out.println("parent browser:"+parentBrowser);
			Object childpopups[]=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<childpopups.length;i++)
			{
				String childBrowser=childpopups[i].toString();
				System.out.println("child browser:"+childpopups);
				oBrowser.switchTo().window(childBrowser);
				String title=oBrowser.getTitle();
				System.out.println("Title of child browser:"+title);
				String url=oBrowser.getCurrentUrl();
				System.out.println("url of child browser:"+url);
				Thread.sleep(2000);
				oBrowser.findElement(By.linkText("Try Free")).click();
				Thread.sleep(2000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
