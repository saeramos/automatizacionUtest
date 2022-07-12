# Autor: Sergio Andres Escobar Ramos
# language: en

@Utest
  Feature: Automation of registration form in utest.com
    As enter the page utest.com and test the registration of a new user

  @SuccessfulRegister
  Scenario Outline: Register new users in the form
    Given Sergio proceeds to open the page utest
    When He enter the necessary data to proceed with the registration
      | first_name  | last_name  |  email    | city  |  postalcode  |
      | <first_name>| <last_name>|  <email>  |<city> | <postalcode> |
    And Proceed to enter the device data in the registration form
      | computer    | version    | language   | mobile   | model   | system   |
      | <computer>  | <version>  | <language> | <mobile> | <model> | <system> |
    And Enter the password for the user to register
      | password  |
      | <password>|
    Then validate successful registration message

    Examples:
      | first_name  | last_name | email                | city     | postalcode | password       | computer  | version          | language | mobile | model         | system        |
      | Sergio      |  Escobar  | pruebas929995@gmail.com | Monteria | 230003     | Choucair@2022* | Windows   | Windows 10 Home  | Spanish  | Apple  | iPhone 13 Pro | iOS 15.6 Beta |
