package com.certification.salesforce.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidateLoginTask implements Task {

    public final String texto;

    public ValidateLoginTask(String texto) {
        this.texto = texto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ValidateLoginTask.ingresoCorrecto(texto)
        );
    }


    public static ValidateLoginTask ingresoCorrecto(String texto){
        return instrumented(ValidateLoginTask.class, texto);
    }
}
