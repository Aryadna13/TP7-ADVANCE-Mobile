package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.*;


public class LoginSteps extends PageSteps {

    @And("ingreso los datos (.*) y (.*)")
    public void doLoginProcess(String email, String password) {
        LoginService.doLogin(email, password);
    }
}


