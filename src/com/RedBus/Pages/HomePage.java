package com.RedBus.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RedBus.Generic.BasePage;

public class HomePage extends BasePage
{
	@FindBy(id="gosuggest_inputSrc")
	private WebElement fromBT;
	
	
	@FindBy(id="gosuggest_inputDest")
	private WebElement toBT;
	
	@FindBy(xpath="(//input)[6]")
	private WebElement clformdBT;
	
	@FindBy(xpath="(//div[.='14'])[1]")
	private WebElement dataBt;
	
	@FindBy(xpath="(//input)[7]")
	private WebElement rtToBT;
	
	@FindBy(id="gi_search_btn")
	private WebElement GoSetBT;
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void formButton(String text)
	{
		fromBT.sendKeys(text);
	}
	
	public void toButton(String text)
	{
		toBT.sendKeys(text);
	}
	
	public void ClickDepartdata()
	{
		clformdBT.click();
	}
	
	public void clickOnData()
	{
		dataBt.click();
	}
	
	public void clickOnReturn()
	{
		rtToBT.click();
	}
	
	public void clickOnGoSetGoButton()
	{
		GoSetBT.click();
	}
}

