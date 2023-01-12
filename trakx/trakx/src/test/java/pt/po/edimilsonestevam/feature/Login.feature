@Login
Feature: Successfully Login
  I want to access Trakx Homepage

  @successfulLogin
  Scenario Outline: Successfully Login
    Given I want to access Trakx Homepage <url>
    When I inform user <user> and password <password>
    Then the system will show me the Trakx Homepage <homepage>

    Examples: 
      | url                    | user                 | password     | homepage               |
      | "dev.trakx.io/landing" | "joao+1912@trakx.io" | "Trakx@1912" | "dev.trakx.io/wallets" |