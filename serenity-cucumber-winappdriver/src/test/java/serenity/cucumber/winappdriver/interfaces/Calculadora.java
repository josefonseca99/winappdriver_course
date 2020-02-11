package serenity.cucumber.winappdriver.interfaces;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.Serenity;
import serenity.cucumber.winappdriver.exception.NoIngresoUnNumeroCorrecto;;

public class Calculadora extends CalculadoraUI {

	private void ingresarMenuPrincipal() {
		find(menuPrincipal).click();
		Serenity.takeScreenshot();
	}

	public void cambiarCalculadoraCientifica() {
		if(!isScientMode()) {
				ingresarMenuPrincipal();
				find(menuCalculadoraCientifica).click();
				Serenity.takeScreenshot();
		}		
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
		find(botonSuma).click();
		Serenity.takeScreenshot();
	}

	public void realizarOperacion() {
		find(botonIgual).click();
	}

	public String obtenerResultado() {
		return find(resultado).getText();
	}

	public void cerrarCalculadora() {
		getDriver().quit();
	}

	public String obtenerSuma() {
		return find(resultado).getText();
	}
	public boolean isScientMode() {	  
		  if( find(header).getText().equals("Científica"))return true;	  
		  return false;
		  }
}
