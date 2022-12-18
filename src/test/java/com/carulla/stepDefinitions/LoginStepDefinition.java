package com.carulla.stepDefinitions;

import com.carulla.questions.ValidacionLogin;
import com.carulla.tasks.Login;
import com.carulla.tasks.PerfilCuenta;
import com.carulla.userInterfaces.LoginPage;
import com.carulla.userInterfaces.PerfilPage;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor heriberto = Actor.named("heriberto");
    private LoginPage loginPage = new LoginPage();
    private PerfilPage perfilPage = new PerfilPage();

    @Before
    public void configuracion() {
        //el actor heriberto puede navegar en la web con el navegador
        heriberto.can(BrowseTheWeb.with(navegador));
    }

    @Dado("^el usuario se encuentre en la pagina web e ingrese al boton cuenta$")
    public void elUsuarioSeEncuentreEnLaPaginaWebEIngreseAlBotonCuenta() {
        heriberto.wasAbleTo(Open.browserOn(loginPage));
    }

    @Cuando("^registre sus datos de logueo correctamente$")
    public void registreSusDatosDeLogueoCorrectamente() {

        heriberto.attemptsTo(Login.informacion());
    }

    @Cuando("^ingrese a su perfil$")
    public void ingreseASuPerfil() {
        heriberto.attemptsTo(PerfilCuenta.perfilCuenta());
    }

    @Entonces("^visualizara su perfil de cuenta$")
    public void visualizaraSuPerfilDeCuenta() {
        heriberto.should(seeThat("el actor puede ver", ValidacionLogin.validarPerfil(), Matchers.equalTo(true)));
    }


}
