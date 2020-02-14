package WindowsAppDriver.driver;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import WindowsAppDriver.exception.FallaInstanciaDriver;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.windows.WindowsDriver;

public class CustomWindowDriver implements DriverSource {

	public CustomWindowDriver() {
		super();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public WebDriver newDriver() {

		try {
			
			EnvironmentVariables vA = Injectors.getInjector().getInstance(EnvironmentVariables.class);
			String app = EnvironmentSpecificConfiguration.from(vA).getProperty("windows.program.path");						
			DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", app);          
            WindowsDriver driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);   
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            return driver;
            
			
		} catch (IOException e) {
			throw new FallaInstanciaDriver("No se pudo instanciar el driver $", e);
		}
	}

	@Override
	public boolean takesScreenshots() {
		return true;
	}
}