package TestGroup.Test;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestGrouping {
	
	
	//@BeforeMethod
	public void setup()
	{
		System.out.println("From TestFile1 Before Method");
	}
	
	
	@Test(groups = { "P0","Regression" })
	public void TestA()
	{
		System.out.println("TestFile1 Test case TestA");
	}

	@Test(groups = { "P1","Regression" })
	public void TestB()
	{
		System.out.println("TestFile1 Test case TestB");
	}

	
	@Test(groups = { "P2" })
	public void TestC()
	{
		System.out.println("TestFile1 Test case TestC");
	}

	
	@Test(groups = { "P0" })
	public void TestD()
	{
		System.out.println("TestFile1 Test case TestD");
	}

	
	@Test(groups = { "P1" })
	public void TestE()
	{
		System.out.println("TestFile1 Test case TestE");		
	}
	
	//@AfterMethod
	public void Teardown()
	{
		System.out.println(getCurrentTimeStamp());
	}

	public static String getCurrentTimeStamp() {
	    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");//dd/MM/yyyy
	    Date now = new Date();
	    String strDate = sdfDate.format(now);
	    return strDate;
	}
}
