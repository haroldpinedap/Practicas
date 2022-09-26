package com.certification.salesforce.steps.commons;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static com.certification.salesforce.steps.commons.Actors.COMMON_ACTOR;

public class CommonHooks {
    @Managed
    WebDriver webDriver;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        COMMON_ACTOR.whoCan(BrowseTheWeb.with(webDriver));
    }

}
