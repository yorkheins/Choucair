package com.bancolombia.certification.reto.iserinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FillFormPage {

    public static final Target NOMBRES =Target.the("Nombres").locatedBy("//input[@id='firstName']");
    public static final Target APELLIDOS =Target.the("Apellidos").locatedBy("//input[@id='lastName']");
    public static final Target EMAIL = Target.the("Correo").locatedBy("//input[@id='email']");
    public static final Target MES_NACIDO =Target.the("Mes de nacimiento").locatedBy("//select[@id='birthMonth']");
    public static final Target DIA_NACIDO =Target.the("Dia de nacimiento").locatedBy("//select[@id='birthDay']");
    public static  final Target ANIO_NACIDO =Target.the("Anio Nacimiento").locatedBy("//select[@id='birthYear']");
    public static final Target LENGUAJE = Target.the("Lenguaje").locatedBy("//input[@type='search']");
    public static final Target SIGUIENTE1=Target.the("Siguiente").locatedBy("//a[@class='btn btn-blue']");
}
