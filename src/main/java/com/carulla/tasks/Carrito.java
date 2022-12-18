package com.carulla.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.carulla.userInterfaces.CarritoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Carrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            WaitUntil.the(BTN_VER_CARRITO, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds();
            actor.attemptsTo(
                    Click.on(BTN_VER_CARRITO)
                    );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Carrito verCarrito() {
        return instrumented(Carrito.class);
    }
}
