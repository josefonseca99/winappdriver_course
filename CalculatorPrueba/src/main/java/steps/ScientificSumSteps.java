package steps;


import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.ScientificPage;
import io.appium.java_client.windows.WindowsDriver;
import net.thucydides.core.annotations.Step;

public class ScientificSumSteps {

	private static WindowsDriver driver;
	private static ScientificPage testpage;
	
	public void openCalculator()
    {
		testpage = new ScientificPage(driver);
		driver = testpage.windowsConnection();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		if(!testpage.isScientMode())testpage.setScientMode();
		
    }
	
	
	@Before
    public void limpiar()
    {
    	testpage.borrar();
        Assert.assertEquals("0", testpage.obtenerTextoResultados());
    }
	@AfterClass
    public static void TearDown()
    {
        driver.quit();
    }
	@Step
	public void setNumbers() {

		testpage.oprimir9();
		testpage.sendKeys("+");
		testpage.oprimir9();
		testpage.sendKeys(Keys.ENTER);
		Assert.assertEquals("18", testpage.obtenerTextoResultados());
	}
	@Step
	public void getResult() {		
		testpage.sendKeys(Keys.ENTER);
		Assert.assertEquals("0", testpage.obtenerTextoResultados());
	}
	
	
}
