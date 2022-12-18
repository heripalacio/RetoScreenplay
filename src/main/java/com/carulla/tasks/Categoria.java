package com.carulla.tasks;

import com.carulla.userInterfaces.CategoriaPage;
import com.carulla.utils.Datos;
import com.carulla.utils.ListaDesplegable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.HoverOverTarget;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.carulla.userInterfaces.CarritoPage.BTN_VER_CARRITO;
import static com.carulla.userInterfaces.CategoriaPage.*;
import static com.carulla.userInterfaces.LoginPage.TXT_CORREO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Categoria implements Task {

    ListaDesplegable listaDesplegable = new ListaDesplegable();
    Datos datos = new Datos();
    CategoriaPage categoriaPage = new CategoriaPage();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
           actor.attemptsTo(
                    Click.on(BTN_MENU_CATEGORIA),
                    Click.on(BTN_CATEGORIA_TECNOLOGIA),
                    Click.on(BTN_CATEGORIA_TECNOLOGIA_AUDIO)
                 /*   SelectFromOptions.byVisibleText(datos.leerDatosExcel("RetoScreenplay","Pedido",1,0)).from(LST_CIUDAD),
                    SelectFromOptions.byVisibleText(datos.leerDatosExcel("RetoScreenplay","Pedido",1,1)).from(LST_ALMACEN),
                    Click.on(BTN_CONFIRMAR)*/
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Categoria categoriaProductos() {
        return instrumented(Categoria.class);
    }
}
