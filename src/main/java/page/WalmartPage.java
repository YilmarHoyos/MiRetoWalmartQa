package page;

import org.openqa.selenium.By;

public class WalmartPage {

    private static By buscadorWalmart = By.xpath("//input[@class='k_a bo_b header-GlobalSearch-input mweb-Typeahead-input k_b']");    //Xpath para el buscador de walmart
    private static By btnSubmin = By.xpath("//button[@class='g_a bo_e GlobalHeaderSearchbar-submit g_c']");  //boton de busqueda
    private static By primerProducto = By.xpath("//div[@class='Grid-col u-size-22-100-l list-image-wrapper']//a[@href='/ip/Harry-Potter-Hard-Cover-Boxed-Set-Books-1-7-9780545044257/5888681']");
    private static By verificacionPrimerProducto = By.xpath("//h1[contains(text(),'Harry Potter Hard Cover Boxed Set: Books #1-7')]");
    private static By segundoProducto = By.xpath("//li[@class='Grid-col u-size-6-12 u-size-1-4-m u-size-1-5-xl search-gridview-first-col-item search-gridview-first-grid-row-item']//a[@class='product-title-link line-clamp line-clamp-2 truncate-title']");
    private static By verificacionSegundoProducto = By.xpath("//h1[@class='prod-ProductTitle prod-productTitle-buyBox font-bold']");
    private static By tercerProducto = By.xpath("//div[@class='search-result-product-title listview']//a[@href='/ip/2020-New-PlayStation-PS-5-Console-Disc-Version/172493855']");
    private static By verificacionTercerProducto = By.xpath("//h1[contains(text(),'2020 New PlayStation - PS - 5 - Console - Disc Version')]");
    private static By cuartoProducto = By.xpath("//div[@class='search-result-product-title listview']//a[@href='/ip/Umbro-Ceramica-Soccer-Ball-Size-5/343504007']");
    private static By verificacionCuartaProducto = By.xpath("//h1[contains(text(),'Umbro Ceramica Soccer Ball, Size 5')]");
    private static By quintoProducto = By.xpath("//div[@class='search-result-product-title listview']//a[@href='/ip/Wilson-Ultra-Power-XL-112-Tennis-Racket/540322263']");
    private static By verificacionQuintoProducto = By.xpath("//h1[contains(text(),'Wilson Ultra Power XL 112 Tennis Racket')]");
    private static By imagenVerigicacion = By.xpath("//button[@class='button button-primary elc-icon elc-icon-down-arrow']");



    public static By getImagenVerigicacion(){
        return imagenVerigicacion;
    }


    public static By getBuscadorWalmart() {
        return buscadorWalmart;
    }

    public static By getBtnSubmin() {
        return btnSubmin;
    }

    public static By getPrimerProducto() {
        return primerProducto;
    }

    public static By getVerificacionPrimerProducto() {
        return verificacionPrimerProducto;
    }

    public static By getSegundoProducto() {
        return segundoProducto;
    }

    public static By getVerificacionSegundoProducto() {
        return verificacionSegundoProducto;
    }

    public static By getTercerProducto() {
        return tercerProducto;
    }

    public static By getVerificacionTercerProducto() {
        return verificacionTercerProducto;
    }

    public static By getCuartoProducto() {
        return cuartoProducto;
    }

    public static By getVverificacionCuartaProducto() {
        return verificacionCuartaProducto;
    }

    public static By getQuintoProducto() {
        return quintoProducto;
    }

    public static By getVerificacionQuintoProducto() {
        return verificacionQuintoProducto;
    }
}
// Primer palabra a buscar --> harry potter hard cover boxed set: books #1-7
// Segunda palabra a buscar ----> xbox series x
// Tercer palabra a buscar ----->ps5 console
// Cuarta palabra a buscar -----> Umbro Ceramica Soccer Ball, Size 5
// Quinta palabra a buscar -----> LG 65" Class 4K UHD 2160P Smart TV 65UN6955ZUF