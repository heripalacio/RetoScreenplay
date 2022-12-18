package com.carulla.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategoriaPage {
    public static final Target BTN_MENU_CATEGORIA = Target.the("click al boton menu categoria").located(By.xpath("//button[@class='vtex-button bw1 ba fw5 v-mid relative pa0 lh-solid br2 min-h-regular t-action bg-action-primary b--action-primary c-on-action-primary hover-bg-action-primary hover-b--action-primary hover-c-on-action-primary pointer ']"));
    public static final Target BTN_CATEGORIA_TECNOLOGIA = Target.the("click a la opcion tecnologia").located(By.xpath("//li[@id='undefined-nivel2-Tecnología']"));
    public static final Target BTN_CATEGORIA_TECNOLOGIA_AUDIO = Target.the("click a la opcion audio y video").located(By.xpath("//a[@href='/tecnologia/audio-y-video']"));

    public static final Target LST_CIUDAD = Target.the("seleccionar ciudad").located(By.xpath("(//div[@class='css-yiuvdt'])[1]"));
    public static final Target LST_ALMACEN = Target.the("seleccionar almacen").located(By.xpath("(//div[@class='css-yiuvdt'])[2]"));
    public static final Target BTN_CONFIRMAR = Target.the("confirmar ubicacion").located(By.xpath("//button[@class='exito-geolocation-3-x-primaryButtonEnable']"));

}

