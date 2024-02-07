@Regression
Feature: validate plans page
  Background:
    Given click on login button
    And enter username as "supervisor"
    And enter password as "tek_supervisor"
    Then click sign in button
    When click on plans button

  Scenario: validate 4 row of data is present
    Then validate 4 rows of data is present

    Scenario: validate create date and expire date
      Then validate create date
      And validate expire date