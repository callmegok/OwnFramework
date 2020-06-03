package Home;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Testing.base;

public class Assertion extends base {

	@BeforeTest
	public void initialize() throws IOException
	{
		driver=intializedriver();
		driver.get(prop.getProperty("passport"));
		driver.manage().window().maximize();
	}
	@Test
	public void basepage() throws IOException
	{
		
		
		delete de= new delete(driver);
		String war=de.getWarning().getText();
		Assert.assertEquals(war, "This is a privately-owned application. Unauthorized access or use is a crime under U.S. federal and state laws. Access is restricted to users specifically authorized to have access to this system for approved purposes. This system has security facilities to prevent and record unauthorized access attempts.");
			
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	
}
	