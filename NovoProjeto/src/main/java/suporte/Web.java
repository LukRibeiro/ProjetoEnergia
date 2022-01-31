package suporte;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web {
	public static WebDriver createChrome() {
		
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\p-lucribeiro\\Drivers\\chromedriver_92\\chromedriver.exe");
		
	//	System.setProperty("webdriver.chrome.driver", "src/main/java/suporte/chromedriver.exe");

			
			
			// Desmarcar essas op��es abaixo para poder usar Headless
			
				ChromeOptions options = new ChromeOptions();
			//	options.addArguments("--headless");
			
				
			

			
			
			// comando para poder usar o Webdriver manager
			
					//WebDriverManager.chromedriver().setup();
					WebDriver driver = new ChromeDriver(options);
		
		
 	
			 	//  ChromeDriver driver = new ChromeDriver(); // essa linha precisa ser comentada para usar Headless
	  
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	
	
	driver.get("https://energia-qaa.internalenv.corp/mle");
	driver.manage().window().setSize(new Dimension(1936, 1056));
	
	
	
	
	
	return driver;

	
	
}
	

}
