import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.*;

public class Hello {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
System.out.println("Hello World");
System.setProperty("webdriver.chrome.driver", "chromedriver");

WebDriver driver=new ChromeDriver();
//driver.getCurrentUrl();
driver.navigate().to("https://www.amazon.com/");

System.out.println("Website Hitted!!!");

driver.quit();
	}

}
