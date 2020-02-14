package WindowsAppDriver.util;

import java.util.ArrayList;
import java.util.List;

public class SepararNumero {
	
	private SepararNumero() {}

	public static List<Integer> entero(int entero) {
		int punto = cantidadDeDigitosEnteros(entero);
		List<Integer> listaDeNumeros = new ArrayList<>();
		listaDeNumeros.add(entero % 10);

		do {
			entero = entero / 10;
			if((entero % 10) != 0  || punto != 0) {
				listaDeNumeros.add(entero % 10);
			}
			punto--;
		} while (entero != 0);

		return listaDeNumeros;
	}

	public static int cantidadDeDigitosEnteros(int numero) {
		int contador = 0;

		do {
			contador++;
			numero = numero / 10;
		} while (numero != 0);

		return contador;
	}
}