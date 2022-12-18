package com.carulla.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarProductoPage {
    public static final Target BTN_AGREGAR = Target.the("click a la opcion jugos").located(By.xpath("(//span[contains(text(),'Agregar')])[1]"));
        public static final Target BTN_CANTIDAD = Target.the("click a la opcion jugos").located(By.xpath("//button[@class='exito-vtex-components-4-x-buttonActions exito-vtex-components-4-x-productSummaryAddToCar  product-summary-add-to-car-plus']"));

}
