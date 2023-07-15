package com.qa.saucedemo.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.qa.saucedemo.utils.BrowserUtil;
import com.qa.saucedemo.utils.ElementUtl;

public class LoginPage {

	// static WebDriver driver;

	@Test
	public static void application() {

		By username = By.name("user-name");
		By password = By.name("password");
		By Login = By.xpath("//input[@id='login-button']");
		By menu = By.xpath("//button[@id='react-burger-menu-btn']");
		By logout = By.xpath("//a[@id='logout_sidebar_link']");

		BrowserUtil brUtl = new BrowserUtil();

		WebDriver driver = brUtl.launchBrowser("edge");
		brUtl.enterURL("https://www.saucedemo.com/");
		brUtl.getPageTitle();
		brUtl.getCurrentURL();

		ElementUtl eleUtil = new ElementUtl(driver);

		eleUtil.sendKeys(username, "standard_user");
		eleUtil.sendKeys(password, "secret_sauce");
		eleUtil.doClick(Login);
		eleUtil.doClick(menu);
		eleUtil.doClick(logout);
		
		System.out.println("**********----- Login and Logout Successfully . @-------********");
		brUtl.quitBrowser();

	}

}
