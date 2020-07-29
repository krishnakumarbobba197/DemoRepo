package com.qa.pages;

import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	 public LoginPage(WebDriver driver) {
		 this.driver = driver;
		 
	 }
	
	public void loginPage() {
		System.out.println("Welcome to Login page");
	}

}
