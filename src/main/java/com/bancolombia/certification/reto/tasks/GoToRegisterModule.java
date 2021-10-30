package com.bancolombia.certification.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static com.bancolombia.certification.reto.iserinterfaces.GoToRegisterModulePage.*;

public class GoToRegisterModule implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(IR_A_REGISTRARSE)

        );
    }

    public static GoToRegisterModule userRegister(){
        return Tasks.instrumented(GoToRegisterModule.class);
    }

}
