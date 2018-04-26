package com.qa.test.TestingUtils;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mouseControls {

	//	Actions mouseBuilder = new Actions(x.driver);
	WebElement element;
	Select dropdown;
	Dimension dropdownSize;
	Random rnd = new Random();
	
	public void moveMouseBy(int a, int b, WebDriver x) {
		Actions mouseBuilder = new Actions(x);
		element = (new WebDriverWait(x, 10)).until(ExpectedConditions
				.presenceOfElementLocated(By.id("draggable")));
		
		WebElement box = x.findElement(By.xpath("//*[@id=\"draggable\"]"));
		
//		mouseBuilder.moveByOffset(x.findElement(By.xpath("//*[@id=\"draggable\"]")).getLocation().x,
//				x.findElement(By.xpath("//*[@id=\"draggable\"]")).getLocation().y)
//		.clickAndHold().moveByOffset(a, b).perform();
		mouseBuilder.dragAndDropBy(box, a, b).perform();
	}

	public void dragAndDrop(WebDriver x) {
		Actions mouseBuilder = new Actions(x);	
		element = (new WebDriverWait(x, 10)).until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//*[@id=\"draggableview\"]/p")));
		mouseBuilder.dragAndDrop(x.findElement(By.xpath("//*[@id=\"draggableview\"]/p")), 
				x.findElement(By.xpath("//*[@id=\"droppableview\"]")))
		.perform();
	}
	
	
	public void registration(WebDriver x) {
		
	x.findElement(By.id("name_3_firstname")).sendKeys("Lee");
	x.findElement(By.id("name_3_lastname")).sendKeys("Czornyj");
	x.findElement(By.xpath("//*[@id=\"pie_register\"]/li[2]/div/div/input[1]")).click();
	x.findElement(By.xpath("//*[@id=\"pie_register\"]/li[3]/div/div/input[1]")).click();
	
	dropdown = new Select(x.findElement(By.id("dropdown_7")));
	dropdownSize = x.findElement(By.id("dropdown_7")).getSize();
	dropdown.selectByIndex(rnd.nextInt(dropdownSize.height+1));
	
	dropdown = new Select(x.findElement(By.id("mm_date_8")));
	dropdownSize = x.findElement(By.id("mm_date_8")).getSize();
	System.out.println(dropdownSize.height);
	dropdown.selectByIndex(rnd.nextInt(dropdownSize.height+1));
	
	dropdown = new Select(x.findElement(By.id("dd_date_8")));
	dropdownSize = x.findElement(By.id("dd_date_8")).getSize();
	dropdown.selectByIndex(rnd.nextInt(dropdownSize.height+1));
	
	dropdown = new Select(x.findElement(By.id("yy_date_8")));
	dropdownSize = x.findElement(By.id("yy_date_8")).getSize();
	dropdown.selectByIndex(rnd.nextInt(dropdownSize.height+1));
	
	x.findElement(By.id("phone_9")).sendKeys("0123456789");
	x.findElement(By.id("username")).sendKeys("MattWantsToGiveMeAnAmazingReview");
	x.findElement(By.id("email_1")).sendKeys("amazingReview@lee.com");
	x.findElement(By.id("profile_pic_10")).sendKeys("C:\\Users\\lee\\Desktop\\MEMES\\emperor-639230.jpg");
	x.findElement(By.id("description")).sendKeys("Hello Matt, join me and together we shall rule the galaxy!!");
	x.findElement(By.id("password_2")).sendKeys("password");
	x.findElement(By.id("confirm_password_password_2")).sendKeys("password");
	assertTrue(x.findElement(By.xpath("//*[@id=\"piereg_passwordStrength\"]")).getText().contains("Very weak"));
	
	x.findElement(By.xpath("//*[@id=\"pie_register\"]/li[14]/div/input")).click();
	
	element = (new WebDriverWait(x, 10)).until(ExpectedConditions
			.presenceOfElementLocated(By.xpath("//*[@id=\"post-49\"]/div/p")));

	if(x.findElement(By.xpath("//*[@id=\"post-49\"]/div/p")).getText().contains("Error")) {
		System.out.println("User already in the system");
		assertTrue(x.findElement(By.xpath("//*[@id=\"post-49\"]/div/p")).getText().contains("Error"));
		
	} else {
		System.out.println("Congratulations");
		assertTrue(x.findElement(By.xpath("//*[@id=\"post-49\"]/div/p")).getText().contains("Success"));
	}
			
	}
}
