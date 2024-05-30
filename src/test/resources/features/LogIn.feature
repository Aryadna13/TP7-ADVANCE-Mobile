@Regression @LogIn
Feature: LogIn

  Scenario Outline: Ingreso a la aplicacion con una cuenta registrada
    Given la aplicacion carga correctamente
    When ingreso los datos <email> y <password>
    Then se muestra la Home page

    Examples:
      | email                | password |
      | automation@gmail.com | 123456   |


