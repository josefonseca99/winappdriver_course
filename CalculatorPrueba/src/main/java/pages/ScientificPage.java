package pages;


import org.openqa.selenium.By;
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
	By siete =  By.xpath("//Button[@AutomationId='num8Button']");
	By toggleBtn = By.xpath("//Button[@AutomationId='TogglePaneButton']");
	By scientCalc = By.xpath("//ListItem[@AutomationId='Scientific']");
	By header = By.xpath("//Text[@AutomationId='Header']");
	

  public void oprimir9() {
	 click(nueve);
  }
  
  public void oprimir8() {
		 click(ocho);
	  }
  public void oprimir7() {
	 
		 click(siete);
	  }
  
  public void borrar() {
	  click(limpiar);
  }
  
  public void clickMenu() {
	  click(toggleBtn);
  }
  public void setScientMode() {
	  clickMenu();
	  click(scientCalc);
  }
  public boolean isScientMode() {	  
	  if( getText(header).equals("Científica"))return true;	  
	  return false;
  }
  public String obtenerTextoResultados() {
	  return getText(result).replace("La pantalla muestra", "").trim();
  }

}
