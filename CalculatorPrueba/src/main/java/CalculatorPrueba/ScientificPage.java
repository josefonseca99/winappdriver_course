package CalculatorPrueba;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.*;
import io.appium.java_client.windows.WindowsDriver;


/**
 * Sample page
 */
public class ScientificPage extends Page{
	
	
	public ScientificPage(WindowsDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	By nueve = By.name("Nueve");
	By limpiar = By.name("Borrar");
	By ocho = By.xpath("//Button[@AutomationId='num8Button']");
	By result = By.xpath("//Text[@AutomationId='CalculatorResults']");
	WebElement siete = 

	

  public void oprimir9() {
	 click(nueve);
  }
  
  public void oprimir8() {
		 click(ocho);
	  }
  public void oprimir7() {
		 siete.click();
	  }
  
  public void borrar() {
	  click(limpiar);
  }
  
  public String obtenerTextoResultados() {
	  return getText(result).replace("La pantalla muestra", "").trim();
  }

}
