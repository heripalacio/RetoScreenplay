package com.carulla.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoPage {
    public static final Target BTN_VER_CARRITO = Target.the("ver carrito de compras").located(By.xpath("//a[@class='exito-header-3-x-minicartLink']"));
}
