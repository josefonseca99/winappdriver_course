//******************************************************************************
//
// Copyright (c) 2016 Microsoft Corporation. All rights reserved.
//
// This code is licensed under the MIT License (MIT).
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
//
//******************************************************************************

import org.junit.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;
import java.net.URL;
import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;

public class CalculatorTest {

    private static WindowsDriver CalculatorSession = null;
    private static WebElement CalculatorResult = null;

    @BeforeClass
    public static void setup() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
            CalculatorSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
            CalculatorSession.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            CalculatorResult = CalculatorSession.findElementByAccessibilityId("CalculatorResults");
            Assert.assertNotNull(CalculatorResult);

        }catch(Exception e){
            e.printStackTrace();
        } finally {
        }
    }

    @Before
    public void Clear()
    {
    	CalculatorSession.getKeyboard().sendKeys(Keys.ESCAPE);
        Assert.assertEquals("0", _GetCalculatorResultText());
    }

    @AfterClass
    public static void TearDown()
    {
        CalculatorResult = null;
        if (CalculatorSession != null) {
            CalculatorSession.quit();
            
        }
        CalculatorSession = null;
    }

    @Test
    public void Addition()
    {
 
		WebElement elemento = CalculatorSession.findElementByAccessibilityId("AppName");
		
		CalculatorSession.getMouse().doubleClick(((Locatable) elemento).getCoordinates());		
		
		
    	CalculatorSession.getKeyboard().sendKeys("9874563211486351478965741236987");
    	CalculatorSession.getKeyboard().sendKeys("+");    	
    	CalculatorSession.getKeyboard().sendKeys("7539517415");
    	CalculatorSession.getKeyboard().sendKeys(Keys.ENTER);
        Assert.assertEquals("9.874.563.211.486.351.478.973.280.754.402", _GetCalculatorResultText());
    }

    @Test
    public void Combination()
    {
    	CalculatorSession.findElementByAccessibilityId("num7Button").click();
        CalculatorSession.findElementByName("Multiplicar por").click();
        CalculatorSession.findElementByAccessibilityId("num9Button").click();
        CalculatorSession.findElementByName("Más").click();
        CalculatorSession.findElementByName("Uno").click();
        CalculatorSession.findElementByName("Es igual a").click();
        CalculatorSession.findElementByName("Dividir por").click();
        CalculatorSession.findElementByName("Ocho").click();
        CalculatorSession.findElementByName("Es igual a").click();
        Assert.assertEquals("8", _GetCalculatorResultText());
        
    }

    @Test
    public void Division()
    {
        CalculatorSession.findElementByName("Ocho").click();
        CalculatorSession.findElementByName("Ocho").click();
        CalculatorSession.findElementByName("Dividir por").click();
        CalculatorSession.findElementByName("Uno").click();
        CalculatorSession.findElementByName("Uno").click();
        CalculatorSession.findElementByName("Es igual a").click();
        Assert.assertEquals("8", _GetCalculatorResultText());
    }

	@Test
    public void Multiplication()
    {
		CalculatorSession.findElementByName("Nueve").click();
        CalculatorSession.findElementByName("Multiplicar por").click();
        CalculatorSession.findElementByName("Nueve").click();
        CalculatorSession.findElementByName("Es igual a").click();
        Assert.assertEquals("81", _GetCalculatorResultText());
    }

    @Test
    public void Subtraction()
    {
        CalculatorSession.findElementByName("Nueve").click();
        CalculatorSession.findElementByName("Menos").click();
        CalculatorSession.findElementByName("Uno").click();
        CalculatorSession.findElementByName("Es igual a").click();
        Assert.assertEquals("8", _GetCalculatorResultText());
    }

    protected String _GetCalculatorResultText()
    {
        // trim extra text and whitespace off of the display value
        return CalculatorResult.getText().replace("La pantalla muestra", "").trim();
    }

}
