package com.carulla.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.carulla.userInterfaces.AgregarProductoPage.*;
import static com.carulla.userInterfaces.CategoriaPage.BTN_MENU_CATEGORIA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class AgregarProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(BTN_AGREGAR, WebElementStateMatchers.isClickable()).forNoMoreThan(20).seconds();

        try {
            actor.attemptsTo(
                    Click.on(BTN_AGREGAR),
                    Click.on(BTN_CANTIDAD),
                    Click.on(BTN_CANTIDAD)
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static AgregarProducto agregarProducto() {
        return instrumented(AgregarProducto.class);
    }
    }

