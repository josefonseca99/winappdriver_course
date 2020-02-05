package serenity.cucumber.winappdriver.steps;

import org.fluentlenium.core.annotation.Page;

import net.thucydides.core.annotations.Step;
import serenity.cucumber.winappdriver.interfaces.Calculadora;

import static org.junit.Assert.assertEquals;
import static serenity.cucumber.winappdriver.util.SepararNumero.cantidadDeDigitosEnteros;
import static serenity.cucumber.winappdriver.util.SepararNumero.entero;

public class OperacionBasicaStep {

	@Page
	Calculadora calculadora;

	@Step
	public void modoCalculadoraCientifica() {
		calculadora.cambiarCalculadoraCientifica();
	}

	@Step("Se realiza la suma")
	public void realizarSuma(Integer sumandoUno, Integer sumandoDos) {
		ingresarNumero(sumandoUno);
		calculadora.operacionSuma();
		ingresarNumero(sumandoDos);
		calculadora.realizarOperacion();
	}

	@Step
	public void ingresarNumero(Integer numero) {
		for (int i = cantidadDeDigitosEnteros(numero) - 1; i >= 0; i--) {
			calculadora.ingresarDigito(entero(numero).get(i));
		}
	}

	@Step
	public void verificarLaSumaTotal(int totalEsperado) {
		int sumaTotal = Integer.parseInt(calculadora.obtenerResultado().replace("La pantalla muestra", "").replace(".", "").trim());
		calculadora.cerrarCalculadora();
		assertEquals(sumaTotal, totalEsperado);
	}
}
