package com.actitime.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.pages.LoginPage;
import com.actitime.utility.BaseTest;

public class TC_1 extends BaseTest{
	@Test
	public void login() throws IOException, InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginMethod();
	}
}
