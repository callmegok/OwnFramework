package Testing;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class Webtestng {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\SeleniumSoftware\\chromedriver.exe";
    public WebDriver driver ; 
     
     @BeforeTest
      public void launchBrowser() {
          System.out.println("launching Chrome browser"); 
          System.setProperty("webdriver.chrome.driver", driverPath);
          driver = new ChromeDriver();
      }
      @Test
      public void verifyHomepageTitle() throws InterruptedException {
          driver.get("https://google.com");
          driver.manage().window().maximize();
          Thread.sleep(8000);
     }
      @AfterTest
      public void terminateBrowser(){
          driver.close();
      }
}

