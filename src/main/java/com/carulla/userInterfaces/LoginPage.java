package com.carulla.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

//Extendendemos de pageObject para utilizar la etiqueta .Open Defaul
@DefaultUrl("https://www.carulla.com/")
public class LoginPage extends PageObject {
//target -> Descripcion mayor de los localizadores
    public static final Target BTN_CUENTA = Target.the("click al boton cuenta").located(By.xpath("//span[@class='vtex-menu-2-x-styledLinkIcon vtex-menu-2-x-styledLinkIcon--header-link mh2']"));
    public static final Target BTN_LOGUEARSE = Target.the("click a la opcion email y contraseña").located(By.xpath("//div[@class='vtex-login-2-x-button vtex-login-2-x-emailPasswordOptionBtn']"));
    public static final Target TXT_CORREO = Target.the("ingresar correo").located(By.xpath("//input[@class='vtex-styleguide-9-x-input ma0 border-box vtex-styleguide-9-x-hideDecorators vtex-styleguide-9-x-noAppearance br2   w-100 bn outline-0 bg-base c-on-base b--muted-4 hover-b--muted-3 t-body ph5 ']"));
    public static final Target TXT_CONTRASENA = Target.the("ingresar contraseña").located(By.xpath("(//*[@class='vtex-styleguide-9-x-input ma0 border-box vtex-styleguide-9-x-hideDecorators vtex-styleguide-9-x-noAppearance br2  br-0 br--left  w-100 bn outline-0 bg-base c-on-base b--muted-4 hover-b--muted-3 t-body pl5 '])[2]"));
    public static final Target BTN_ENTRAR = Target.the("click al boton entrar").located(By.xpath("//button[@class='vtex-button bw1 ba fw5 v-mid relative pa0 lh-solid br2 min-h-small t-action--small bg-action-primary b--action-primary c-on-action-primary hover-bg-action-primary hover-b--action-primary hover-c-on-action-primary pointer ']"));



}
