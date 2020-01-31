package CalculatorPrueba.CalculatorPrueba;

import java.io.IOException;
import org.junit.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;
import java.net.URL;
import io.appium.java_client.windows.WindowsDriver;

/**
 * Base class for all the TestNG-based test classes
 */
public class TestNgTestBase {

  public static WindowsDriver calculadora =  null;

  @BeforeClass
  public void initialize() throws IOException {
	try {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
		calculadora = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
		
		calculadora.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);			
	}catch(Exception e){
		e.printStackTrace();
	}	finally {
		
	}
    
  }

  @AfterClass
  public static void TearDown()
  {
	  TestNgTestBase.calculadora.quit();
  }
}
