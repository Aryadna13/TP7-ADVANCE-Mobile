package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import io.cucumber.java.en.*;


public class HomeSteps extends PageSteps {


    @When("clickeo el boton change language")
    public void doChangeLanguage() {
        MobileActionManager.click(HomeConstants.CHANGE_LANGUAGE_BUTTON_LOCATOR);
    }

    @Then("cambia el lenguaje")
    public void cambiaElLenguaje() {
    }


    @When("clickeo el boton Log out")
    public void doSignOut() {
        MobileActionManager.click(HomeConstants.SIGN_OUT_BUTTON_LOCATOR);
    }


    @Then("se muestra la login page")
    public void seMuestraLaLoginPage() {

    }


}
