package suporte;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebMle_Boleta {
	public static WebDriver createChrome() {
	
	
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\p-lucribeiro\\Drivers\\chromedriver_92\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	driver.get("https://energia-qaa.internalenv.corp/mle");
	driver.manage().window().setSize(new Dimension(1936, 1056));
	
	
	return driver;

	
	

	

}


}