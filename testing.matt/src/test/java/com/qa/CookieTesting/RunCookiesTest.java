package com.qa.CookieTesting;

import org.openqa.selenium.WebDriver;

import com.qa.test.TestingUtils.setup;

public class RunCookiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setup x = new setup();
		//x.chromeWebDriver();
		WebDriver y = x.driver;
		CookieMethods cookiesMeth = new CookieMethods();
		cookiesMeth.login(y);
	}

}
