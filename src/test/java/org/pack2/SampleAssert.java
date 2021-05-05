package org.pack2;

import org.testng.annotations.Test;

public class SampleAssert {
	@Test(groups="smoke")
	public void tc0() {
    System.out.println("method 1");
	}
	@Test(groups="sanity")
	public void tc1() {
    System.out.println("method 2");
	}
	@Test(groups="reg")
	public void tc2() {
    System.out.println("method 3");
	}
	@Test(groups="sanity")
	public void tc3() {
    System.out.println("method 4");
	}
	@Test(groups="reg")
	public void tc4() {
    System.out.println("method 5");
	}
	@Test(groups="E2E")
	public void tc5() {
    System.out.println("method 6");
	}
}
