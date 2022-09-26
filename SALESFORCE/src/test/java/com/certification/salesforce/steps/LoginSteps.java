package com.certification.salesforce.steps;

import com.certification.salesforce.questions.LoginQuestion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static com.certification.salesforce.steps.commons.Actors.COMMON_ACTOR;
import static com.certification.salesforce.tasks.login.LoginTask.ingreso;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginSteps {

    @Dado("un usuario en la pag de salesforce")
    public void unUsuarioEnLaPagDeSalesforce() {
        COMMON_ACTOR.attemptsTo(Open.browserOn().thePageNamed("pages.salesforce"));
    }

    @Cuando("ingrese sus credenciales")
    public void ingreseSusCredenciales(List<Map<String, String>> credencial) {
        COMMON_ACTOR.attemptsTo(ingreso(credencial.get(0)));

    }

    @Entonces("debera visualizar la pagina inicial")
    public void deberaVisualizarLaPaginaInicial() {
        //withTimeoutOf(5, SECONDS).waitForPresenceOf(By.cssSelector("#elements option"))
        COMMON_ACTOR.should(seeThat(LoginQuestion.icono(), Matchers.is(true)));
    }
}
