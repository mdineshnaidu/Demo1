package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dem1 {
@Test
public void CreateCustomer() {
	Reporter.log("CreateCustomer",true);
}
@Test
public void DeleteCustomer() {
	Reporter.log("DeleteCustomer",true);
}
@BeforeMethod
public void logout() {
	Reporter.log("Logout",true);
}
@AfterMethod
public void Login() {
	Reporter.log("Login",true);
}

}

