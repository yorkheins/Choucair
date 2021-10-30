package com.bancolombia.certification.reto.questions;

import com.bancolombia.certification.reto.iserinterfaces.TheMessagePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheWelcomeMessage implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TheMessagePage.MESSAGE).viewedBy(actor).asString();
    }

    public static TheWelcomeMessage onThePage(){
        return new TheWelcomeMessage();
    }
}
