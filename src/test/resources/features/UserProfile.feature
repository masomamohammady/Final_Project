@Regression
Feature: validating user profile page
  Background:
    Given click on login button
    And enter username as "supervisor"
    And enter password as "tek_supervisor"
    Then click sign in button
    When click on profile button

  Scenario:  validate information is in Profile Side Drawer is correct
    Then validate information in profile side drawer

  Scenario: validate log out button
    Then click on log out button and navigate to homepage


