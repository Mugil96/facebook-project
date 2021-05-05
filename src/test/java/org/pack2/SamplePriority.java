package org.pack2;

import org.testng.annotations.Test;

public class SamplePriority {
@Test 
public void tc0() {
System.out.println("Test 1");
}
@Test(priority=3)
public void tc1() {
System.out.println("Test 2");
}
@Test(enabled=false)
public void tc2() {
System.out.println("Test 3");
}
@Test()
public void tc3() {
System.out.println("Test 4");
}
@Test(priority=-5)
public void tc4() {
System.out.println("Test 5");
}
@Test(priority=-4)
public void tc5() {
System.out.println("Test 6");
}
}
