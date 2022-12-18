package com.carulla.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.carulla.userInterfaces.PerfilPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PerfilCuenta implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    Click.on(BTN_CUENTA_REGISTRADA),
                    Click.on(BTN_MI_CUENTA));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static PerfilCuenta perfilCuenta() {
        return instrumented(PerfilCuenta.class);
    }
}
