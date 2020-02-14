package WindowsAppDriver.interfaces;

import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class CalculadoraUI extends PageObject {

	
	@FindBy(xpath = "//Button[@AutomationId='num1Button']") public WebElement botonNumeroUno;
	@FindBy(xpath = "//Button[@AutomationId='num2Button']") public WebElement botonNumeroDos;
	@FindBy(xpath = "//Button[@AutomationId='num3Button']") public WebElement botonNumeroTres;
	@FindBy(xpath = "//Button[@AutomationId='num4Button']") public WebElement botonNumeroCuatro;
	@FindBy(xpath = "//Button[@AutomationId='num5Button']") public WebElement botonNumeroCinco;
	@FindBy(xpath = "//Button[@AutomationId='num6Button']") public WebElement botonNumeroSeis;
	@FindBy(xpath = "//Button[@AutomationId='num7Button']") public WebElement botonNumeroSiete;
	@FindBy(xpath = "//Button[@AutomationId='num8Button']") public WebElement botonNumeroOcho;
	@FindBy(xpath = "//Button[@AutomationId='num9Button']") public WebElement botonNumeroNueve;
	@FindBy(xpath = "//Button[@AutomationId='num0Button']") public WebElement botonNumeroCero;
	
	@FindBy(name = "Calculadora") public WebElement framePrincipal;
	
	@FindBy(xpath = "//Button[@AutomationId='TogglePaneButton']") public WebElement menuPrincipal;

	@FindBy(xpath = "//ListItem[@AutomationId='Scientific']") public WebElement menuCalculadoraCientifica;

	@FindBy(xpath = "//Button[@AutomationId='plusButton']") public WebElement botonSuma;

	@FindBy(xpath = "//Button[@AutomationId='equalButton']") public WebElement botonIgual;

	@FindBy(xpath = "//Text[@AutomationId='CalculatorResults']") public WebElement resultado;

	@FindBy(xpath = "//Text[@AutomationId='Header']") public WebElement header;
}