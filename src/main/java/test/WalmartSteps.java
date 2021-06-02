package steps;

import driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import page.WalmartPage;
import utils.Excel;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class WalmartSteps {
    private static ArrayList<Map<String, String>> lecturaExcel = new ArrayList<Map<String,String>>();

    public void escribirEnTexto(By elemento, String texto) {
        boolean validarElemento = false;
        while (validarElemento==false){
            try {
                SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
                validarElemento = true;
            } catch (Exception e){

            }
        }
    }
    public String obtenerTexto(By elemento){
        return SeleniumWebDriver.driver.findElement(elemento).getText();
    }
    public void validarTexto(By elemento, String texto) {
        assertEquals(obtenerTexto(elemento), texto);
    }

    public void clicEnElElemento(By elemento) {  //esto es un metodo
        boolean validarElemento = false;
        while (validarElemento==false){
            try {
                SeleniumWebDriver.driver.findElement(elemento).click();
                validarElemento= true;

            } catch (Exception e){

            }
        }
    }

    public String obtenerTextoElemento(By elemento){
        boolean validarElemento = false;
        String textElemento ="";
        while (validarElemento== false){
            try {
                textElemento= SeleniumWebDriver.driver.findElement(elemento).getText();
                validarElemento=true;
                } catch (Exception e){}
        }
        return textElemento;
    }

    public void validarTextoEnPantalla(By elemento,String texto) { //lo que va en los parentecis es lo que va a recibir
        boolean validarTexto = false;
        if (obtenerTextoElemento(elemento).contains(texto)){
            validarTexto = true;
        }
        assertEquals(true, validarTexto);
    }
    public void buscarProductoEnWalmart(){
        try {
            lecturaExcel = Excel.readExcel("C:\\Users\\yilma\\OneDrive\\Escritorio\\Libro1.xlsx","Hoja1");
        } catch (IOException e){
            e.printStackTrace();
        }

    }


    public  void buscarPalabra1EnWalmart(String palabra)  {  //esto es un metodo
            buscarProductoEnWalmart();
            escribirEnTexto(WalmartPage.getBuscadorWalmart(), lecturaExcel.get(0).get("Productos"));
            clicEnElElemento(WalmartPage.getBtnSubmin());
            clicEnElElemento(WalmartPage.getPrimerProducto());
            validarTextoEnPantalla(WalmartPage.getVerificacionPrimerProducto(),"Harry Potter Hard Cover Boxed Set: Books #1-7");

        }


        public void buscarPalabra2EnWalmart(String palabra)  {  //esto es un metodo
            buscarProductoEnWalmart();
            escribirEnTexto(WalmartPage.getBuscadorWalmart(), lecturaExcel.get(1).get("Productos"));
            clicEnElElemento(WalmartPage.getBtnSubmin());
            clicEnElElemento(WalmartPage.getSegundoProducto());
            validarTextoEnPantalla(WalmartPage.getVerificacionSegundoProducto(),"Xbox Series X");

        }
        public void buscarPalabra3EnWalmart(String palabra)  {  //esto es un metodo
            buscarProductoEnWalmart();
            escribirEnTexto(WalmartPage.getBuscadorWalmart(), lecturaExcel.get(2).get("Productos"));
            clicEnElElemento(WalmartPage.getBtnSubmin());
            clicEnElElemento(WalmartPage.getTercerProducto());
            validarTextoEnPantalla(WalmartPage.getVerificacionTercerProducto(),"2020 New PlayStation - PS - 5 - Console - Disc Version");

        }
        public void buscarPalabra4EnWalmart(String palabra)  {  //esto es un metodo
            buscarProductoEnWalmart();
            escribirEnTexto(WalmartPage.getBuscadorWalmart(), lecturaExcel.get(3).get("Productos"));
            clicEnElElemento(WalmartPage.getBtnSubmin());
            clicEnElElemento(WalmartPage.getCuartoProducto());
            validarTextoEnPantalla(WalmartPage.getVverificacionCuartaProducto(),"Umbro Ceramica Soccer Ball, Size 5");

        }
        public void buscarPalabra5EnWalmart(String palabra)  {  //esto es un metodo
            buscarProductoEnWalmart();
            escribirEnTexto(WalmartPage.getBuscadorWalmart(), lecturaExcel.get(4).get("Productos"));
            clicEnElElemento(WalmartPage.getBtnSubmin());
            clicEnElElemento(WalmartPage.getQuintoProducto());
            validarTextoEnPantalla(WalmartPage.getVerificacionQuintoProducto(),"Wilson Ultra Power XL 112 Tennis Racket");

        }




}
// Primer palabra a buscar --> harry potter hard cover boxed set: books #1-7
// Segunda palabra a buscar ----> xbox series x
// Tercer palabra a buscar ----->ps5 console
// Cuarta palabra a buscar -----> Umbro Ceramica Soccer Ball, Size 5
// Quinta palabra a buscar -----> LG 65" Class 4K UHD 2160P Smart TV 65UN6955ZUF
/*public void stepPr2(String texto){
        escrituraBarra(Bike_Page.getBarraBusqueda(), texto);
        clickLupa(Bike_Page.getBtnLupaBuscar());
        seleccionProducto(Bike_Page.getProducto2());
        validarTexto(Bike_Page.getValidador2(),"$559.00");
        clickHome(Bike_Page.getBtnHome());
        }
*/



