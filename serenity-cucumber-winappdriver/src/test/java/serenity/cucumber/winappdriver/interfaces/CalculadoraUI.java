package serenity.cucumber.winappdriver.interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class CalculadoraUI extends PageObject {

	public By ocho = By.xpath("//Button[@AutomationId='num8Button']");

	@FindBy(name = "Calculadora")
	public WebElement framePrincipal;

	@FindBy(id = "TogglePaneButton")
	public WebElement menuPrincipal;

	@FindBy(id = "Scientific")
	public WebElement menuCalculadoraCientifica;

	@FindBy(id = "num1Button")
	public WebElement botonNumeroUno;

	@FindBy(id = "num2Button")
	public WebElement botonNumeroDos;

	@FindBy(id = "num3Button")
	public WebElement botonNumeroTres;

	@FindBy(id = "num4Button")
	public WebElement botonNumeroCuatro;

	@FindBy(id = "num5Button")
	public WebElement botonNumeroCinco;

	@FindBy(id = "num6Button")
	public WebElement botonNumeroSeis;

	@FindBy(id = "num7Button")
	public WebElement botonNumeroSiete;

	@FindBy(id = "num8Button")
	public WebElement botonNumeroOcho;

	@FindBy(id = "num9Button")
	public WebElement botonNumeroNueve;

	@FindBy(id = "num0Button")
	public WebElement botonNumeroCero;

	@FindBy(id = "plusButton")
	public WebElement botonSuma;

	@FindBy(id = "CalculatorResults")
	public WebElement resultado;

}
