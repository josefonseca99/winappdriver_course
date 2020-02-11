package serenity.cucumber.winappdriver.hook;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.File;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;

public class ServidorWAP {

	private Process proceso;
	private EnvironmentVariables variablesDeAmbiente = Injectors.getInjector().getInstance(EnvironmentVariables.class);

	@Before
	public void iniciarServidorWinium() throws IOException, InterruptedException {
		String directorio = EnvironmentSpecificConfiguration.from(variablesDeAmbiente).getProperty("servidor.winappdriver.path");
		ProcessBuilder constructor = new ProcessBuilder(new File(directorio).getAbsolutePath());
		proceso = constructor.start();
		proceso.waitFor(3, TimeUnit.SECONDS);
		
	}

	@After
	public void terminarServidorWAP() {
		proceso.destroy();
	}
}