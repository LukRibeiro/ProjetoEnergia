package suporte;

import org.junit.*;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Models extends Web{
    public WebDriver driver;


    public void Navigator(boolean headless) throws InterruptedException {
        driver = SetupDriver(headless);

    }

    public void Click_in(By _element) throws InterruptedException {
        Thread.sleep(1000);
        try {
            driver.findElement(_element).click();
        } catch (Exception e) {
            driver.quit();
            Assert.fail(e.getMessage());
        }

    }

    public void Send_keys_in(By _element, String text) throws InterruptedException {
        Thread.sleep(500);
        try {
            driver.findElement(_element).isDisplayed();
            //driver.findElement(_element).clear();
            driver.findElement(_element).sendKeys(text);
        } catch (Exception e) {
            driver.quit();
            Assert.fail(e.getMessage());
        }
    }

    public void Valide_text_in(By _element, String text) throws InterruptedException {
        Thread.sleep(1000);
        try{
            driver.findElement(_element).isDisplayed();
            String value = driver.findElement(_element).getText();
            Assert.assertEquals(text, value.trim());
        } catch (Exception e) {
            driver.quit();
            Assert.fail(e.getMessage());
        }
    }

    public void Valide_in_page(By _element) throws InterruptedException {
        Thread.sleep(500);
        Assert.assertTrue(driver.findElement(_element).isDisplayed());
    }

    public void Getpage(String _url) {
        driver.get(_url);
    }

    public void Close_Navigator() { driver.quit(); }
}
