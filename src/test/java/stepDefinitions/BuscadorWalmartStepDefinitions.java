package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import steps.WalmartSteps;

public class BuscadorWalmartStepDefinitions {

    @Steps
    WalmartSteps walmartSteps = new WalmartSteps();

    @Given("^que me encuentro en la pagina de walmart$")
    public void queMeEncuentroEnLaPaginaDeWalmart() {

        SeleniumWebDriver.ChromeWebDriver("https://www.walmart.com/");

    }

    @When("^busco diferentes productos en el buscador$")
    public void buscoDiferentesProductosEnElBuscador() {
        walmartSteps.buscarProductoEnWalmart();
        walmartSteps.buscarPalabra1EnWalmart("");
        walmartSteps.buscarPalabra2EnWalmart("");
        walmartSteps.buscarPalabra3EnWalmart("");
        walmartSteps.buscarPalabra4EnWalmart("");
        walmartSteps.buscarPalabra5EnWalmart("");



    }

    @Then("^podre ver los productos buscados$")
    public void podreVerLosProductosBuscados() {

        SeleniumWebDriver.driver.quit();

    }
}
