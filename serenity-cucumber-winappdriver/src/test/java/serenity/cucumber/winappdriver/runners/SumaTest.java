package serenity.cucumber.winappdriver.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		plugin = { "pretty" },
		features = "src/test/resources/features/calculadora_de_windows/OperacionesBasicas.feature",
		glue = "",
		snippets = CAMELCASE,
		monochrome = true,
		dryRun = false
	)

public class SumaTest {

}
