package com.certification.salesforce.questions;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

public class CommonQuestions {
    private CommonQuestions() {
    }

    public static void compareTextVsText(String target, String label) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(target).contains(label)
        );


    }
}
