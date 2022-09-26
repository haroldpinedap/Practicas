package com.certification.salesforce.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PagInicioUi {
    public static final Target TEXTO_PAG_INICIO = Target.the("Span en la pagina de inicio")
            .locatedBy("span[data-aura-rendered-by='3:201;a']");

}
