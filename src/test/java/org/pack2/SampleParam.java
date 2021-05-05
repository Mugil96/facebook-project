package org.pack2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleParam {
	
	@Parameters({"username","password"})
	@Test
	private void tc0(String s1, String s2) {
	System.out.println(s1);
	System.out.println(s2);
	}
	}


