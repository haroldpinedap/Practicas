package com.certification.salesforce.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class GetTextElementQuestion implements Question<String> {


    private final Target target;

    public GetTextElementQuestion(Target target) {
        this.target = target;
    }

    public static GetTextElementQuestion from(Target target){
        return new GetTextElementQuestion(target);
    }


    @Step("{0} Obtiene el texto del campo: #target")
    @Override
    public String answeredBy(Actor actor) {
        return target.getCssOrXPathSelector();
    }

}
