package com.certification.salesforce.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static com.certification.salesforce.ui.PagInicioUi.TEXTO_PAG_INICIO;

public class LoginQuestion implements Question<Boolean>{

    public Boolean answeredBy(Actor actor) {
        return Visibility.of(TEXTO_PAG_INICIO).answeredBy(actor).booleanValue();

    }

    public static LoginQuestion icono() {
        return new LoginQuestion();

    }
}
