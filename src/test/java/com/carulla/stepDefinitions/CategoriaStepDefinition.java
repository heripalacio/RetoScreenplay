package com.carulla.stepDefinitions;

import com.carulla.tasks.AgregarProducto;
import com.carulla.tasks.Carrito;
import com.carulla.tasks.Categoria;
import com.carulla.userInterfaces.*;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class CategoriaStepDefinition {
    private CarritoPage carritoPage = new CarritoPage();
    private AgregarProductoPage agregarProductoPage = new AgregarProductoPage();
    private CategoriaPage categoriaPage = new CategoriaPage();
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor heriberto = Actor.named("heriberto");

    @Before
    public void configuracion() {
        //el actor heriberto puede navegar en la web
        heriberto.can(BrowseTheWeb.with(navegador));
    }

    @Dado("^el usuario se encuentre seleccionando un producto en la opcion de categoria$")
    public void elUsuarioSeEncuentreSeleccionandoUnProductoEnLaOpcionDeCategoria() {
        heriberto.attemptsTo(
                Categoria.categoriaProductos()
        );

    }


    @Cuando("^agregue tres cantidades del mismo pruducto al carro de compras luego agregue un segundo producto al carrito$")
    public void agregueTresCantidadesDelMismoPruductoAlCarroDeComprasLuegoAgregueUnSegundoProductoAlCarrito() {
        //heriberto.attemptsTo(AgregarProducto.agregarProducto());
    }

    @Cuando("^ingrese al carro de compras para eliminar los productos$")
    public void ingreseAlCarroDeComprasParaEliminarLosProductos() {
       // heriberto.attemptsTo(Carrito.verCarrito());
    }

    @Entonces("^el usuario visualizara el carrito de compras vacio$")
    public void elUsuarioVisualizaraElCarritoDeComprasVacio() {

    }



}
