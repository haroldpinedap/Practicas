package com.certification.salesforce.ui;

import net.serenitybdd.screenplay.targets.Target;


public class LoginUi {
    public static final Target INPUT_USER = Target.the("Campo de usuario")
            .locatedBy("#username");
    public static final Target INPUT_PASS = Target.the("Campo de la contaseña")
            .locatedBy("#password");
    public static final Target BTN_LOGIN = Target.the("Boton de ingreso")
            .locatedBy("#Login");



}
