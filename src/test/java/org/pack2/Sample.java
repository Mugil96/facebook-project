package org.pack2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	@AfterClass
	public static void afterClass() {
    System.out.println("AfterClass");
	}
    @AfterMethod
    public void afterMethod() {
    System.out.println("AfterMethod");
	}
    @BeforeMethod
    public void beforeMethod() {
    System.out.println("BeforeMethod");
	}
    @Test
    public void tc0() {
    System.out.println("Test1");
	}

    
}
