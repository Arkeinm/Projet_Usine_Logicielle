Feature: Greeting
  Scenario: Greeting returns deployed message
    Given a name "Alice"
    When I ask for a greeting
    Then the response contains "déployée"
