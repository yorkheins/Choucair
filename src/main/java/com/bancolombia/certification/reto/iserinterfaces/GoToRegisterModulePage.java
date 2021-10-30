package com.bancolombia.certification.reto.iserinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class GoToRegisterModulePage {

    public static final Target IR_A_REGISTRARSE =Target.the("Ir a registro")
            .locatedBy("//a[contains(text(), 'Become a uTester')]");

}
