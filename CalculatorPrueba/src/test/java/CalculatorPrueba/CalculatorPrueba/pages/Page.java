package CalculatorPrueba.CalculatorPrueba.pages;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;

/**
 * Abstract class representation of a Page in the UI. Page object pattern
 */
public abstract class Page {

  protected WindowsDriver<WindowsElement> driver;

  /*
   * Constructor injecting the WebDriver interface
   * 
   * @param webDriver
   */
  public Page(WindowsDriver<WindowsElement> driver) {
    this.driver = driver;
  }

  public String getTitle() {
    return driver.getTitle();
  }

}
