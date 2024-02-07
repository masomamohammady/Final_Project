@Regression
    Feature:  validate login page
      Background: login functionality test
      Given click on login button

@PostitiveTesting
      Scenario: (positive testing) login with valid credential
        And enter username as "supervisor"
        And enter password as "tek_supervisor"
        Then click sign in button
        And user navigate to "Customer Service Portal"

@NegativeTesting
      Scenario: (Negative testing) login with invalid password
        And enter username as "sajad.ahmadi@gmail.com"
        And enter password as "supervisor"
        Then click sign in button
        And display error message with invalid password


        Scenario: (Negative testing) login with invalid username
          And enter username as "tek_sajad"
          And enter password as "tek_supervisor"
          Then click sign in button
          And display error message with invalid username


