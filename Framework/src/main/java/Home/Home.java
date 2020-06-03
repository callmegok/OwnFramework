package Home;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Testing.base;

public class Home extends base {
	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=intializedriver();
		driver.get(prop.getProperty("passport"));
		driver.manage().window().maximize();
	}

	
	@Test(dataProvider="getData")
	public void basepage(String Username, String Password, String text) throws IOException
	{
		
		delete de= new delete(driver);
		de.getemail().sendKeys(Username);
		de.getPassword().sendKeys(Password);
		System.out.println(text);
		de.clickLogin().click();
		
		
	}
	
	@DataProvider
	
	public Object[][] getData()
	{
		Object[][] data = new Object[1][3];
		
		data[0][0]="admin";
		data[0][1]="admin";
		data[0][2]="admin User";
		
		
	/*	data[1][0]="dmaxwell";
		data[1][1]="admin";
		data[1][2]="Super User";  
		*/
		return data;
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
}
	