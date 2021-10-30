package com.bancolombia.certification.reto.iserinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TheMessagePage {
    public static final Target MESSAGE= Target.the("Mensaje bienvenida").locatedBy("//*[ contains (text(), 'Add your address')]");
}
