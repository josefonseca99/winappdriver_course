package pages;

import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.windows.WindowsDriver;

public class Page {
	
	
	public WindowsDriver driver;
	
	public Page(WindowsDriver driver) {
		this.driver = driver;
	}

	public WindowsDriver windowsConnection() {
		
		
		try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
            driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
            
            

        }catch(Exception e){
            e.printStackTrace();
        } finally {
        }    		
		
		return driver;
	}
	
	public void sendKeys(String key) {
		driver.getKeyboard().sendKeys(key);
	}
	
	public void sendKeys(Keys key) {
		driver.getKeyboard().sendKeys(key);
	}
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	public WebElement findElementByAutoId(String id) {
		return driver.findElementByAccessibilityId(id);
	}
	public List<WebElement> findElements(By locator) {
		return driver.findElements(locator);
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	public void click(WebElement element) {
		element.click();
	}
	
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		}catch(org.openqa.selenium.NoSuchElementException e){
			return false;
		}
	}
}
