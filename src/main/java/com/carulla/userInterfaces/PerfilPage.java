package com.carulla.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PerfilPage {
    public static final Target BTN_CUENTA_REGISTRADA = Target.the("ingresar al boton cuenta registrada").located(By.xpath("//div[@class='exito-login-4-x-greetingsContainer']"));
    public static final Target BTN_MI_CUENTA = Target.the("click al boton mi cuenta").located(By.xpath("(//div[@class='vtex-menu-2-x-styledLinkContent vtex-menu-2-x-styledLinkContent--login-modal-link flex justify-between nowrap'])[1]"));
    public static final Target MSJ_VALIDACION = Target.the("validacion de perfil").located(By.xpath("//div[@class='vtex-my-account-1-x-userGreeting f4 fw3 nowrap']"));

}
