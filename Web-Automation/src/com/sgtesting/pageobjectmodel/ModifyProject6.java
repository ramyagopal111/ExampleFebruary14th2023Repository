package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyProject6 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		Login();
		minimizeFlyOut();
		CreateCustomer();
		CreateProject();
		ModifyProject();
		DeleteProject();
		DeleteCustomer();
		Logout();
		closeApp();

	}
	
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
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
	
	private static void Login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyOut()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void CreateCustomer()
	{
		try
		{
			oPage.getClickTask().click();
			Thread.sleep(2000);
			oPage.getaddnew().click();
			Thread.sleep(2000);
			oPage.getCreateCustomer().click();
			Thread.sleep(2000);
			oPage.getCustomerName().sendKeys("SG Testing");
			oPage.getClickCreateCustomer().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void CreateProject()
	{
		try
		{
			oPage.getaddnew().click();
			Thread.sleep(2000);
			oPage.getnewproject().click();
			Thread.sleep(2000);
			oPage.getprojectname().sendKeys("Online voting sysytem");
			oPage.getcreateproject().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void ModifyProject()
	{
		try
		{
			oPage.getclickprojecticon().click();
			Thread.sleep(2000);
			oPage.getprojectactive().click();
			oPage.getprojectarchived().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void DeleteProject()
	{
		try
		{
			oPage.getprojectactions().click();
			oPage.getprojectdelete().click();
			oPage.getprojectdeletepermanently().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void DeleteCustomer()
	{
		try
		{
			oPage.getsettingicon().click();
			Thread.sleep(2000);
			oPage.getclickactions().click();
			Thread.sleep(2000);
			oPage.getdeletecustomer().click();
			Thread.sleep(2000);
			oPage.getdeletepermanently().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void Logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApp()
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
