package com.carulla.questions;

import com.carulla.userInterfaces.PerfilPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionLogin implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {

        return PerfilPage.MSJ_VALIDACION.resolveFor(actor).isVisible();
    }


    public static Question validarPerfil() {
        return new ValidacionLogin();
    }
}
