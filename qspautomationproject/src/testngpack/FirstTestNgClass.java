package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNgClass {

	@Test
	public void method1()
	{
		Reporter.log("method 1 executed");
	}
	
	@Test
	public void method2()
	{
		Reporter.log("method 2 executed");
	}
	@Test
	public void method3()
	{
		Reporter.log("method 3 executed");
	}
	@Test
	public void method4()
	{
		int i=0;
		int result=9/i;
		System.out.println(result);
		Reporter.log("method 4 executed");
	}
	@Test
	public void method5()
	{
		Reporter.log("method 5 executed");
	}
}
