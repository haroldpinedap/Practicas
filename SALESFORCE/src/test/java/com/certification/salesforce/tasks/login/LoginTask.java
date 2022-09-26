package com.certification.salesforce.tasks.login;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;


import java.util.Map;

import static com.certification.salesforce.ui.LoginUi.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {
    private Map<String, String> credencial;

    public LoginTask(Map<String, String> credencial) {
        this.credencial = credencial;

    }


    @Override
    @Step("{0} Ingresa sus credenciales de acceso")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.keyValues(credencial.get("usuario")).into(INPUT_USER),
                Click.on(INPUT_PASS),
                Enter.keyValues(credencial.get("password")).into(INPUT_PASS),
                Click.on(BTN_LOGIN)
        );
    }
    public static LoginTask ingreso(Map<String, String> credencial){
        return instrumented(LoginTask.class,credencial);
    }

}

