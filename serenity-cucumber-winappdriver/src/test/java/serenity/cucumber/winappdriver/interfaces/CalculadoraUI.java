package serenity.cucumber.winappdriver.interfaces;

import org.openqa.selenium.By;
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
	

	public By menuPrincipal = By.xpath("//Button[@AutomationId='TogglePaneButton']");

	public By menuCalculadoraCientifica = By.xpath("//ListItem[@AutomationId='Scientific']");;

	public By botonSuma = By.xpath("//Button[@AutomationId='plusButton']");
	
	public By botonIgual = By.xpath("//Button[@AutomationId='equalButton']");

	public By resultado =  By.xpath("//Text[@AutomationId='CalculatorResults']");
	
	public By header = By.xpath("//Text[@AutomationId='Header']");

}
