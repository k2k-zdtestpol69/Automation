Feature: BankAccount

  Scenario: money withdrawal is possible
    Given that BankAccount has 1000 PLN
    When the user withdraws 500 PLN
    Then the transaction should be processed
    And AccountBalance should be 500 PLN

  Scenario: money withdrawal is not possible
    Given that BankAccount has 1000 PLN
    When the user withdraws 1500 PLN
    Then the transaction should not be processed
    And AccountBalance should be 1000 PLN

  Scenario: withdrawal and transfer money available for user
    Given that BankAccount has 1000 PLN
    When the user withdraws 1000 PLN
    And the user transfer 2000 PLN
    And the user withdraws 500 PLN
    Then the transaction should be processed
    And AccountBalance should be 1500 PLN

  Scenario: withdrawal and transfer money not available for user
    Given that BankAccount has 2000 PLN
    When the user withdraws 1500 PLN
    And the user withdraws 1500 PLN
    Then the transaction should not be processed
    And AccountBalance should be 500 PLN