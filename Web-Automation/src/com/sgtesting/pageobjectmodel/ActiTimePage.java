package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}

	//WebElement for username text field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//WebElement for password text field
	private WebElement pwd;

	public WebElement getPassword()
	{
		return pwd;
	}

	//WebElement for login button
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement oLogin;

	public WebElement getLogin()
	{
		return oLogin;
	}

	//WebElement for FlyOutWindow
	private WebElement gettingStartedShortcutsPanelId;

	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}

	//WebElement for Create User
	@FindBy(xpath = "//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")
	private WebElement ouser;

	public WebElement getuser()
	{
		return ouser;
	}

	//WebElement for add User
	@FindBy(xpath ="//*[@id='createUserDiv']/div/div[2]")
	private WebElement oadd;

	public WebElement getadd()
	{
		return oadd;
	}
	
	//WebElement for firstname
	private WebElement firstName;
	
	public WebElement getfirstname()
	{
		return firstName;
	}
	
	//webelement for lastname
	private WebElement lastName;
	public WebElement getlastname()
	{
		return lastName;
	}
	
	//webelement for email
	private WebElement userDataLightBox_emailField;
	public WebElement getemail()
	{
		return userDataLightBox_emailField;
	}
	
	//webelement for username
	private WebElement userDataLightBox_usernameField;
	public WebElement getusername()
	{
		return userDataLightBox_usernameField;
	}
	
	//webelement for password
	private WebElement userDataLightBox_passwordField;
	public WebElement getpassword()
	{
		return userDataLightBox_passwordField;
	}
	
	//webelement for retypepassword
	private WebElement passwordCopy;
	public WebElement getretypepassword()
	{
		return passwordCopy;
	}
	
	//webelement for createuserbutton
	@FindBy(xpath = "//*[@id='userDataLightBox_commitBtn']/div/span")
	private WebElement createuser;
	public WebElement getcreateuser()
	{
		return createuser;
	}
	
	//webelement for change first name
	private WebElement userDataLightBox_firstNameField;
	public WebElement getchangename()
	{
		return userDataLightBox_firstNameField;
	}
	
	//webelement for modifyuser
	@FindBy(xpath = "//*[@id='userDataLightBox_commitBtn']/div/span")
	private WebElement modifyuser;
	public WebElement getmodifyuser()
	{
		return modifyuser;
	}
	
	//webelement for clickon username to delete
	@FindBy(xpath = "//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement delete;
	public WebElement getdelete()
	{
		return delete;
	}
	
	//webelement for delete user
	@FindBy(xpath = "//*[@id='userDataLightBox_deleteBtn']")
	private WebElement deleteuser;
	public WebElement getdeleteuser()
	{
		return deleteuser;
	}
	
	//webelement for click tasks
	@FindBy(xpath = "//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[1]")
	private WebElement clicktask;
	public WebElement getClickTask()
	{
		return clicktask;
	}
	
	
	//webelement for create addnew customer
	@FindBy(xpath = "//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement addnew;
	public WebElement getaddnew()
	{
		return addnew;
	}
	
	//webelement for create customer
	@FindBy(xpath = "/html/body/div[14]/div[1]")
	private WebElement createcustomer;
	public WebElement getCreateCustomer()
	{
		return createcustomer;
	}
	
	//webelement for customer name
	private WebElement customerLightBox_nameField;
	public WebElement getCustomerName()
	{
		return customerLightBox_nameField;
	}
	
	//webelement for click on create customer
	@FindBy(xpath = "//*[@id='customerLightBox_commitBtn']/div/span")
	private WebElement clickcreatecustomer;
	public WebElement getClickCreateCustomer()
	{
		return clickcreatecustomer;
	}
	
	//webelement for click on customer setting icon
	@FindBy(xpath = "//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement clickoncustomersettingicon;
	public WebElement getsettingicon()
	{
		return clickoncustomersettingicon;
	}
	
	//webelement for modify customer click on active
	@FindBy(xpath = "//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement clickactive;
	public WebElement getclickactive()
	{
		return clickactive;
	}
	
	//webelement for click archived button
	@FindBy(xpath = "/html/body/div[23]/div[2]/div")
	private WebElement clickarchived;
	public WebElement getclickarchived()
	{
		return clickarchived;
	}
	
	
	//webelement for click action for deleting customer
	@FindBy(xpath = "//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement clickactions;
	public WebElement getclickactions()
	{
		return clickactions;
	}
	
	//webelement for deleting customer
	@FindBy(xpath = "//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")
	private WebElement clickdelete;
	public WebElement getdeletecustomer()
	{
		return clickdelete;
	}
	
	//webelement for deletepermanently
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getdeletepermanently()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	
	//webelement for click on new project
	@FindBy(xpath = "/html/body/div[14]/div[2]")
	private WebElement newproject;
	public WebElement getnewproject()
	{
		return newproject;
	}
	
	//webelement for project name
	private WebElement projectPopup_projectNameField;
	public WebElement getprojectname()
	{
		return projectPopup_projectNameField;
	}
	
	//webelement for click on create project
	@FindBy(xpath = "//*[@id='projectPopup_commitBtn']/div/span")
	private WebElement createproject;
	public WebElement getcreateproject()
	{
		return createproject;
	}
	
	//webelement for click on project setting icon
	@FindBy(xpath = "//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement projecticon;
	public WebElement getclickprojecticon()
	{
		return projecticon;
	}
	
	//webelement for delete project actions
	@FindBy(xpath = "//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement projectactions;
	public WebElement getprojectactions()
	{
		return projectactions;
	}
	
	//webelement for project delete
	@FindBy(xpath = "//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")
	private WebElement projectdelete;
	public WebElement getprojectdelete()
	{
		return projectdelete;
	}
	
	//webelement for project delete permanently
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement getprojectdeletepermanently()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}
	
	//webelement for project modify click active
	@FindBy(xpath = "//*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]")
	private WebElement projectclickactive;
	public WebElement getprojectactive()
	{
		return projectclickactive;
	}
	
	//webelement for modifyproject click archived
	@FindBy(xpath = "/html/body/div[26]/div[2]/div")
	private WebElement projectarchived;
	public WebElement getprojectarchived()
	{
		return projectarchived;
	}
	
	//WebElement for logout link
	@FindBy(linkText = "Logout")
	private WebElement oLogout;

	public WebElement getLogout()
	{
		return oLogout;
	}

}
