@regresion

  Feature:Verificar el diligenciamiento del formulario de registro

    yo como usuario quiero ingresar a utest para realizar el proceso de registro de usuario nuevo

  @scenario1
   Scenario: diligenciamiento exitoso de datos personales

    Given que andrea ingresa a la app utest
    And da click en el boton Join Today
    And ingresa su first name
    And ingresa last name
    And ingresa email address
    And ingresa su date of birth
    And selecciona el lenguaje
    When da click en el boton next location
    Then verifica que lo direcciona a los datos de ubicacion





