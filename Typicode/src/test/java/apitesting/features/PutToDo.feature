Feature: Delete todos

  @apitest
  Scenario: Delete a single todo
    Given I have an endpoint
    When I put a todo request with id 25
    Then The specific todo is successfully updated