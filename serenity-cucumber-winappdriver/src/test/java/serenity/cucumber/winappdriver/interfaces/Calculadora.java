package serenity.cucumber.winappdriver.interfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.Serenity;
import serenity.cucumber.winappdriver.exception.NoIngresoUnNumeroCorrecto;;

public class Calculadora extends CalculadoraUI {

	private void ingresarMenuPrincipal() {
		menuPrincipal.click();
		Serenity.takeScreenshot();
	}

	public void cambiarCalculadoraCientifica() {
		find(ocho).click();
		//ingresarMenuPrincipal();
		//menuCalculadoraCientifica.click();
		//Serenity.takeScreenshot();
	}

	public void ingresarDigito(int digito) {
		switch (digito) {
		case 1:
			botonNumeroUno.click();
			break;
		case 2:
			botonNumeroDos.click();
			break;
		case 3:
			botonNumeroTres.click();
			break;
		case 4:
			botonNumeroCuatro.click();
			break;
		case 5:
			botonNumeroCinco.click();
			break;
		case 6:
			botonNumeroSeis.click();
			break;
		case 7:
			botonNumeroSiete.click();
			break;
		case 8:
			botonNumeroOcho.click();
			break;
		case 9:
			botonNumeroNueve.click();
			break;
		case 0:
			botonNumeroCero.click();
			Serenity.takeScreenshot();
			break;
		default:
			throw new NoIngresoUnNumeroCorrecto("No ingreso un digito correcto");
		}
	}

	public void operacionSuma() {
		botonSuma.click();
		Serenity.takeScreenshot();
	}

	public void realizarOperacion() {
		framePrincipal.findElement(By.id("equalButton")).click();
	}

	public String obtenerResultado() {
		return framePrincipal.findElement(By.id("CalculatorResults")).getAttribute("Name");
	}

	public void cerrarCalculadora() {
		getDriver().findElement(By.name("Cerrar Calculadora")).click();
	}

	public String obtenerSuma() {
		return resultado.getAttribute("Name");
	}
}
