package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	@Test
	public void test1(){
	int i=10;
	
	System.out.println(i);
	
	Assert.assertEquals(110, i, "Number not matching");
	}

	@Test
	public void test2(){
		boolean j= false;
		
		System.out.println();
		Assert.assertTrue(j,"Value not match");
	}
}
