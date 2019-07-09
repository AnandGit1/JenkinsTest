package TestGroup.Test;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFile2 {
	
	
	//@BeforeMethod
	public void setup()
	{
		System.out.println("From TestFile2 Before Method");
	}
	
	
	@Test
	public void TestA()
	{
		System.out.println("TestFile2 Test case TestA");
	}

	/*@Test
	public void TestB()
	{
		System.out.println("TestFile2 Test case TestB");
	}

	
	@Test
	public void TestC()
	{
		System.out.println("TestFile2 Test case TestC");
	}

	
	@Test
	public void TestD()
	{
		System.out.println("TestFile2 Test case TestD");
	}

	
	@Test
	public void TestE()
	{
		System.out.println("TestFile2 Test case TestE");		
	}*/
	
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
