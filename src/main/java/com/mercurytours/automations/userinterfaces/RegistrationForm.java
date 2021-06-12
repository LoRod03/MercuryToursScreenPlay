package com.mercurytours.automations.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationForm {
    public static final Target FIRST_NAME = Target.the("First name field").locatedBy("//input[@name='firstName']");
    public static final Target LAST_NAME = Target.the("Last name field").locatedBy("//input[@name='lastName']");
    public static final Target PHONE = Target.the("Phone number field").locatedBy("//input[@name='phone']");
    public static final Target EMAIL = Target.the("Email address field").located(By.id("userName"));

    public static final Target USER_NAME = Target.the("User name field").located(By.id("email"));
    public static final Target PASSWORD = Target.the("Password field").locatedBy("//input[@name='password']");
    public static final Target CONFIRM_PASSWORD = Target.the("Confirm password field").locatedBy("//input[@name='confirmPassword']");
    public static final Target SUBMIT_BUTTON = Target.the("submit registration information").locatedBy("//input[@name='submit']");
}
