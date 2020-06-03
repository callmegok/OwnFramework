package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class delete {

	
	public WebDriver driver;
	By login=By.cssSelector("input[id='username']");
	By password=By.cssSelector("input[id='password']");
	By loginbutton=By.cssSelector("button[id='loginButton']");
	By warning=By.cssSelector("div[id='warning']");

	public delete(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement getemail() {
		// TODO Auto-generated method stub
		return driver.findElement(login);
	}
	
	public WebElement getPassword() {
		// TODO Auto-generated method stub
		return driver.findElement(password);
	}
	
	public WebElement clickLogin() {
		// TODO Auto-generated method stub
		return driver.findElement(loginbutton);
	}
	public WebElement getWarning() {
		// TODO Auto-generated method stub
		return driver.findElement(warning);
	}
	
}
