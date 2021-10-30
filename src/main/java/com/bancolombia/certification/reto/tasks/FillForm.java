package com.bancolombia.certification.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;

import static com.bancolombia.certification.reto.iserinterfaces.FillFormPage.*;

public class FillForm implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Juan David").into(NOMBRES),
                Enter.theValue("Sepulveda").into(APELLIDOS),
                Enter.theValue("juanda@reto.com").into(EMAIL),
                SendKeys.of("February").into(MES_NACIDO),
                SendKeys.of("12").into(DIA_NACIDO),
                SendKeys.of("1985").into(ANIO_NACIDO),
                Enter.theValue("Bulgarian").into(LENGUAJE),
                Click.on(SIGUIENTE1)
        );
    }

    public static FillForm whithDates(){
        return Tasks.instrumented(FillForm.class);

    }
}
