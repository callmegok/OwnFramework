package Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class base {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver intializedriver() throws IOException
	{
		 prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\JAVAINSTALLATION\\NewWorkspace\\Final\\data.properties");
		prop.load(fis);
		String browserName =prop.getProperty("browser");
		
		
		if (browserName.equals("chrome"))
		{
			//execute in chrome driver
			DesiredCapabilities dc = new DesiredCapabilities().chrome();
			dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			ChromeOptions co = new ChromeOptions();
			co.merge(dc);
			

			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver.exe");
			driver=new ChromeDriver(co);
			
		}	
		else if (browserName.equals("firefox"))
		{
			//execute in firefox
			System.setProperty("webdriver.gecko.driver","C:\\Users\\gokul.udayakumar\\PycharmProjects\\libs\\geckodriver.exe");
			driver = new FirefoxDriver(); 
		}
		else if (browserName.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\gokul.udayakumar\\PycharmProjects\\libs\\IEDriverServer.exe");  
			driver=new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
}
