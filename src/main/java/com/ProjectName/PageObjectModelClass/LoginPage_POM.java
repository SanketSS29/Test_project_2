package com.ProjectName.PageObjectModelClass;


import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage_POM 
{
	WebDriver ldriver;
	
	
	@FindBy(xpath = "//textarea[@class='gLFyf'] ")								//elements
	WebElement Search;

	@FindBy(xpath = "(//input[@value='Google Search'])[1]")
	WebElement Searchbtn;
	
//	static By Searchdropdown = By.xpath("//li[@role='presentation']");
	
	@FindBy  (xpath="//li[@role='presentation']")
	List<WebElement> Searchdropdown;
	
	
	public LoginPage_POM(WebDriver rdriver)										//constructor
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	public void searchValue(String name)										//Methods
	{
		Search.sendKeys(name);
	}
	
	public void clickButton()
	{
		Searchbtn.click();
	}
	
	public String getText() 
	{
		String text = Search.getText();
		return text;
	}
	
	public void getDropDown(String value)
	{
		for (int i = 0; i < Searchdropdown.size(); i++)
		{
			System.out.println(Searchdropdown.get(i).getText());
			
			if (Searchdropdown.get(i).getText().contains(value))
			{
				Searchdropdown.get(i).click();
				break;
			}
		}
	}
	
	
}


