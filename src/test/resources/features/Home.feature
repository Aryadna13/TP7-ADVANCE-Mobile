@Regression @HomePage

Feature: Home Page

  Background:
    Given ingreso los datos "automation@gmail.com" y "123456"

  @Language
  Scenario: cambio el idioma de la aplicacion
    When clickeo el boton change language
    Then cambia el lenguaje

 @LogOut
  Scenario: Log out de la aplicacion
    When clickeo el boton Log out
    Then se muestra la login page

