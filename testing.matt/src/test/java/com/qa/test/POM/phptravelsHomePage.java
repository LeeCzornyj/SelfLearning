package com.qa.test.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.test.TestingUtils.setup;


public class phptravelsHomePage {

	
	@FindBy(xpath = "//*[@id=\"select2-drop\"]/div/input")	
	private WebElement Location;
	
	@FindBy(xpath = "//*[@id=\"dpd1\"]/input")
	private WebElement Checkin;
	
	@FindBy(xpath = "//*[@id=\"dpd2\"]/input")
	private WebElement Checkout;
	
	@FindBy(xpath ="//*[@id=\"adults\"]")
	private WebElement noOfAdults;
	
	@FindBy(xpath = "//*[@id=\"child\"]")
	private WebElement noOfChildren;
	
	@FindBy(xpath = "//*[@id=\"HOTELS\"]/form/div[3]/div[3]/button")
	private WebElement search;
	
	@FindBy(xpath = "//*[@id=\"select2-drop\"]/ul/li")
	private WebElement dropdown;
	
	setup x = new setup();
	
	public void submitValidSearch() throws InterruptedException {
	
		enterLocation("London");
		selectDateTwoDaysAfterCurrentDate();
		selectNumberOfAdults("3");
		Thread.sleep(5000);
		startSearch();		
	}
	
	public void enterLocation(String location) throws InterruptedException  {
		
		Location.sendKeys(location);
	}
	
	
	public void selectNumberOfAdults(String numbOfAdults) {
		noOfAdults.sendKeys(numbOfAdults);
	}
	
	public void selectDateTwoDaysAfterCurrentDate(){
		String selectAll = Keys.chord(Keys.SHIFT, Keys.HOME);
		Checkout.sendKeys(selectAll);
		Checkout.sendKeys(Keys.DELETE);
		Checkout.sendKeys("26/04/2018");
	}
	
	public void startSearch() {	
		search.submit();
	}
	
}
