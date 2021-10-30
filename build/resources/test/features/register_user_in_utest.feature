Feature: Register user in utest page
  I as utest page user
  need a register module
  to admin to the system

  Scenario: Successfull register
    Given the user is on the utest page
    And go to the register module
    When enter his dates in the module
    Then shoul see the welcome message Add your address