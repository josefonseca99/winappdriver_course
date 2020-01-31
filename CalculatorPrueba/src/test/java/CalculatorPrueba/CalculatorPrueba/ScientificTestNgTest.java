package CalculatorPrueba.CalculatorPrueba;

import org.junit.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.remote.DesiredCapabilities;

import CalculatorPrueba.ScientificPage;

import java.util.concurrent.TimeUnit;
import java.net.URL;
import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;

public class ScientificTestNgTest extends TestNgTestBase {

  private static WebElement resultado;

  @BeforeClass
  public void init() {
	  resultado = calculadora.findElementByAccessibilityId("CalculatorResults");
      Assert.assertNotNull(resultado);
      ScientificPage page;
      page = ScientificPage(resultado);
  }
  @Before
  public void Clear() {
	  calculadora.
  }

  @Test
  public void testHomePageHasAHeader() {
    Assert.assertFalse("".equals(homepage.header.getText()));
  }
}
