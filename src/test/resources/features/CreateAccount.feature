@Smoke
Feature: validate Create Primary Account page
  Background:
    Given click on create primary account button

  Scenario: validate title of create primary account page
    Then validate title of create primary account is "Create Primary Account Holder"


    @PositiveTesting
  Scenario: (Positive Testing) fill out the form and validate sign up account page
    Then fill out create primary account holder form from Data table
    |email           | yalda14.bahar@gmail.com    |
    |firstName       | yalda                      |
    |gender          | Female                     |
    |employmentStatus| student                    |
    |title           | Mrs.                       |
    |lastName        |bahar                       |
    |maritalStatus   |Single                      |
    |dateOfBirth     |12012023                    |
    When click on create account button
      And Validate user is on 'Sign up your account'
    Then Display email must be same as entry


      @NegativeTesting
  Scenario: (Negative Testing) create account with existing email address
    Then fill out create primary account holder form from Data table with existing email
      |email                | yalda.bahar2@gmail.com    |
      |firstName            | yalda                     |
      |gender               | Female                    |
      |employmentStatus     | student                   |
      |title                | Mrs.                      |
      |lastName             |bahar                      |
      |maritalStatus        |Single                     |
      |dateOfBirth          |12012023                   |
    When click on create account button
    Then Error message should pup up "Account with email yalda.bahar2@gmail.com is exist"







