# Autor: Sergio Andres Escobar Ramos
# language: en

@Utest
  Feature: Automation of registration form in utest.com
    As enter the page utest.com and test the registration of a new user

  @SuccessfulRegister
  Scenario Outline: Register new users in the form
     Given Sergio proceeds to open the page utest
     When Enter the necessary data to proceed with the registration
      | first_name   | last_name   |    email     | city   |  postalcode   | password   | confirm_password |
      | <first_name> | <last_name> |   <email>    | <city> | <postalcode>  |<password> | <confirm_password>|
     Then validate successful registration message

    Examples:
      | first_name  | last_name | email                | city     | postalcode | password       | confirm_password |
      | Sergio      |  Escobar  | saeramos@hotmail.com | Monteria | 230003     | Choucair@2022* | Choucair@2022*   |