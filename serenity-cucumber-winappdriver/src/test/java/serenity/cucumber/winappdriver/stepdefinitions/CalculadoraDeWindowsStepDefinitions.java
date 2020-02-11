package serenity.cucumber.winappdriver.stepdefinitions;

import net.thucydides.core.annotations.Steps;
import serenity.cucumber.winappdriver.steps.OperacionBasicaStep;
import io.cucumber.java.es.Dado;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class CalculadoraDeWindowsStepDefinitions {

	@Steps
	OperacionBasicaStep calculadoraStep;

	@Dado("la calculadora esta en modo Científico")
	public void laCalculadoraEstaEnModoCientifico() {
		calculadoraStep.modoCalculadoraCientifica();
	}

	@Cuando("se realiza la suma de {int} mas {int}")
	public void seRealizaLaSumaDeMas(Integer sumandoUno, Integer sumandoDos) {
		calculadoraStep.realizarSuma(sumandoUno, sumandoDos);
	}

	@Entonces("se verifica que el resultado de la suma es {int}")
	public void seVerificaQueElResultadoDeLaSumaEs(Integer total) {
		calculadoraStep.verificarLaSumaTotal(total);
	}
}
