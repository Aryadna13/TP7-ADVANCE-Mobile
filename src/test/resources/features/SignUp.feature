@Regression @SignUp
Feature: Sign Up

  Scenario Outline: Registro en la aplicacion
    Given la aplicacion carga correctamente
    When clickeo el boton Sign Up
    And ingreso los datos <username>, <email>, <password>
    Then se muestra la Home page

    Examples:
      | username   | email                | password |
      | automation | automation@gmail.com | 123456   |


