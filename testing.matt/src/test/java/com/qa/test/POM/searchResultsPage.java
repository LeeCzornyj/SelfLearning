package com.qa.test.POM;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class searchResultsPage {

	@FindBy(xpath = "//*[@id=\"body-section\"]/div[1]/div/div/div[2]/div")
	private WebElement resultsHeader;
	
	@FindBy(xpath = "//*[@id=\"body-section\"]/div[5]/div[3]/div/table/tbody/tr/td")
	private WebElement resultsTable;
	
	@FindBy(xpath = "//*[@id=\"body-section\"]/div[5]/div[3]/div/")
	private WebElement selectHotel;
	
	
	public void checkResultsAreCorrect() {
		assertTrue(resultsHeader.getText().contains("London"));
		assertTrue(resultsHeader.getText().contains("24/04/2018"));
		assertTrue(resultsHeader.getText().contains("26/04/2018"));
	}
	
	public void getAllResults() {	
		resultsTable.getSize();
		//Ideally, here i'd split it into maybe an file, with each element in the table containing individual data.
		//This would allow to track down specific hotels based on a criteria
		
	}
	
	
}
