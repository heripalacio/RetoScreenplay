package com.carulla.tasks;

import com.carulla.utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.carulla.userInterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

//Implementamos las tasks para trabajar con la interfaz
public class Login implements Task {
    Datos datos = new Datos();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Click.on(BTN_CUENTA),
                    Click.on(BTN_LOGUEARSE),
                    Enter.theValue(datos.leerDatosExcel("RetoScreenplay.xlsx", "DatosLogin", 1, 0)).into(TXT_CORREO),
                    Enter.theValue(datos.leerDatosExcel("RetoScreenplay.xlsx", "DatosLogin", 1, 1)).into(TXT_CONTRASENA),
                    Click.on(BTN_ENTRAR));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Login informacion() {
        return instrumented(Login.class);
    }
}
