package CalculatorPrueba;


import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.Keys;

import io.appium.java_client.windows.WindowsDriver;

public class ScientificTest {

	private static WindowsDriver driver;
	private static ScientificPage testpage;
	
	@BeforeClass
	public static void init()
    {
		testpage = new ScientificPage(driver);
		driver = testpage.windowsConnection();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
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
	@Test
	public void suma() {
		testpage.oprimir9();
		testpage.sendKeys("+");
		testpage.oprimir9();
		testpage.sendKeys(Keys.ENTER);
		Assert.assertEquals("18", testpage.obtenerTextoResultados());
	}
	@Test
	public void resta() {
		testpage.oprimir7();
		testpage.sendKeys(Keys.SUBTRACT);
		testpage.oprimir7();
		testpage.sendKeys(Keys.ENTER);
		Assert.assertEquals("0", testpage.obtenerTextoResultados());
	}
	
	
}
