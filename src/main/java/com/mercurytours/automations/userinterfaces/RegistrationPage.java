package com.mercurytours.automations.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegistrationPage {
    public static final Target REGISTRATION_LINK = Target.the("Registration link locator").locatedBy("(//a[@href='register.php'])[1]");
}
