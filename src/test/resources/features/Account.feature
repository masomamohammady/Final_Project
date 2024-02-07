#Navigate to Customer Service Portal with valid CSR credentials and
# navigate to Accounts verify 5 row /page is default
  @Regression
  Feature: Verify account page
    Background:
      Given click on login button
      And enter username as "supervisor"
      And enter password as "tek_supervisor"
      Then click sign in button
      When click on accounts button

    Scenario:  navigate to Account page verify 5 rows page is default
      Then verify 5 rows page is default


#Navigate to Customer Service Portal with valid CSR credentials and navigate to Accounts change show per
# page to 10, 25, 50 and validate table records per page according to selected show per page.

  Scenario Outline: navigate to Accounts change show per page to 10, 25, 50 and
  validate table records per page according to selected show per page.
    Then validate table records per "<row>" according to selected show per page
    Examples:
    |row      |
    |10       |
    |25         |
    |50        |
