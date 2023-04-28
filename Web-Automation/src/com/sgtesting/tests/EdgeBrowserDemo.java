package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		closeapplication();

	}
	
	private static void launchbrowser()
	{
		try
		{
			oBrowser=new EdgeDriver();
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
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeapplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
